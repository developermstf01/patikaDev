import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yTipi, yas;
        double normalTutar, yasIndirimi, yTipiIndirimi, indirimliTutar;
        String sabitIfade = "Toplam tutar: ";

        System.out.print("Yolculuk mesafesi (KM cinsinden): ");
        mesafe = input.nextInt();
        System.out.print("Yaşınız: ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipi\n1-Tek Yön\n2-Gidiş Dönüş\nSeçiminiz: ");
        yTipi = input.nextInt();

        normalTutar = mesafe * 0.1;

        if ((mesafe > 0) && (yas >= 0)) {

            if (yTipi == 1) {

                if (yas < 12) {
                    yasIndirimi = normalTutar * 0.5;
                    indirimliTutar = normalTutar - yasIndirimi;
                    System.out.print(sabitIfade + indirimliTutar);
                } else if ((yas < 24)) {
                    yasIndirimi = normalTutar * 0.1;
                    indirimliTutar = normalTutar - yasIndirimi;
                    System.out.print(sabitIfade + indirimliTutar);
                } else if (yas > 65) {
                    yasIndirimi = normalTutar * 0.3;
                    indirimliTutar = normalTutar - yasIndirimi;
                    System.out.print(sabitIfade + indirimliTutar);
                } else {
                    System.out.print(sabitIfade + normalTutar);
                }
            } else if (yTipi == 2) {

                if (yas < 12) {
                    yasIndirimi = normalTutar * 0.5;
                    indirimliTutar = normalTutar - yasIndirimi;
                    yTipiIndirimi = indirimliTutar * 0.2;
                    System.out.print(sabitIfade + ((indirimliTutar - yTipiIndirimi) * 2));
                } else if (yas < 24) {
                    yasIndirimi = normalTutar * 0.1;
                    indirimliTutar = normalTutar - yasIndirimi;
                    yTipiIndirimi = indirimliTutar * 0.2;
                    System.out.print(sabitIfade + ((indirimliTutar - yTipiIndirimi) * 2));
                } else if (yas > 65) {
                    yasIndirimi = normalTutar * 0.3;
                    indirimliTutar = normalTutar - yasIndirimi;
                    yTipiIndirimi = indirimliTutar * 0.2;
                    System.out.print(sabitIfade + ((indirimliTutar - yTipiIndirimi) * 2));
                }else {
                    yTipiIndirimi = normalTutar * 0.2;
                    indirimliTutar = (normalTutar - yTipiIndirimi)*2;
                    System.out.print(sabitIfade + indirimliTutar);
                }
            }
        } else {
            System.out.print("Hatalı veri girdiniz !");
        }
    }
}
