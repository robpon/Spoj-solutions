import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String sentence = "";
        while (a<=b){
            if(a%6 == 0){
                sentence+="ab";
            }else{
                if(a%2==0){
sentence+="a";
                }else
                    if (a%3==0){
                        sentence+="b";
                    }

            }
            a++;
        }
        System.out.println(sentence);
	}
}
