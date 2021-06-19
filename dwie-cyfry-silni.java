import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int a = 0;
        Scanner t = new Scanner(System.in);
        a = t.nextInt();
        if(a<=30) {
            for (int i = 0; i < a; i++) {
                int b = t.nextInt();
                if (0 <= b && b <= 1000000000) {
                    if (b >= 10) {
                        System.out.println("0 0");
                    } else {
                        int num = 1;
                        for (int i1 = 1; i1 < b + 1; i1++) {
                            num = num * i1;
                        }
                        String s = String.valueOf(num);
                        String[] yab = s.split("", s.length());
                        if (yab.length >= 2) {
                            System.out.println(yab[yab.length - 2] + " " + yab[yab.length - 1]);
                        } else {
                            System.out.println("0 " + yab[0]);
                        }
                    }
                }
            }
        }
	}
}
