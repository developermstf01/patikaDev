import java.util.Scanner;
public class SwitchHesapMakinasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2,select;

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.print("Seçim yapınız:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");

        select = input.nextInt();
        
        switch (select){
            case 1:
                System.out.print("Toplam: "+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma: "+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpım: "+(n1*n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.print("Bölüm: "+(n1/n2));
                }else {
                    System.out.print("Bir sayı sıfıra bölünemez!");
                }

                break;
            default:
                System.out.print("Hatalı seçim yaptınız!");
        }
    }
}
