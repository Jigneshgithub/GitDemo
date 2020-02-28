package qaclickacademy.com;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void NativeAppAndroid() {
		System.out.println("NativeAppAndroid");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void IOSApp() {
		System.out.println("IOSapp");
		System.out.println("HybridApp");
		Assert.assertEquals(true, true);
	}

}
