package test.horst;

public class TestDisplay {

	public void display()
	{
		System.out.println("TestDisplay");
		
		int[] data = { -1,-2,-3,-4,-5};
		
		for (int i : data) {
			System.out.println("Test : " +i);
		}
	}
}
