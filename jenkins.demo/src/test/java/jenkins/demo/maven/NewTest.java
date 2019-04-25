package jenkins.demo.maven;

import org.testng.annotations.Test;

public class NewTest {

	@Test (dependsOnMethods="g")
	public void f() {
		System.out.println("First");
	}
	@Test
	public void g() {
		System.out.println("Second");
	}
	@Test
	public void e() {
		System.out.println("Third");
	}
}
