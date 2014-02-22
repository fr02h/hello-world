package test.horst;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestMain test = new TestMain();
		test.display();

	}
	public void display()
	{
		System.out.println("test header");
		System.out.println("------------------------------------------");
		
		TestDisplay display = new TestDisplay();
		display.display();
	}
}
