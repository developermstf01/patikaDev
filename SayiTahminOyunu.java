import java.util.Scanner;
import java.util.Random;
public class SayiTahminOyunu {

    static String wrongList(int[] arr){
        for (int i: arr){
            if (i != 0) System.out.print(i+" ");
        }
        return "";
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner inp = new Scanner(System.in);

        int number = rand.nextInt(100);

        int right = 0;
        int selected;
        boolean isWin = false;
        boolean isWrong = false;
        int[] wrongAnswer = new int[5];

        while (right < 5){

            System.out.print("Tahmininizi giriniz: ");
            selected = inp.nextInt();

            if ((selected < 0) || (selected > 99)){
                System.out.println("Hatalı sayı girdiniz ! Lütfen 0-100 arasında bir değer giriniz.");

                if (isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: "+(5-right));
                }else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınız azalacaktır !");
                }
                continue;
            }

            if (number == selected){
                System.out.println("Tebrikler, kazandınız ! Gizli sayı: "+number);
                isWin = true;
                break;
            }else {
                wrongAnswer[right] = selected;
                right++;
                if (selected > number){
                    System.out.println(selected+" sayısı, gizli sayıdan büyüktür ! Kalan hakkınız: "+(5-right));
                }else {
                    System.out.println(selected+" sayısı, gizli sayıdan küçüktür ! Kalan hakkınız: "+(5-right));
                }
            }
        }

        if (!isWin){
            System.out.print("Kaybettiniz ! Tahminleriniz: ");
            wrongList(wrongAnswer);
            System.out.print("\nGizli sayı: "+number);
        }
    }
}
