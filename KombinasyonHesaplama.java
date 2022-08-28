import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r, total1 = 1, total2 = 1, total3=1;

        System.out.print("Kümedeki toplam eleman sayısını giriniz: ");
        n = inp.nextInt();
        System.out.print("Kaç elemanlı alt küme sayısını bulmak istersiniz? : ");
        r = inp.nextInt();

        int x = n - r;

        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }

        for (int j = 1; j <= r; j++) {
            total2 *= j;
        }

        for (int k = 1; k <= x; k++){
            total3 *= k;
        }

        int sonuc = total1 / (total2 * total3);

        System.out.println("Kombinasyon sonucu: "+sonuc);

    }
}
