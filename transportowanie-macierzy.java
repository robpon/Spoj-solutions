import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
int b;
Scanner t = new Scanner(System.in);
a=t.nextInt();
b=t.nextInt();
if(1<=a && a <= 200){
    if(1<= b && b <= 200){
        int [][] tab = new int[a][b];
    for(int i =0; i < a; i++){
        for(int i1=0; i1<b;i1++) {
            tab[i][i1]= t.nextInt();
        }
    }
    for(int i=0; i < b; i++){
        System.out.println();
        for(int i1=0; i1<a;i1++){
            System.out.print(tab[i1][i]+" ");
        }
    }
    }
}
	}
}
