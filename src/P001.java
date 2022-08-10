import java.util.Scanner;

public class P001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String s = scanner.next();

        String[] charArr = s.split("");

        int sum = 0;

        for (int i = 0; i < charArr.length; i++) {
            sum += Integer.parseInt(charArr[i]);
        }

        System.out.println(sum);

        scanner.close();
    }

}
