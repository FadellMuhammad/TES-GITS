import java.util.Scanner;

public class Soal_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input kalimat : ");
        String kalimat = sc.nextLine();

        // convert to char array
        char[] huruf = kalimat.toCharArray();

        // balik huruf
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            System.out.print(huruf[i]);
        }
        sc.close();
    }
}
