import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	double a;
double b;
double c;
double d;
Scanner t = new Scanner (System.in);
a=t.nextDouble();
b=t.nextDouble();
c=t.nextDouble();
if(c==b && a==0){
    System.out.println("NWR");
}else{
    if(c==b){
        d=(c-b)/a;
        System.out.printf("%.2f", d );
    }else{
        if(a==0){
            System.out.println("BR");
        }else{
           d=(c-b)/a;
            System.out.printf("%.2f", d );
        }
    }
}	
	}
}
