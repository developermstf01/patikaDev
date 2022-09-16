import java.util.Scanner;
public class MatrisTranspozunuBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matris için satır boyutu giriniz : ");
        int n = input.nextInt();
        System.out.print("Matris için sütun boyutu giriniz : ");
        int m = input.nextInt();
        int[][] matris = new int[n][m];
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((i + 1) + ". satır - " + (j + 1) + ". sütun : ");
                matris[i][j] = input.nextInt();
            }
            System.out.print("\n");
        }
        System.out.println("Matris :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + matris[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Transpoze :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matris[j][i]);
            }
            System.out.print("\n");
        }

    }
}
