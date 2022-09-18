import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Mayın tarlasının satır sayısını belirleyiniz: ");
        int x = inp.nextInt();
        System.out.print("Mayın tarlasının sütun sayısını belirleyiniz: ");
        int y = inp.nextInt();
        MineSweeper ms = new MineSweeper(x,y);
        ms.run();
    }
}