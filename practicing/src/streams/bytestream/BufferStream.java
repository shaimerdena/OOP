package streams.bytestream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferStream {

	public static void main(String[] args) {
		String data;
		try {
			BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
			data = bs.readLine();
			System.out.println(data);
			bs.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
