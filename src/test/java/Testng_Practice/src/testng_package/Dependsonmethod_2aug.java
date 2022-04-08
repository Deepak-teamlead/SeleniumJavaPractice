package testng_package;
import org.testng.annotations.Test;
public class Dependsonmethod_2aug {

	    @Test(dependsOnMethods = { "bharath" })
	    public void arun() {
	        System.out.println("Arun Testcase-1");
	    }
	 
	    @Test
	    public void bharath() {
	        System.out.println("Bharath Testcase-2");
	    }
	}
