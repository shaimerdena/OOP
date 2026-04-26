package pr5.io.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WordAnalyzer {

	public static void main(String[] args) {
		Map<String, Integer> wordCount = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
			String line;
			while((line = br.readLine()) != null){
				String[] words = line.toLowerCase().split("\\W+");
				
				for(String word: words) {
					if(!word.isEmpty()) {
						wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());
		list.sort((b, a) -> a.getValue().compareTo(b.getValue()));
		
		try (PrintWriter pw = new PrintWriter(new FileWriter("report.txt"))) {
			for(Map.Entry<String, Integer> entry: list) {
				pw.write(entry.getKey() + ": " + entry.getValue() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
