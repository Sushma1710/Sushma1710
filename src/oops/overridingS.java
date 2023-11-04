package oops;
class parents{
	void run() {
		System.out.println("parent method");
	}
}
public class overridingS extends parents {
	void run()
	{
		System.out.println("child method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overridingS obj=new overridingS();
		obj.run();
		parents obj1=new parents();
		obj1.run();
		}

}
