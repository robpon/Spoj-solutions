import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String [] alphabetTab = alphabet.split("", alphabet.length());
        String word = scanner.nextLine();
        word = word.toLowerCase();
        String [] wordTab = word.split("", word.length());
        for (int i =0; i < wordTab.length; i++){
        if(!wordTab[i].equals(" ")) {
        String[] al = alphabet.split(wordTab[i]);
        if (al[0].length() + 3 >= alphabetTab.length) {
            stringBuilder.append(alphabetTab[(al[0].length() + 3) - alphabetTab.length]);
        } else {
            stringBuilder.append(alphabetTab[al[0].length() + 3]);
        }
        }else{
        stringBuilder.append(" ");
        }
        }
        System.out.println(stringBuilder.toString());
    }
}
