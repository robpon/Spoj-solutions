import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a;
Scanner t = new Scanner (System.in);
a = t.nextInt();
if(a<=100){
    int [] tab = new int [a];
    int [][] tab1 = new int [a][];
    int [][] tab2 =  new int [a][];
    for(int i =0; i < a; i++){
        tab[i]= t.nextInt();
         tab1[i] = new int [tab[i]];
         tab2[i] = new int [tab[i]];
        if(1<=tab[i]&&tab[i]<=100){
            for(int i1 =0;  i1<tab[i]; i1++){
                tab1[i][i1]=t.nextInt();
                if(i1==0){
                    tab2[i][tab[i]-1]=tab1[i][i1];
                }else {
                    tab2[i][i1-1]=tab1[i][i1];
                }
            }
        }
    }
    for(int i =0 ; i<a; i++){
        if(i!= 0){
        System.out.println("");}else{

        }
        if(1<= tab[i] && tab[i] <= 100){
            for(int i1 =0; i1 < tab[i];i1++){
                System.out.print(tab2[i][i1]+" ");
            }
        }
    }
}	
	}
}
