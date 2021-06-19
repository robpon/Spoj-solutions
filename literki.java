
import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a;double b;
Scanner t = new Scanner(System.in);
a=t.nextLine();
double [] tab = new double[26];
String [] tab1 = new String[a.length()];
tab1=a.split("", a.length());
if(1<=a.length() && a.length() <=1000000) {
    if(a.toUpperCase().equals(a)){
    for (int i = 0; i < 23; i++) {
        tab[i] = 0;
    }
    for (int i = 0; i < a.length(); i++) {
        switch (tab1[i]) {
            case "A":
                tab[0] = tab[0] + 1;
                break;
            case "B":
                tab[1] = tab[1] + 1;
                break;
            case "C":
                tab[2] = tab[2] + 1;
                break;
            case "D":
                tab[3] = tab[3] + 1;
                break;
            case "E":
                tab[4] = tab[4] + 1;
                break;
            case "F":
                tab[5] = tab[5] + 1;
                break;
            case "G":
                tab[6] = tab[6] + 1;
                break;
            case "H":
                tab[7] = tab[7] + 1;
                break;
            case "I":
                tab[8] = tab[8] + 1;
                break;
            case "J":
                tab[9] = tab[9] + 1;
                break;
            case "K":
                tab[10] = tab[10] + 1;
                break;
            case "L":
                tab[11] = tab[11] + 1;
                break;
            case "M":
                tab[12] = tab[12] + 1;
                break;
            case "N":
                tab[13] = tab[13] + 1;
                break;
            case "O":
                tab[14] = tab[14] + 1;
                break;
            case "P":
                tab[15] = tab[15] + 1;
                break;
            case "Q":
                tab[16] = tab[16] + 1;
                break;
            case "R":
                tab[17] = tab[17] + 1;
                break;

            case "S":
                tab[18] = tab[18] + 1;
                break;
            case "T":
                tab[19] = tab[19] + 1;
                break;
            case "U":
                tab[20] = tab[20] + 1;
                break;
            case "V":
                tab[21] = tab[21] + 1;
                break;
            case "W":
                tab[22] = tab[22] + 1;
                break;
            case "X":
                tab[23] = tab[23] + 1;
                break;
            case "Y":
                tab[24] = tab[24] + 1;
                break;
            case "Z":
                tab[25] = tab[25] + 1;
                break;

        }
    }
String c;
    c=a.replace(" ","");
        b=c.length();
    System.out.print("A");
    for (int i = 0; i < Math.round((tab[0] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("B");
    for (int i = 0; i < Math.round((tab[1] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("C");
    for (int i = 0; i < Math.round((tab[2] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("D");
    for (int i = 0; i < Math.round((tab[3] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("E");
    for (int i = 0; i < Math.round((tab[4] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("F");
    for (int i = 0; i < Math.round((tab[5] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("G");
    for (int i = 0; i < Math.round((tab[6] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("H");
    for (int i = 0; i < Math.round((tab[7] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("I");
    for (int i = 0; i < Math.round((tab[8] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("J");
    for (int i = 0; i < Math.round((tab[9] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("K");
    for (int i = 0; i < Math.round((tab[10] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("L");
    for (int i = 0; i < Math.round((tab[11] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("M");
    for (int i = 0; i < Math.round((tab[12] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("N");
    for (int i = 0; i < Math.round((tab[13] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("O");
    for (int i = 0; i < Math.round((tab[14] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("P");
    for (int i = 0; i < Math.round((tab[15] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("Q");
    for (int i = 0; i < Math.round((tab[16] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("R");
    for (int i = 0; i < Math.round((tab[17] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("S");
    for (int i = 0; i < Math.round((tab[18] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("T");
    for (int i = 0; i < Math.round((tab[19] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("U");
    for (int i = 0; i < Math.round((tab[20] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("V");
    for (int i = 0; i < Math.round((tab[21] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("W");
    for (int i = 0; i < Math.round((tab[22] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("X");
    for (int i = 0; i < Math.round((tab[23] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("Y");
    for (int i = 0; i < Math.round((tab[24] / b) * 100); i++) {
        System.out.print("*");
    }
    System.out.println();
    System.out.print("Z");
    for (int i = 0; i < Math.round((tab[25] / b) * 100); i++) {
        System.out.print("*");
    }

}}
	}
}
