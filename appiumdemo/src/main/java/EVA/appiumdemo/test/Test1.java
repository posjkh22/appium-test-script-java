package EVA.appiumdemo.test;

import org.junit.Test;

import lib.TestHelper;

public class Test1 extends BaseTest {

	@Test
    public void run()
    {
        System.out.println("Test1-1 (getHtmlText)");
        String test1_result_string = TestHelper.getHtmlText(driver, "text1");
        System.out.println(" -> " + test1_result_string);
        
        System.out.println("Test1-2 (ScreenShot)");
        TestHelper.ScreenShot(driver);

        System.out.println("Test1-3 (SingleTap)");
        TestHelper.SingleTap(driver, "text1");
    }
}
