class Complex{
double real,img;
Complex(int r,int i){
real=r;
img=i;
}
Complex addComp(Complex c1,Complex c2){
Complex sum=new Complex(0,0);
sum.real=c1.real+c2.real;
sum.img=c1.img+c2.img;
return sum;
}
}
class ComplexMain{
public static void main(String args[])
{
Complex c1=new Complex(2,3);
Complex c2=new Complex(5,6);
Complex c3=new Complex(0,0);
System.out.println("Complex num1:"+c1.real+"+"+c1.img+"i");
System.out.println("Complex num2:"+c2.real+"+"+c2.img+"i");
c3=c3.addComp(c1,c2);
System.out.println("Sum of Complex numbers:"+c3.real+"+"+c3.img+"i");
}
}





