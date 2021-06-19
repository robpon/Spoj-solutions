import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   int a;
    int c;
    int d = 0;
    String b;
    Scanner t = new Scanner(System.in);
    a = t.nextInt();
  if((a/2)*2 != a) {

      if (1 <= a && a <= 29) {
          b = t.next();
          String[] tab = new String[a];

          tab = b.split("", b.length());
          String [] tab1  = new String[a];
          for(int i =0; i < a; i++){
              tab1[i]=tab[i].toLowerCase();
              if(tab1[i].equals(tab[i])){
                  d=d+1;
              }
          }

if(d==a){
          if (a == b.length()) {

              for (int i1 = 0; i1 < a / 2; i1++) {
                  c = a / 2 - i1;
                  for (int i = 0; i < c; i++) {
                      System.out.print(".");
                  }
                  for (int i = c ; i < a - c ; i++) {
                      System.out.print(tab[i]);
                  }
                  for (int i = a - c; i < a; i++) {
                      System.out.print(".");
                  }
                  System.out.println();

              }
              System.out.println(b);
          }
      }}
  }
	}
}
