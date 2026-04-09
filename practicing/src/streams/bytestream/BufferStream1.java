package streams.bytestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferStream1 {

	public static void main(String[] args) {
		String filePath = "/Users/ayaulymshaimerden/eclipse-workspace/practicing/src/streams/bytestream/hello.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}