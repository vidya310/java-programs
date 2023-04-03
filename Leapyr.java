import java.util.Scanner;
class Leapyr{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int start,end;
System.out.println("Enter the starting year:");
start=sc.nextInt();
System.out.println("Enter the end year:");
end=sc.nextInt();
System.out.println("Leap year between the given range are:");
for(int i=start;i<=end;i++)
{
if((i%4==0)&&((i%100!=0)||(i%400==0)))
System.out.println(i);
}
}
}

 

