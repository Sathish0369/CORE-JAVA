class P1
{
static void main1(int a)//
{
System.out.println("hi"+a);
}
static void main1(String ab)//
{
System.out.println("hi hello"+ab);
}
static void main1(int a,String abb)//
{
System.out.println("hi"+a+abb);
}}

class Mp1
{
public static void main(String[] args)
{
System.out.println("hiiiiiiiiiiii");
P1.main1(0);
P1.main1("Hello");
P1.main1(5,"javaa");
}
}