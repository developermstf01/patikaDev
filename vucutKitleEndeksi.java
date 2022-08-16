import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float boy,kilo,sonuc;

        System.out.print("Boyunuzu yazınız: ");
        boy = input.nextFloat();
        System.out.print("Kilonuzu yazınız: ");
        kilo = input.nextFloat();

        sonuc = kilo/(boy*boy);

        System.out.print("Vücut kitle endeksiniz: "+ sonuc);
    }
}