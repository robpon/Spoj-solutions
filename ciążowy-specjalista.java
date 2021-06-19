import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		       
int a;
int b=0;
Scanner t = new Scanner (System.in);
a = t.nextInt();
if(1<= a && a <= 500){
    double [][] tab = new double[a][3];
    double [] tab1 = new double [a];
    double [] tab2 = new double [a];
    int [] tab3 = new int [a];
    int c=0;
    for(int i =0; i < a; i++){
        for(int  i1 = 0; i1 < 3; i1++){
            tab[i][i1]=t.nextInt();
        }

    }
for(int i =0; i < a; i++){
    if(1 <= tab[i][0] &&tab[i][0] <= 1000 ){
        if(1 <= tab[i][1] &&tab[i][1] <= 1000 ){
            if(1 <= tab[i][2] &&tab[i][2] <= 1000 ){
                b=b+1;
                tab1[i] = tab[i][0]/(tab[i][2]-1)-tab[i][1];
                if(tab1[i]<0){
                    tab2[i]=(tab1[i]*(-1))*12;
                }else{
                    tab2[i]=tab1[i]*12;
                }
                tab3[i] = (int)tab2[i];
                if(tab2[i]-tab3[i] < 0.5){
                    System.out.println((int)tab3[i]);
                }else{
                    c = (int) tab2[i]+(1-((int)tab2[i]-tab3[i]))+((int)tab2[i]-tab3[i]);
                    System.out.println(c);
                    c=0;
                }

            }
        }
    }


}
}
	}
}
