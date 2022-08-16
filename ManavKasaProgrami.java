import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float armut,elma,domates,muz,patlican;
        float sArmut=2.14f,sElma=3.67f,sDomates=1.11f,sMuz=0.95f,sPatlican=5.0f;

        System.out.print("Armut kaç kilo?: ");
        armut = input.nextFloat();
        System.out.print("Elma kaç kilo?: ");
        elma = input.nextFloat();
        System.out.print("Domates kaç kilo?: ");
        domates = input.nextFloat();
        System.out.print("Muz kaç kilo?: ");
        muz = input.nextFloat();
        System.out.print("Patlıcan kaç kilo?: ");
        patlican = input.nextFloat();

        double toplamTutar = (armut*sArmut)+(elma*sElma)+(domates*sDomates)+(muz*sMuz)+(patlican*sPatlican);
        System.out.print("Toplam tutar: "+toplamTutar);
    }
}
