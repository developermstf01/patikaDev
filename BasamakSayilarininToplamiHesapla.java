import java.util.Scanner;
public class BasamakSayilarininToplamiHesapla {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, basVal, result=0;

        System.out.print("Sayı giriniz: ");
        n = inp.nextInt();

        while (n != 0){
            basVal = n % 10;
            result += basVal;

            n = n/10;
        }

        System.out.println(result);
    }
}
