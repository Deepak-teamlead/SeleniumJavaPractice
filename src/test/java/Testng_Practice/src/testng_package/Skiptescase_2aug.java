package testng_package;
import org.testng.annotations.Test;
public class Skiptescase_2aug {
//Skip Testcases
	@Test
	public void m1() {
		System.out.println("This is Testcase-1");
	}
	@Test (enabled=false)     //This Testcase will be skipped
	public void m2() {
		System.out.println("This is Testcase-2");
	}
	@Test
	public void m3() {
		System.out.println("This is Testcase-3");
	}
}
