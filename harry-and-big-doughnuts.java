import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
Scanner t = new Scanner(System.in);
a=t.nextInt();
if(a<=100){
    int [][] tab = new int[a][3];
    int [] tab1 = new int[a];
    for(int i =0; i < a; i++){
        for(int i1 =0; i1<3;i1++){
            tab[i][i1]=t.nextInt();
            if(1<=tab[i][i1] && tab[i][i1]<=100){

            }
        }
    }
    for(int i =0; i < a; i++){
        for(int i1 =0; i1<3;i1++){
            if(1<=tab[i][i1] && tab[i][i1]<=100){
if(i1<3){
    tab1[i]=tab[i][0]*tab[i][2];
}
            }
        }
    }
    for(int i =0; i < a; i++){
        if(tab1[i]<=tab[i][1]){
System.out.println("yes");

        }else {
            System.out.println("no");
        }
    }
}
	}
}
