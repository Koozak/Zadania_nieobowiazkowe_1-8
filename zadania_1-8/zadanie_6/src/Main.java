import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int liczba_1 = klawiatura.nextInt();
        System.out.println(silniacyfr(silnia(liczba_1)));
    }
    public static int silnia(int x) {
        int silnia = 1;
            for (int i = 1; i <= x; i++) {
                silnia *= i;
            }
            return silnia;
    }

    public static int silniacyfr(int x) {
        int suma = 0;
        while(x>0){
            suma+=x%10;
            x/=10;
        }
        return suma;

    }
}