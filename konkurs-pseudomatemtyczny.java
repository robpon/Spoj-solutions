import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
        int b;
        int c=0;
        int d =0;
        Scanner t =new Scanner(System.in);
        a=t.nextInt();
        if(1<= a && a<=500) {
            int[][] tab = new int[a][];
            int[][] tab3 = new int[a][];
            List<Integer> tab1 = new ArrayList<>();
            List<Integer> tab2 = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                tab1.clear();
                b = 0;
                b = t.nextInt();
                if(1<= b && b<=200){
                tab[i] = new int[b];
                tab3[i] = new int[b];

                for (int i1 = 0; i1 < b; i1++) {
                    tab[i][i1] = t.nextInt();
                    tab1.add(tab[i][i1]);

                }
                Collections.sort(tab1);

                for (int i1 = 0; i1 < b; i1++) {
                    tab3[i][i1] = Integer.valueOf(tab1.get(i1));
                }

            }}

            for (int i = 0; i < a; i++) {
                d = 0;
                System.out.println("");
if(0<= tab3[i][0] &&tab3[i][tab3[i].length-1]<=1000){
                do {
                    d++;

                    if (tab3[i].length - d < 0) {
                        break;
                    } else if (tab3[i][tab3[i].length - d] == tab3[i][tab3[i].length - 1]) {
                        System.out.print(tab3[i][tab3[i].length - d] + " ");
                    }
                } while (tab3[i][tab3[i].length - d] == tab3[i][tab3[i].length - 1]);
                for (int i1 = 0; i1 < tab3[i].length - d + 1; i1++) {

                    System.out.print(tab3[i][i1] + " ");
                }


            }
        }}
	}
}
