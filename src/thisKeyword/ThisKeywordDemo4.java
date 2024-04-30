package thisKeyword;

public class ThisKeywordDemo4 
{
	//this can be used to return the current class instance from the method.(builder pattern)

	public ThisKeywordDemo4  start()
	{
		System.out.println("Application start!");
		return this;
		
	}
	public ThisKeywordDemo4 play()
	{
		System.out.println("Application play!");
		return this;
	}
	public void stop()
	{
		System.out.println("Application stop!");
	}

	public static void main(String[] args) 
	{
		ThisKeywordDemo4 t1=new ThisKeywordDemo4();
		//t1.play();
		t1.start().play().stop();


	}

}
