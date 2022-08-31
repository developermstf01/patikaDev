import java.util.Scanner;
public class EbobEkokBuluyoruz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1, n2, i = 1, ebob = 1;

        System.out.print("n1 değerini giriniz: ");
        n1=inp.nextInt();
        System.out.print("n2 değerini giriniz: ");
        n2=inp.nextInt();


            while (i <= n1){
                if ((n1 % i == 0) && (n2 % i == 0)){
                    ebob = i;
                }
                i++;
            }
        System.out.println("EBOB değeri: "+ebob+"\nEKOK değeri: "+(n1 * n2)/ebob);

    }
}
