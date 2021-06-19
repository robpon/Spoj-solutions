import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        if (Math.abs(x) <= 10000 && Math.abs(y) <= 10000 & Math.abs(r) <= 1000000) {
            int a = scanner.nextInt();
            for (int i = 0; i < a; i++) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int dX = (int) Math.pow((x1 - x), 2);
                int dY = (int) Math.pow((y1 - y), 2);
                double d = Math.sqrt(dX + dY);
                if ((double) r > d) {
                    System.out.println("I");
                } else if ((double) r == d) {
                    System.out.println("E");
                } else if ((double) r < d) {
                    System.out.println("O");
                }
            }
        }
	}
}
