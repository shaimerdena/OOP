package pr5.io.util;

import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class ExpressionParser {

    public static double parseAndCalculate(String expr)
            throws NoSuchElementException, NumberFormatException, UnsupportedOperationException {

        StringTokenizer st = new StringTokenizer(expr, "+-*/)(%", true);

        String leftStr = st.nextToken().trim();
        String operator = st.nextToken().trim();
        String rightStr = st.nextToken().trim();

        double left = Double.parseDouble(leftStr);
        double right = Double.parseDouble(rightStr);
        
        if (right == 0.0) {
        	throw new ArithmeticException("");
        }

        return switch (operator) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "*" -> left * right;
            case "/" -> left / right;
            default -> throw new UnsupportedOperationException("Unsupported operator: " + operator);
        };
    }
}
