import java.util.Scanner;
public class DortVeBesinKatlari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;

        System.out.print("Sınır değeri giriniz: ");
        n = inp.nextInt();

        System.out.println("4'ün katları: ");
        for (int i=1; i <= n; i*=4){
            System.out.println(i);
        }

        System.out.println("------------------------");
        System.out.println("5'in katları: ");
        for (int j=1; j<=n; j*=5){
            System.out.println(j);
        }
    }
}
