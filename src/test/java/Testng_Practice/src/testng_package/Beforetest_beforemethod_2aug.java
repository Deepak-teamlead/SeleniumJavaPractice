package testng_package;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Beforetest_beforemethod_2aug {
@BeforeTest
public void bt() {
	System.out.println("@BeforeTest runs before all Tests");
}
@AfterTest
public void at() {
	System.out.println("@AfterTest runs after all Tests");
}
@BeforeMethod
public void bm() {
	System.out.println("@BeforeMethod runs before every test");
}
@AfterMethod
public void am() {
	System.out.println("@AfterMethod runs after every test");
}
@Test
public void t1() {
	System.out.println("This is Testcase-1");
}
@Test
public void t2() {
	System.out.println("This is Testcase-2");
}	
}
