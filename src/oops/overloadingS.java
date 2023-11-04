package oops;

public class overloadingS {
	int a,b,c;
	void sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		print();
	}
	void print()
	{
		System.out.println(c);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingS obj=new overloadingS();
		obj.sum(20, 20);
		obj.sum(20,20,20);
	}

}
