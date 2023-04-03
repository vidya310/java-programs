public class Productnew
{
int pcde;
String  pnme;
double prce;
Productnew(int pcode,String pname,double price)
{
pcde=pcode;
pnme=pname;
prce=price;
}
public static void main(String args[])
{
Productnew p1= new Productnew(101,"book",55.2);
Productnew p2= new Productnew(102,"scale",10.3);
Productnew p3= new Productnew(103,"box",25.9);
if(p1.prce <p2.prce && p1.prce < p3.prce)
{
System.out.println("The price of "+p1.pnme+" is the lowest.");
}
else if(p2.prce<p1.prce && p2.prce < p3.prce)
{
System.out.println("The price of "+p2.pnme+" is the lowest.");
}
else if(p3.prce>p2.prce && p3.prce<p1.prce)
{
System.out.println("The price of "+p3.pnme+" is the lowest.");
}
}
}
