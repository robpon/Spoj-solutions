import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int d;
Scanner t = new Scanner(System.in);
d=t.nextInt();
if (1 <= d && d <= 500) {
    int[] x = new int[d];

    for (int i = 0; i < d; i++){
       x[i] = t.nextInt();

    }
    for (int i = 0; i < d; i++){
        if (1 <= x[i] && x[i] <=1000)
    System.out.println(x[i]*x[i]);}
}

	}
}
