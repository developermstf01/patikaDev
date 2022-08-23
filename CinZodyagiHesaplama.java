import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String v = "Çin Zodyağı Burcunuz: ";
        int yearOfBirth, remainder;

        System.out.print("Doğum tarihinizi yazınız: ");
        yearOfBirth = inp.nextInt();

        remainder = yearOfBirth%12;

        switch (remainder) {
            case 0 -> System.out.print(v + "Maymun");
            case 1 -> System.out.print(v + "Horoz");
            case 2 -> System.out.print(v + "Köpek");
            case 3 -> System.out.print(v + "Domuz");
            case 4 -> System.out.print(v + "Fare");
            case 5 -> System.out.print(v + "Öküz");
            case 6 -> System.out.print(v + "Kaplan");
            case 7 -> System.out.print(v + "Tavşan");
            case 8 -> System.out.print(v + "Ejderha");
            case 9 -> System.out.print(v + "Yılan");
            case 10 -> System.out.print(v + "At");
            case 11 -> System.out.print(v + "Koyun");
            default -> System.out.print("Hatalı veri girdiniz !");
        }
    }
}
