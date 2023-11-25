class Trap 
{
	static void area(int a,int b,double h)
	{
		double area=1.0/2*(a+b)*h;
		System.out.println(area);
	}

	public static void main(String[] args) 
	{
	area(52,6,2.95);
	}
}
