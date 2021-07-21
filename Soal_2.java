import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input email
        System.out.print("email : ");
        String email = sc.next();

        //get domain
        String domain = email.substring(email.length() - 3, email.length());

        //cek email
        if(email.contains("@.") && email.length() <= 20 && domain.equals(".id") || domain.equals(".co.id")){
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        sc.close();
    }
}
