package streams.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataStream {
	public static void main(String[] args) {
		String filePath = "/Users/ayaulymshaimerden/eclipse-workspace/practicing/src/streams/bytestream/data.dat";
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath));
			String message = "i failed as a human, so i became dino";
			dos.write(message.getBytes());
			dos.close();
			
			DataInputStream dis = new DataInputStream(new FileInputStream(filePath));
			byte[] data = dis.readAllBytes();
			String str = new String(data);
			System.out.println(str);
			dis.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
