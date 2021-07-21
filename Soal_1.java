import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input number : ");
        int input = sc.nextInt();

        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println("Hello World");
        } else if (input % 3 == 0) {
            System.out.println("Hello");
        } else if (input % 5 == 0) {
            System.out.println("World");
        } else {
            System.out.println(" ");
        }
        sc.close();
    }
}
