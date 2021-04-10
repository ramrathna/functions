package Interface;

interface demo1
{
	public static void name() {
		
		System.out.println("hell0");
		
	}
}
interface demo2
{
	default void test()
	{
		System.out.println("hi");
	}
}
public class Example2 implements demo1,demo2 {
	public static void main(String[] args) {
		demo1.name();
		Example2 e2 = new Example2(); 
		e2.test();
	}


}
