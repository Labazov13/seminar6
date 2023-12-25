
import org.example.Person;
import org.junit.Assert;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;




public class MainTest {
    static Person p1;

    @BeforeClass
    public static void newMainClass(){
        p1 = new Person();
    }

    @Disabled
    @Test
    public void newPersonShouldHasCorrectParametrs(){
        Assert.assertEquals(25, p1.sum(21L, 4L));
    }

    @Test(expected = ArithmeticException.class)
    public void correctWorkMethodDivide(){
        p1.divide(5, 0);
    }
}
