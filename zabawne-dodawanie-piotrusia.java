import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a<=80) {
            for (int i = 0; i < a; i++) {
                int b = scanner.nextInt();
                if (b >= 1 && b <= 80) {
                    if (b < 10) {
                        System.out.println(b + " 0");
                    } else {
                        String normal = String.valueOf(b);
                        String pal = "";
                        int times = 0;
                        String[] n1 = normal.split("", normal.length());
                        for (int i1 = n1.length - 1; i1 >= 0; i1--) {
                            pal += n1[i1];
                        }
                        while (!pal.equals(normal)) {
                            times++;
                            int licz = Integer.parseInt(normal) + Integer.parseInt(pal);
                            normal = String.valueOf(licz);
                            pal = "";
                            String[] n2 = normal.split("", normal.length());
                            for (int i1 = n2.length - 1; i1 >= 0; i1--) {
                                pal += n2[i1];
                            }
                        }
                        System.out.println(normal + " " + times);
                    }
                }
            }
        }	
	}
}
