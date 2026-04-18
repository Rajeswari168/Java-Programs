class Calculator
{
static int add(int a , int b)
{
return a+b;
}
static int add(int a, int b, int c)
{
return a+b+c;
}
static double add(double a, double b)
{
return a+b;
}
}
class Overloading
{
public static void main (String args[])
{
System.out.println(Calculator.add(5,10));
System.out.println(Calculator.add(1,2,3));
System.out.println(Calculator.add(4.5,5.5));
}
}




