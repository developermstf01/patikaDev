import java.util.Scanner;
public class GelismisHesapMakinasi {

    static String sabit = "Sonuç: ";

    static int sum(int a, int b){
        int result = a + b;
        System.out.println(sabit + result);
        return result;
    }

    static void minus(int a, int b){
        int result = a - b;
        System.out.println(sabit + result);
    }

    static void times(int a, int b){
        int result = a * b;
        System.out.println(sabit+result);
    }

    static void divided(int a, int b){
        int result=0;
        if (b == 0){
            System.out.println("Bir sayı sıfıra bölünemez !");
        }else {
            result = a / b;
        }
        System.out.println(sabit+result);
    }

    static void power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println(sabit+result);
    }

    static void factorial(int a){
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        System.out.println(sabit+result);
    }

    static void mod(int a, int b){
        int result = a % b;
        System.out.println(sabit+result);
    }

    static void calc(int a, int b){
        System.out.println("Çevresi: "+(2*(a+b)));
        System.out.println("Alanı: "+(a*b));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int select;

        String menu = "İşlemler\n" +
                "1-) Toplama\n" +
                "2-) Çıkarma\n" +
                "3-) Çarpma\n" +
                "4-) Bölme\n" +
                "5-) Üslü sayı hesaplama\n" +
                "6-) Faktoriyel hesaplama\n" +
                "7-) Mod alma\n" +
                "8-) Dikdörtgen alan ve çevre hesabı\n" +
                "9-) Çıkış\n";

        System.out.print(menu);


        do {

            System.out.print("Bir işlem seçiniz: ");
            select = inp.nextInt();

            int a,b;

            if(select == 6){
                System.out.print("Değer giriniz: ");
                a = inp.nextInt();
                factorial(a);
                break;
            }

            if (select == 9){
                System.out.println("Güle güle...");
                break;
            }else {
                System.out.print("Birinci sayı: ");
                a = inp.nextInt();
                System.out.print("İkinci sayı: ");
                b = inp.nextInt();
            }

            switch (select) {
                case 1 -> sum(a, b);
                case 2 -> minus(a, b);
                case 3 -> times(a, b);
                case 4 -> divided(a, b);
                case 5 -> power(a, b);
                case 7 -> mod(a, b);
                case 8 -> calc(a, b);
                default -> System.out.println("Böyle bir işlem seçeneği yok ! Tekrar deneyiniz.");
            }
        }while (select <= 9);
    }
}
