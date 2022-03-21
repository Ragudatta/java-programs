class implict
{
public static void main(String arg[])
{
int i=25;
float f=10.5f;
double d=323.143;
System.out.println("conversion of int to float:");
f=(int)i;
System.out.println("i:"+i+" f:"+f);
System.out.println("conversion of float to double:");
d=(float)f;
System.out.println("f:"+f+" d:"+d);
System.out.println("coversion of int to double:");
d=(int)i;
System.out.println("i:"+i+" d:"+d);
}
}

