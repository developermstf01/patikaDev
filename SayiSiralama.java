import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;

        System.out.print("Birinci sayı: ");
        a = inp.nextInt();
        System.out.print("İkinci sayı: ");
        b = inp.nextInt();
        System.out.print("Üçüncü sayı: ");
        c = inp.nextInt();

        if ((a<b) && (a<c)){
            if(b<c){
                System.out.print("c > b > a");
            }else {
                System.out.print("b > c > a");
            }
        } else if ((b<c) && (b<a)) {
            if(a < c){
                System.out.print("c > a > b");
            }else {
                System.out.print("a > c > b");
            }
        }else {
            if(a < b){
                System.out.print("a > b > c");
            }else {
                System.out.print("a > b > c");
            }
        }
    }
}
