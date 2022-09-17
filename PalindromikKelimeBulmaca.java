import java.util.Scanner;

public class PalindromikKelimeBulmaca {

    static void isPalindrome(String word){
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        if (!word.equals(reverse)){
            System.out.println(word+" kelimesi palindrom kelime değildir.");
        }else System.out.println(word+" kelimesi palindrom kelimedir.");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz: ");
        String word = inp.nextLine();

        isPalindrome(word);
    }
}
