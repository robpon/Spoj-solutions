import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
        int b;
        int c;
        Scanner t = new Scanner(System.in);
        a = t.nextInt();
        if (a <= 100){
            b = t.nextInt();
            if (b <= 100){
                c = t.nextInt();
                if (c <= 100){
                    System.out.println(a+b+c);
                }
            }
        }
	}
}
