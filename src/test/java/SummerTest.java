import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummerTest {

    @Test
    void calculatorCanAdd(){
        Assertions.assertEquals(Summer.add(2,2), 4);
    }

    @Test
    void calculatorCanRemove(){
        Assertions.assertTrue(Summer.subtract(5,1) == 4);
    }

    @Test
    void calculatorCanMultiply(){
        Assertions.assertEquals(Summer.multiply(3,5), 15);
    }

    @Test
    void calculatorCanDivide(){
        Assertions.assertEquals(Summer.divide(15,3),5);
    }
}
