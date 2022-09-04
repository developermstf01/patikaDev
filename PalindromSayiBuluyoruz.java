import java.util.Scanner;
public class PalindromSayiBuluyoruz {

    static boolean isPalindrom(int number){

        int temp = number, reverseNum = 0, lastNumber;

        while (temp != 0){

            lastNumber = temp % 10;

            reverseNum = (reverseNum * 10) + lastNumber;

            temp /= 10;

        }

        if (reverseNum == number){
            System.out.println(number + " palindrom sayıdır.");
            return true;
        }else {
            System.out.println(number+" palindrom sayı değildir.");
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();
        isPalindrom(n);
    }
}
