public class RunnableTest{

	public static void main(String[] args){

	System.out.println("=== RunnableTest ===");




	//Anonymous Runnable
	Runnable r1 = new Runnable(){


	@Override
	public void run(){
	 System.out.println("Hello World one!");

	 }

	};
	
	//Lambad Runnable

	Runnable r2 = () -> System.out.println("Hello World two");

	//Rum em!

	r1.run();
	r2.run();
	

	}

}