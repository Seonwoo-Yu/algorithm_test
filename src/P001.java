import java.util.Scanner;

public class P001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력할 숫자의 개수
        int n = scanner.nextInt();

        // 숫자 n개를 공백 없이 입력받는 변수
        String s = scanner.next();

        // 공백 없이 입력받은 숫자를 하나씩 쪼개어 변수형태로 넣어줌
        String[] sArr = s.split("");

        // 각 숫자의 합을 저장할 변수
        int sum = 0;

        for (int i = 0; i < sArr.length; i++) {
            sum += Integer.parseInt(sArr[i]);
        }

        System.out.println(sum);

        scanner.close();
    }

}
