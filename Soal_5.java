import java.util.Scanner;

public class Soal_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input kalimat : ");
        String kalimat = sc.nextLine();

        // pisah kalimat
        String[] kata = kalimat.split(" ");

        String kataAwal = kata[0];
        // String kataAkhir = kata[kalimat.length() - 1];

        // convert to char array
        char[] huruf = kataAwal.toCharArray();

        String balik = "";
        // balik huruf
        for (int i = kataAwal.length() - 1; i >= 0; i--) {
            balik += huruf[i];
        }
        
        //cek palindrom
        if(kataAwal.equalsIgnoreCase(balik)){
            System.out.print(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}
