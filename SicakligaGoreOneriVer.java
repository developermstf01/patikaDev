import java.util.Scanner;

public class SicakligaGoreOneriVer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int heat;
        System.out.print("Sıcalık değerini giriniz: ");
        heat = inp.nextInt();

        if (heat < 25){

            if (heat < 5){
                System.out.print("Kayak yapabilirsin.");
            } else if (heat < 15) {
                System.out.print("Sinemaya gidebilirsin.");
            } else if (heat == 15) {
                System.out.print("Sinemaya veya pikniğe gidebilirsin.");
            } else {
                System.out.print("Pikniğe gidebilirsin.");
            }
        }else {
            System.out.print("Yüzmeye gidebilirsin.");
        }

    }
}
