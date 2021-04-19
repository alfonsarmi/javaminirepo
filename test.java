package net.code.java;

class Tipo
{
	int test;
	int TestMethod4(int a, String b)
	{
		return 0;
		
	}
	
	void TestMethod5(int a, String b)
	{
		int v = TestMethod4(1, "");		
	}
	
	static Tipo GetNew()
	{
		
		return new Tipo();
	}
	
	Tipo()
	{
		int v = TestMethod4(1, "");		
	}
	
	Tipo(int test)
	{
		int v = TestMethod4(1, "");		
	}
}

public class Test {
	public void TestMethod()
	{
		
		TestMethod3(true, (float)0.2);
		Tipo nuevoTipo = Tipo.GetNew();
		nuevoTipo.test = 0;
		int a = nuevoTipo.TestMethod4(0, null);
		int b = nuevoTipo.TestMethod4(0, "caca");
		nuevoTipo.TestMethod4(a, "culo");
		nuevoTipo.TestMethod5(a, "pis");	
	}
	
	
	private void TestMethod3(boolean test, float test2)
	{
		
		
	}
}
