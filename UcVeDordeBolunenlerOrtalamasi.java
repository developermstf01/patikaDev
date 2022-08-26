import java.util.Scanner;

public class UcVeDordeBolunenlerOrtalamasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k, sayiAdedi = 0, toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++){
            if (i % 12 == 0){
                toplam += i;
                sayiAdedi++;
            }
        }
        System.out.print("Sonuç: "+(toplam/sayiAdedi));
    }
}
