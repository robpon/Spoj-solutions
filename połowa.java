import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
Scanner t = new Scanner(System.in);
a = t.nextInt();
if(1<=a && a <= 100){
    String [][] tab1 = new String[a][];
    String [] tab = new String [a];
    for(int i =0; i < a; i++){
        tab[i]=t.next();
    }

    for(int i =0; i < a; i++){
        tab1 [i] = new String [tab[i].length()];
        if(1<= (tab[i].length()/2) && (tab[i].length()/2) <= 1000){
            tab1[i] = tab[i].split("" , tab[i].length());
            if(i != 0){


            System.out.println("");}else{}
for(int i1 = 0; i1 < (tab[i].length()/2); i1++){
    System.out.print(tab1[i][i1]);
}
        }
    }
}
	}
}
