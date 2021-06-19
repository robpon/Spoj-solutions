import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int a;
        Scanner t = new Scanner(System.in);
        a = t.nextInt();
        if (0 < a && a <100) {
            int[][] tab = new int[a][];
            int[] teb = new int[a];
            int[] tac = new int[a];
            for (int i = 0; i < a; i++) {
                teb[i] = t.nextInt();
                tab[i] = new int[teb[i]];
                for (int c = 0; c < teb[i]; c++) {
                    tab[i][c] = t.nextInt();
                }
            }

            for (int i = 0; i < a; i++) {
                System.out.println();
                tac[i] = 0;
                for (int e = 0; e < teb[i]; e++) {

                    tac[i] = tac[i] + tab[i][e];

                }
            }
            for (int i = 0; i < a; i++) {

                System.out.println(tac[i]);


            }
        }
	}
}
