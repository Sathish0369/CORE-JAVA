class Dad
{
int so=999;
}
class Son extends Dad
{
void s()
{
System.out.println("hello sons");
}
}
class In1
{
public static void main(String[]args)
{
Son s1=new Son();
s1.s();
System.out.println(s1.so);
}
}