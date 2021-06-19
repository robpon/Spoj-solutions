import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int a;
        Scanner t = new Scanner(System.in);
        a = t.nextInt();
        if(a>0){
        int[][][] tab = new int[a][9][9];
        int[]tab0 = new int[a];
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < 9; i1++) {
                for (int i2 = 0; i2 < 9; i2++) {
                    tab[i][i1][i2] = t.nextInt();
                }
            }
        }
        int b = 0;
        int g = 0;
        int f = 0;
        int w = 0;
        int c = 0;
        for (int i = 0; i < a; i++) {
            b = 0;

tab0[i]=0;
            for (int i1 = 0; i1 < 9; i1++) {
                for (int i2 = 0; i2 < 9; i2++) {
                    if (1 <= tab[i][i1][i2] && tab[i][i1][i2] <= 9) {
                      tab0[i]++;
                    }
                }
            }
        }
        TreeSet<Integer> tab1 = new TreeSet<>();
        TreeSet<Integer> tab2 = new TreeSet<>();
        TreeSet<Integer> tab4 = new TreeSet<>();
        for (int i = 0; i < a; i++) {
            c = 0;
            g = 0;

            if(tab0[i]==81){
            for (int i1 = 0; i1 < 9; i1++) {
                tab1.clear();
                tab2.clear();
                for (int i2 = 0; i2 < 9; i2++) {
                    tab1.add(tab[i][i1][i2]);
                    tab2.add(tab[i][i2][i1]);

                }
                if (tab1.size() == 9) {
                    if (tab2.size() == 9) {
                        c++;
                        c++;
                    }
                }
            }
            if (c == 18) {
                f=0;

                for (int i1 = 0; i1 < 3; i1++) {
                    w=0;
                    for (int i2 = 0; i2 < 3; i2++) {
                        tab4.clear();
                        for (int i3 = 0 ; i3 < 3 ; i3++) {
                            for (int i4 = 0 ; i4 < 3; i4++) {
tab4.add(tab[i][i3+f][i4+w]);
                            }
                        }
                        if(tab4.size()==9){
                            g++;
                        }else{

                        }
                        w = w + 3;
                    }
                    f = f + 3;
                }

            }

        }
            if (g == 9) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }


        }}	
	}
}
