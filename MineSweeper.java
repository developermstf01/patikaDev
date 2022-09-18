import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    String[][] withMine;
    String[][] withoutMine;
    int x;
    int y;
    boolean isFinish;
    boolean isWin;
    int conditionToWin;

    public MineSweeper(int x, int y) {
        this.withMine = new String[x][y];
        this.withoutMine = new String[x][y];
        this.x = x;
        this.y = y;
        this.isFinish = false;
        this.isWin = false;
    }

    public void stringFill() {
        for (int i = 0; i < withMine.length; i++) {
            for (int j = 0; j < withMine[i].length; j++) {
                withMine[i][j] = "-";
                withoutMine[i][j] = "-";
            }
        }
    }

    public void minePlacement() {
        Random random = new Random();

        int n = (this.x * this.y) / 4;

        this.conditionToWin = (this.x * this.y) - n;

        for (int i = 0; i < n; i++) {

            int randomX = random.nextInt(x);
            int randomY = random.nextInt(y);

            if (withMine[randomX][randomY] == "*") i--;
            else withMine[randomX][randomY] = "*";
        }
    }

    public void print(int a) {
        if (a == 1) {
            System.out.println("Mayınların Konumu: ");
            print(withMine);
            System.out.println("================================");
            System.out.println("Mayın tarlasına Hoşgeldiniz!");
        } else {
            System.out.println("================================");
            print(withoutMine);
        }
    }

    public void print(String[][] arr) {
        for (String[] tmp : arr) {
            for (String tmp2 : tmp) System.out.print(tmp2 + " ");
            System.out.println("");
        }
    }

    public int control(int satir, int sutun) {
        int count = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (satir + i < 0 || sutun + j < 0 || satir + i >= x || sutun + j >= y || (i == 0 && y == 0)) continue;
                if (withMine[satir + i][sutun + j].equals("*")) count++;
            }
        }
        return count;
    }

    public void run() {
        stringFill();
        minePlacement();
        print(1);
        Scanner inp = new Scanner(System.in);
        while (!isFinish) {
            print(0);
            System.out.print("Satır Giriniz: ");
            int satir = inp.nextInt();
            System.out.print("Sütun Giriniz: ");
            int sutun = inp.nextInt();

            if (satir < 0 || satir >= x || sutun < 0 || sutun >= y) {
                System.out.println("Girilen değerlerde hata var. Lütfen tekrar giriniz: ");
                continue;
            } else {
                if (withMine[satir][sutun].equals("*")) {
                    System.out.println("Game Over!!");
                    System.out.println("================================");
                    isFinish = true;
                    isWin = false;
                    break;
                } else {
                    conditionToWin--;

                    if (conditionToWin <= 0) {
                        System.out.println("Oyunu Kazandınız!!");
                        System.out.println("================================");
                        isFinish = true;
                        isWin = true;
                        break;
                    } else {
                        int count = control(satir, sutun);
                        withoutMine[satir][sutun] = String.valueOf(count);
                    }
                }
            }
        }
    }
}