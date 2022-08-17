import java.util.Scanner;
public class KullaniciAdiSifreProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password, nPassword;
        int durum;

        System.out.print("Kullanıcı adını giriniz: ");
        userName = inp.nextLine();
        System.out.print("Şifre giriniz: ");
        password = inp.nextLine();

        String userPassword = password;


        if (userName.equals("java") && password.equals("patika")){
            System.out.print("Başarılı bir şekilde giriş yaptınız !");
        }else {
            
            System.out.print("Hatalı giriş yaptınız ! Şifrenizi yenilemek ister misiniz?\n1-Evet\n2-Hayır\n");
            durum = inp.nextInt();

            if (durum == 1) {

                Scanner girdi = new Scanner(System.in);
                System.out.print("Yeni şifrenizi giriniz: ");
                nPassword = girdi.nextLine();

                if(nPassword.equals(userPassword) || nPassword.equals("patika")){
                    System.out.print("Şifre oluşturulamadı ! Lütfen başka şifre giriniz");
                }else {
                    System.out.print("Şifreniz yenilendi !");
                }
                
            } else if (durum == 2) {
                System.out.print("Oturum sonlandırıldı !");
            }
        }
    }
}
