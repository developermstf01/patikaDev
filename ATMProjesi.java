import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        int balance = 1000, kullanimHakki = 3, select;

        while (kullanimHakki > 0) {

            System.out.print("Kullanıcı adınız: ");
            userName = inp.nextLine();
            System.out.print("Şifreniz: ");
            password = inp.nextLine();

            if (userName.equals("java") && password.equals("patika123")) {

                System.out.println("Merhaba. Bankamıza hoşgeldiniz !");

                do {

                    System.out.print("1-Para yatırma\n2-Para çekme\n3-Bakiye sorgulama\n4-Çıkış yapma\n" +
                            "Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırmak istediğiniz miktarı yazınız: ");
                            int price = inp.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye !");
                            } else {
                                balance -= price;
                            }
                        }
                        case 3 -> System.out.println("Bakiyeniz: " + balance);
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                kullanimHakki--;

                if ((kullanimHakki == 1) || (kullanimHakki == 2)) {
                    System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.\nKalan hakkınız: " + kullanimHakki);
                } else {
                    System.out.println("Hesabınız bloke olmuştur. Bankanız ile görüşünüz.");
                }
            }
        }
    }
}
