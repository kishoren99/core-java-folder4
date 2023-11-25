class Circle
{
void area(int r)
{
final double pi=3.142;
double x=pi*r*r;
System.out.println(x);
}
public static void main(String[] args)
{
new Circle().area(9);
}}