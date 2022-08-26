import java.util.Scanner;
public class TekSayiKabulEdenProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, total=0;

        /*Kullanıcı tek sayı girinceye kadar sayı girmesini istiyoruz
         ve girilen sayılardan 4'ün katı olanları toplayıp yazdırıyoruz.*/

        do{
            System.out.print("Sayı giriniz: ");
            x = inp.nextInt();

            if(x % 4 == 0){
                total += x;
            }

        }while (x % 2 == 0);

        System.out.print("Girdiğiniz sayılardan 4'ün katı olanların toplamı: "+total);
    }
}
