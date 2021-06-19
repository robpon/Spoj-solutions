import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
int b;
Scanner t = new Scanner(System.in);
int [] n = new int[2];
int [] k = new int[2];
n[0] = t.nextInt();
n[1] = t.nextInt();
   k[0] = t.nextInt();
   k[1] = t.nextInt();


           if (0<= n[0] && n[0] <= 1000){
               if (0<= k[0] && k[0] <= 1000) {
                   if (0 <= n[1] && n[1] <= 1000) {
                       if (0 <= k[1] && k[1] <= 1000) {
                           a = n[0]*n[1];
                           b = k[0]*k[1];
                           System.out.println(a+b);
                       }

                   }
               }

           }
	}
}
