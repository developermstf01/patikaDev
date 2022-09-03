import java.util.Scanner;
public class MukemmelSayiBuluyoruz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, total=0;
        System.out.print("Bir sayı giriniz: ");
        n = inp.nextInt();

        for (int i=1; i<n; i++){
            if (n % i == 0){
                //n değeri i değerine kalansız bölünüyorsa i değerini alıp total'e eşitledik.
                total += i;
            }
        }

        if (n == total){
            System.out.println(n+" bir mükemmel sayıdır.");
        }else {
            System.out.println(n+" bir mükemmel sayı değildir.");
        }
    }
}
