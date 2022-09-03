public class BirVeYuzArasindakiAsalSayilar {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 2; i <= 100; i++) {

            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    counter++;
                }
            }
            //counter sıfırdan farklı bir değer alarak gelirse if koşulunu atlar ve "i" değerini yazmaz.
            if (counter == 0) {
                System.out.println(i);
            }
            counter = 0;
        }
    }
}
