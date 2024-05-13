package thisKeyword;

public class ThisKeywrodDemo5 {

	
	public void info()
	{
		System.out.println("this can be passed as an argument in the method call.");
		thisData(this);
	}
	public void thisData(ThisKeywrodDemo5 t)
	{
		System.out.println("Method is called with current class ref");
	
	}
	//this can be passed as an argument in the method call.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywrodDemo5 t1=new ThisKeywrodDemo5();
		t1.info();
	}

}
