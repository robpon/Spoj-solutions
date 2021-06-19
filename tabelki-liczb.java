import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int index =0;
        Scanner scanner = new Scanner(System.in);
        index = scanner.nextInt();
        for(int  i =0; i < index; i++){
            int ind1 = scanner.nextInt();
            int ind2 = scanner.nextInt();
            if(ind1>=3 && ind2<=100) {
                int[][] tab = new int[ind1][ind2];
                int[][] tab1 = new int[ind1][ind2];
                for (int i1 = 0; i1 < ind1; i1++) {
                    for (int i2 = 0; i2 < ind2; i2++) {
                        int y = scanner.nextInt();
                        tab[i1][i2] = y;
                        tab1[i1][i2] = y;
                    }
                }
                for (int i1 = 1; i1 < tab[0].length; i1++) {
                    tab[0][i1 - 1] = tab1[0][i1];
                }
                for (int i1 = 1; i1 < tab.length; i1++) {
                    tab[i1][0] = tab1[i1 - 1][0];
                }

                for (int i1 = 1; i1 < tab[0].length; i1++) {
                    tab[tab.length - 1][i1] = tab1[tab.length - 1][i1 - 1];
                }
                for (int i1 = 1; i1 < tab.length; i1++) {
                    tab[i1][0] = tab1[i1 - 1][0];
                }
                for (int i1 = 0; i1 < tab.length - 1; i1++) {
                    tab[i1][tab[0].length - 1] = tab1[i1 + 1][tab[0].length - 1];
                }
                for (int i1 = 0; i1 < ind1; i1++) {
                    System.out.println();
                    for (int i2 = 0; i2 < ind2; i2++) {
                        System.out.print(tab[i1][i2] + " ");
                    }
                }
            }
        }	
	}
}
