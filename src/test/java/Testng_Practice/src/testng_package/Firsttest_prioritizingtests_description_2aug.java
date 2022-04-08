package testng_package;
import org.testng.annotations.Test;
public class Firsttest_prioritizingtests_description_2aug {
//How to write TestNG Test case, How to Prioritizing tests, Description
@Test (priority=1, description="This is Testng First test case")
public void bharath() {
	System.out.println("bharth test case-1");
}
@Test (priority=2, description="This is Testng Second test case")
public void arun() {
	System.out.println("arun test case-2");
}	
}
