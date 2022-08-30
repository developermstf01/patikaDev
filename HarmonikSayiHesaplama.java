import java.util.Scanner;
public class HarmonikSayiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        double n = inp.nextFloat(), i, result = 0;
        i = 1;
        while (i <= n){
            result += 1/i;
            i++;
        }
        System.out.print("Harmonik ortalama: "+result);
    }
}
