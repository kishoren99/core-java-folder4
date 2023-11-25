class Sector
{
void area()
{
int r=34;
double teta=45.908;
double are=teta*r*r*1/2.0;
System.out.println(are);
}
public static void main(String[] args)
{
new Sector().area();
}
}