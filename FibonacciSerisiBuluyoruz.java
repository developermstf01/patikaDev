import java.util.Scanner;
public class FibonacciSerisiBuluyoruz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısı giriniz : ");
        int a = inp.nextInt();
        int fib = 0, top, n=1;

        for (int i=1; i<=a; i++){

            top=fib;
            fib+=n;

            System.out.print(fib+" ");
            n=top;
        }
    }
}
