import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
       int b;
       int c=0;int d;
       String f;
       Scanner t = new Scanner(System.in);
       b=t.nextInt();
       if(b<=100){
       String[] tab4 = new String[b];
        for(int i = 0 ; i < b; i ++){
            tab4[i]=t.next();
        }
       String[][] tab = new String [b][11];
       int [][] tab1 = new int[b][11];
       int [][] tab2 = new int [b][11];
for(int i = 0; i < b; i++) {
    tab[i] = tab4[i].split("", 11);
}
       for(int i = 0; i < b; i++) {
for(int i1 = 0; i1<11; i1++) {
    tab1[i][i1] = Integer.parseInt(tab[i][i1]);

}
       }
for(int i = 0; i < b; i++){
    for(int i1 = 0; i1<11; i1++){
    switch(i1){
        case 0:
            tab2[i][i1]=tab1[i][i1]*1;
            break;
            case 1:
            tab2[i][i1]=tab1[i][i1]*3;
            break;
        case 2:
            tab2[i][i1]=tab1[i][i1]*7;
            break;
        case 3:
            tab2[i][i1]=tab1[i][i1]*9;
            break;
        case 4:
            tab2[i][i1]=tab1[i][i1]*1;
            break;
        case 5:
            tab2[i][i1]=tab1[i][i1]*3;
            break;
        case 6:
            tab2[i][i1]=tab1[i][i1]*7;
            break;
        case 7:
            tab2[i][i1]=tab1[i][i1]*9;
            break;
        case 8:
            tab2[i][i1]=tab1[i][i1]*1;
            break;
        case 9:
            tab2[i][i1]=tab1[i][i1]*3;
            break;
        case 10:
            tab2[i][i1]=tab1[i][i1]*1;
            break;
    }}
}
int [] tab5 = new int [b];
String[] tab6 = new String[b];
for(int i = 0; i < b; i ++){
    tab5[i]=0;

    for(int i1 = 0; i1 < 11;i1++){
    tab5[i]=tab5[i]+tab2[i][i1];
    }
}

        for(int i =0; i < b; i ++){
            tab6[i] = Integer.toString(tab5[i]);

        }


String [][] tab3 = new String [b][];
        for(int i =0 ; i< b; i++){
            tab3[i]=new String[tab6[i].length()];
            tab3[i] = tab6[i].split("", tab6[i].length());
        }

        for(int i =0; i < b; i ++) {


            if (tab3[i][tab6[i].length() - 1].equals("0")) {
                System.out.println("D");
            } else System.out.println("N");
        }}
	}
}
