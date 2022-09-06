import java.util.Scanner;

public class WithRecursivePower {

    static int power(int a, int b){
        if (b == 0){
            return 1;
        }
        return power(a,b-1)*a;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int a = inp.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int b = inp.nextInt();
        System.out.println("Sonuç: "+power(a,b));;
    }
}
