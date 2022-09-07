import java.util.Scanner;
public class DeseneGoreMetotOlusturma {

    static void cikti(int n){
        if (n > 0){
            System.out.print(n + " ");

            cikti(n - 5);
        }System.out.print(n +" ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = scan.nextInt();
        System.out.print("Çıktısı : ");
        cikti(n);
        System.out.println();
        scan.close();
    }
}
