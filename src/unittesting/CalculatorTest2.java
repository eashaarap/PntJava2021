package unittesting;

import org.junit.*;
import org.junit.jupiter.api.Disabled;


public class CalculatorTest2 {
@Test
    public void testDoSummation(){
//       int result = Calculator.doSum(25, 26);
       //Expected result = 51;
        int expectedResult = 51;
        int actualResult = Calculator.doSum(25, 26);

        //Verify expected Result vs Actual Result

//        if(expectedResult == actualResult){
//            System.out.println("Test pass");
//        }else{
//            System.out.println("Test fail");
//        }

        // short cut way instead of using if else statement
        Assert.assertEquals("Test Fail",expectedResult, actualResult);
    }
    @Test(timeout = 100)@Ignore @Disabled
    public void testDoSub(){
    int expectedResult  = -30;
    int actualResult = Calculator.doSub(20,50);

    Assert.assertEquals("Test Fail", expectedResult, actualResult);
    }
    @Test
    public void testDoSub1(){//Negative Testing
        int expectedResult = -24;
        int actualResult = Calculator.doSub(33,56);
        Assert.assertNotEquals("Test Fail",expectedResult, actualResult);
    }
    @Before
    public void startUnitTesting(){
        System.out.println("Start Unit Testing");
    }
    @After
    public void endUnitTesting(){
        System.out.println("End Unit Testing");
    }
    @BeforeClass
    public static void welcome(){
        System.out.println("Welcome Unit Testing");
    }
}
