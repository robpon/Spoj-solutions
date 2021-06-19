import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
int b=0;
int c=0;
Scanner t = new Scanner(System.in);
a=t.nextInt();
if(1<= a && a <=20){
    String [] tab = new String [a];
    for(int i =0; i < a; i++){
        tab[i]=t.next();
    }
    String [][] tab1 = new String[a][];
    for(int i =0; i < a; i++) {
        b = 0;
        c = 0;
        tab1[i] = tab[i].split("", tab[i].length());
        b = Integer.valueOf(tab1[i][0]);
        if (tab[i].length() <= 99) {
            for (int i1 = 0; i1 < tab[i].length(); i1++) {
                c = c + 2;
                switch (tab1[i][c - 1]) {
                    case ("+"):
                        b = b + Integer.valueOf(tab1[i][c]);
                        break;
                    case ("-"):
                        b = b - Integer.valueOf(tab1[i][c]);
                        break;
                }
                if (c == tab[i].length() - 1) {
                    break;
                }
            }
            System.out.println(b);
        }
    }
}
	}
}
