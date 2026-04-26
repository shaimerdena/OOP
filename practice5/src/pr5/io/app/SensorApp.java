package pr5.io.app;

import java.nio.file.Path;
import java.nio.file.Paths;

import pr5.io.util.SensorAnalyzer;

public class SensorApp {

	public static void main(String[] args) {
		Path filePath = Paths.get("sensor.txt");
		String absPath = filePath.toAbsolutePath().toString();
		SensorAnalyzer sa = new SensorAnalyzer();
		sa.patch(absPath, 29, 999.9);
		sa.analyze(absPath);
	}

}
