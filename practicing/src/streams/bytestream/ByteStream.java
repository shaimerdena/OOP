package streams.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStream {

	public static void main(String[] args) {
		String filePath = "/Users/ayaulymshaimerden/eclipse-workspace/practicing/src/streams/bytestream/hello.txt";
		try {
			InputStream inputStream = new FileInputStream(filePath);
			byte[] content = inputStream.readAllBytes();
			String contentStr = new String(content);
			System.out.println(contentStr);
			
			inputStream.close();
			
			String name = "Ayau";
			byte[] contentWr = name.getBytes();
			OutputStream outputStream = new FileOutputStream(filePath);
			outputStream.write(contentWr);
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
