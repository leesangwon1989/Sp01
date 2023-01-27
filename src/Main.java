import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요");
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}