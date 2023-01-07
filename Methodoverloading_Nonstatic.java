class Amazon
{
 void product(int n)//
{
System.out.println("no of need"+n);
}
void product(String n)//
{
System.out.println("no of need"+n);
}
void product(int n,String ab)//
{
System.out.println("no of need"+n+"name+"+ab);
}
void product(String a,int n)//
{
System.out.println(a+"model"+"price"+n);
}
}


class Mp2
{
public static void main(String[] args)
{
System.out.println("hiiiiiiiiiiii");
Amazon A1=new Amazon();
A1.product(0);
A1.product("Hello");
A1.product("ipad",123);
A1.product(50,"10 pro max");
}
}