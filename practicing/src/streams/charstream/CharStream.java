package streams.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharStream {
	public static void main(String[] args) {
		String filePath = "/Users/ayaulymshaimerden/eclipse-workspace/practicing/src/streams/file/hello.txt";
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String data1 = br.readLine();
			System.out.println(data1);
			
			fr.close();
			br.close();
			
			FileWriter fw = new FileWriter(filePath);
			PrintWriter pw = new PrintWriter(fw);
			String data2 = "no shutdown";
			pw.write(data2);
			
			fw.close();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
