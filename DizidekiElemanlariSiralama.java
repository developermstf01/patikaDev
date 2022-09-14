import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlariSiralama {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int n = inp.nextInt();

        int[] list = new int[n];

        for (int i = 1; i <= n; i++){

            System.out.print(i+". Elamanı giriniz: ");
            int x = inp.nextInt();
            list[i-1] = x;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
