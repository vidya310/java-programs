import java.util.Scanner;
class Symmetric
{
public static void main(String args[])
{
int i,j,c,r,f=0;
Scanner n=new Scanner(System.in);
System.out.println("Enter the rows:");
r=n.nextInt();
System.out.println("Enter the columns:");
c=n.nextInt();
if(r!=c)
{
System.out.println("Not symmetric");
}
else
{
int a[][]=new int[r][c];
System.out.println("Enter the elements of matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=n.nextInt();
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]!=a[j][i])
{
f=1;
break;
}
}
}
if(f==1)
{
System.out.println("Not symmetric");
}
else
{
System.out.println("Symmetric");
}
}
}
}
