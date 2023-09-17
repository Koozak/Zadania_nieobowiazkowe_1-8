import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("wpisz słowo a program je rozpozna czy jest to palindromem");
        String slowo = klawiatura.next();
        int dlugosc = slowo.length();
        char[] slowo_tablica = slowo.toCharArray();
        char[] zamiana = new char[dlugosc];
        int j = 0;
        for(int i = dlugosc-1;i>=0;i--) {
            zamiana[j] = slowo_tablica[i];
            j++;
        }
        String zamiana_string = zamiana.toString();
        System.out.println(zamiana);
        System.out.println(zamiana_string.equals(slowo));


    }
}