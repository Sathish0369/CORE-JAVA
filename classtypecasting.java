class A1
{
int a=12345;
}
class B1 extends A1
{
void sub()
{
System.out.println("hello java ");
}
}
class Type1
{
public static void main(String[]args)
{
A1 z=new B1();
System.out.println(z.a);
B1 y=(B1)z;
System.out.println(y.a);
y.sub();
}}

