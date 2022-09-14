import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayiyaEnYakinDeger {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list)); //Dizinin küçükten büyüğe sıralanmış hâlini görelim.

        System.out.print("Sayı giriniz: ");
        int n = inp.nextInt();

        for (int i = 0; i < list.length; i++) {

            if (n < list[i]) {

                System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[i]);
                System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[i - 1]);
                break;

            }
        }
    }
}
