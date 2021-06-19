import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
int b;
int c=-1;
int d=-2;
Scanner t = new Scanner(System.in);
a = t.nextInt();
int [][] tab = new int[a][];
int [] tab8 = new int[a];
for(int i =0; i <a ; i++){
    tab8[i]=t.nextInt();
    tab[i] = new int [tab8[i]];
    for(int i1 =0; i1 < tab8[i]; i1++){
        tab[i][i1]=t.nextInt();
    }
}
for(int i =0; i< a; i++){
    ;
    c=-1;
    d=-2;
    if(tab8[i]<=100){
        for(int i1 =0; i1 < tab8[i];i1++){
            if(i1<tab8[i]/2){
                System.out.print(tab[i][c=c+2]+" ");
            }else{
                System.out.print(tab[i][d=d+2]+" ");
            }
        }
        System.out.println();
    }
    
}
	}
}
