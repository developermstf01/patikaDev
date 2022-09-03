import java.util.Scanner;

public class EnBuyukEnKucukSayiBul {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, min = 1, max = 1, num;

        System.out.print("Kaç tane sayı gireceksiniz ?: ");

        n = inp.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i+". sayıyı giriniz: ");
            num = inp.nextInt();

            if (i == 1){
                max = num;
                min = num;
            }

            if (num > max){
                max = num;
            }

            if (num < min){
                min = num;
            }
        }

        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
