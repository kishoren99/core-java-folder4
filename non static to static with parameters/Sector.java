class Sector
{
void area(int r, double teta)
{
double x=1.0/2*r*teta*r;
System.out.println(x);
}
public static void main(String[] args)
{
new Sector().area(9,54.858);
}
}

