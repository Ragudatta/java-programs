class swap{
	public static void main(String arg[]){
	int a = Integer.parseInt(arg[0]);
	int b=Integer.parseInt(arg[1]);
	int temp;
	System.out.println("Before swapping a,b values:"+a+"\t"+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("After swapping a,b values:"+a+"\t"+b);
	}
}
