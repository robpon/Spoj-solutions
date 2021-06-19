import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
int b;
int c=0;
Scanner t = new Scanner(System.in);
a=t.nextInt();
int [] tab = new int [a];
for(int  i =0;i < a; i++){
    tab[i]=t.nextInt();
}
for(int  i=0; i < a; i++) {
    if (tab[i] >1  ) {
        c = 0;

        for (int i1 = 2; i1 < tab[i]; i1++) {
            b=0;
            b=(int)tab[i]/i1;
            if (b * i1 == tab[i]) {
                System.out.println("NIE");
                c = 1;
                break;
            } else {

            }
        }
        if (c == 1) {

        } else {
            System.out.println("TAK");
        }
    } else {
        System.out.println("NIE");
    }
}
	}
}
