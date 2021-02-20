package unittesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                CalculatorTest.class,
                CalculatorTest1.class,
                CalculatorTest2.class
        }
)


public class TestSuite {

}
