package dev.sanket.rpn;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RPNTest {

    @Test
    public void shouldEvaluateExpressionWithSingleOperator() {

        String expression = "3 4 *";

        double result = RPN.evaluate(expression);

        assertEquals(12.0, result, 0.0);
    }

    @Test
    public void shouldEvaluateExpressionWithMultipleOperators() {

        String expression = "3 4 * 5 - 7 / 8 +";

        double result = RPN.evaluate(expression);

        assertEquals(9.0, result, 0.0);
    }

    @Test
    public void shouldEvaluateExpressionWithUnaryOperator() {

        String expression = "3 4 * ++";

        double result = RPN.evaluate(expression);

        assertEquals(13.0, result, 0.0);
    }
}
