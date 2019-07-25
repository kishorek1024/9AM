package junit9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_Sample {
	
	@BeforeClass
	public static void a1(){ System.out.println("This is Before");}
	@AfterClass
	public static void b1(){ System.out.println("This is After"); }
	@Test
	public void c1(){ System.out.println("This is Test1"); }
	@Test
	public void d1(){ System.out.println("This is Test2"); }
	@Ignore @Test
	public void e1(){ System.out.println("This is Test3"); }
	@Test
	public void f1(){ System.out.println("This is Test4"); }

}
