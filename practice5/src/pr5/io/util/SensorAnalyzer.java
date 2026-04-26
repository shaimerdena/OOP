package pr5.io.util;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SensorAnalyzer {
	public void patch(String filePath, int index, double num) {
		try {
			RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
			raf.seek(index * 8);
			raf.writeDouble(num);
			raf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void analyze(String filePath) {
		double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        int count = 0;
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
			while (true) {
                double value = dis.readDouble();

                sum += value;
                if (value > max) {
                    max = value;
                }
                count++;
            }
		} catch (EOFException e) {
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 

		double average = sum/count;
		System.out.println("max: " + max);
		System.out.println("average: " + average);
	}
}
