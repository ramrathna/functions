package Interface;

interface demo1
{
	public void name();
}
interface demo2
{
	public void add();
	public void name1();
}
interface demo3
{
	public void run();
	public void run1();
	default void  display() {
	
	System.out.println("Naveen Prasad");
	
	}
	
}
public class Example1 implements demo1,demo2,demo3 {
	@Override
	public void run() {
		System.out.println("run method");
	}

	@Override
	public void run1() {
		
		System.out.println("run1 method");
	}

public static void main(String[] args) {
		Example1 d = new Example1();
		d.run();
		d.run1();
        d.display();
        
	}

}
