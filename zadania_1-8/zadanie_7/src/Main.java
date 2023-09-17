import java.util.Scanner;

public class Main {
    public static String liczbyPierwsze(int x) {
        if (x <= 1) {
            return "Nie jest liczbą pierwszą";
        }
        for (int i = 2; i <= x-1; i++) {
            if (x % i == 0) {
                return "Nie jest liczbą pierwszą";
            }
        }
        return "Jest liczbą pierwszą";
    }
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Program sprawdza czy liczba jest liczbą pierwszą");
        int liczba = klawiatura.nextInt();
        System.out.println(liczbyPierwsze(liczba));
    }
}