public class Main {
    public static void main(String[] args) {
        System.out.println("Program do generowania hasła zawierającego 20 znaków w tym dużę litery,małe litery,cyfry i znaki specjalne");
        int x = (int)Math.floor(Math.random() *(4 - 1 + 1) + 1);
        String[] haslo = new String[20];
        for(int i = 0;i<=19;i++){
            if(x == 1){
                haslo[i] = duze();
                 x = (int)Math.floor(Math.random() *(4 - 1 + 1) + 1);
            }
            else if(x == 2){
                haslo[i] = male();
                 x = (int)Math.floor(Math.random() *(4 - 1 + 1) + 1);
            }
            else if(x == 3){
                haslo[i] = spec();
                 x = (int)Math.floor(Math.random() *(4 - 1 + 1) + 1);
            }
            else if(x == 4){
                haslo[i] = cyfra();
                 x = (int)Math.floor(Math.random() *(4 - 1 + 1) + 1);
            }
        }
        for (int i = 0;i<=19;i++) {
            System.out.print(haslo[i]);
        }
    }
    public static String duze(){
        int radomowy_znak_duzy = (int)Math.floor(Math.random() *(25 + 1) + 0);
        String[] duze_litery = {"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};
        String s = duze_litery[radomowy_znak_duzy];
        return s;
    }
    public static String male(){
        int radomowy_znak_maly = (int)Math.floor(Math.random() *(25 + 1) + 0);
        String[] male_litery = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        String s = male_litery[radomowy_znak_maly];
        return s;
    }
    public static String spec(){
        int randomowy_specjalny = (int)Math.floor(Math.random() *(26 + 1) + 0);
        String[] specjalny = {"~`","!","@","#","$","%","^","&","*","(",")","-","_","+","=","{","}","[","]",";",":","'","|","/","?",".",">","<"};
        String s = specjalny[randomowy_specjalny];
        return s;

    }
    public static String cyfra(){
        int randomowa_cyfra = (int)Math.floor(Math.random() *(9 + 1) + 0);
        String [] cyfry = {"0","1","2","3","4","5","6","7","8","9"};
        String s = cyfry[randomowa_cyfra];
        return s;
    }
}