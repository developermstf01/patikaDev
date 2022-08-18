import java.util.Scanner;
public class DersOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float mat,turkce,muzik,fizik,kimya;

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        if (mat <= 100 && mat >= 0){
            if (fizik <= 100 && fizik >= 0){
                if(kimya <= 100 && kimya >= 0){
                    if(turkce <= 100 && turkce >= 0){
                        if(muzik <= 100 && muzik >= 0){

                            double avarage = (mat + muzik + fizik + kimya + turkce) / 5;

                            if (avarage <= 55){
                                System.out.print("Sınıfta kaldınız ! Ortalamanız: "+avarage);
                            }else{
                                System.out.print("Tebrikler, sınıfı geçtiniz ! Ortalamanız: "+avarage);
                            }
                        }else {
                            System.out.print("Geçersiz not girdiniz! Not değerleri 0 ile 100 arasında olabilir.");
                        }
                    } else {
                        System.out.print("Geçersiz not girdiniz! Not değerleri 0 ile 100 arasında olabilir.");
                    }
                }else {
                    System.out.print("Geçersiz not girdiniz! Not değerleri 0 ile 100 arasında olabilir.");
                }
            }else {
                System.out.print("Geçersiz not girdiniz! Not değerleri 0 ile 100 arasında olabilir.");
            }
        }else {
            System.out.print("Geçersiz not girdiniz! Not değerleri 0 ile 100 arasında olabilir.");
        }
    }
}
