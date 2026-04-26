package pr5.io.app;

import pr5.io.util.ExpressionParser;

import java.io.*;
import java.util.NoSuchElementException;

public class ExpressionTest {

    public static void main(String[] args) {

        String inputFile = "input1.txt";
        String resultFile = "results.txt";
        String logFile = "log.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter resultWriter = new BufferedWriter(new FileWriter(resultFile));
             BufferedWriter logWriter = new BufferedWriter(new FileWriter(logFile))) {

            String line;

            while ((line = reader.readLine()) != null) {

                try {
                    double result = ExpressionParser.parseAndCalculate(line);
                    resultWriter.write(line + " = " + result);
                    resultWriter.newLine();

                } catch (NoSuchElementException e) {
                    logWriter.write("Missing operand: " + line);
                    logWriter.newLine();

                } catch (NumberFormatException e) {
                    logWriter.write("Invalid number in: " + line);
                    logWriter.newLine();

                } catch (UnsupportedOperationException e) {
                    logWriter.write("Unsupported operator in: " + line);
                    logWriter.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}