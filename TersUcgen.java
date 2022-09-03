import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;

        System.out.print("Oluşturmak istediğiniz yıldızın satır sayısını giriniz: ");
        n = inp.nextInt();


        for (int i=1; i <= n; i++){

            for (int k = 1; k <= i; k++){
                System.out.print(" ");
            }

            for (int j = (2*n-1); j >=(2*i-1); j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
