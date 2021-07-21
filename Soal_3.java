import java.util.Scanner;

public class Soal_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("input time : ");
        String times = sc.nextLine();

        // split time and periode
        String[] separate = times.split(" ");

        String time = separate[0];
        String periode = separate[1];

        // split time
        String[] separateTime = time.split(":");

        String hour = separateTime[0];
        String minute = separateTime[1];

        if (periode.equalsIgnoreCase("pm")) {
            System.out.println(time.substring(0, 5));
        } else if (periode.equalsIgnoreCase("am")) {
            if (hour.contains("12")) {
                System.out.println("00:" + minute);
            } else {
                System.out.println(time.substring(0, 5));
            }
        }
        sc.close();
    }
}
