import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Brand> brands = new TreeSet<>(new OrderByName());
        brands.add(new Brand("Samsung",1));
        brands.add(new Brand("Lenovo",2));
        brands.add(new Brand("Apple",3));
        brands.add(new Brand("Huawei",4));
        brands.add(new Brand("Casper",5));
        brands.add(new Brand("Asus",6));
        brands.add(new Brand("HP",7));
        brands.add(new Brand("Xiaomi",8));
        brands.add(new Brand("Monster",9));

        ArrayList<Notebooks> notebooks = new ArrayList<>();
        notebooks.add(new Notebooks(1,"HUAWEI Matebook 14","7000.0 TL","HUAWEI",512,14.0,16));
        notebooks.add(new Notebooks(2,"LENOVO V14 IGL","3699.0 TL","Lenovo",1024,14.0,8));
        notebooks.add(new Notebooks(3,"ASUS Tuf Gaming","8199.0 TL","Asus",2048,15.6,32));

        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1- Notebook İşlemleri\n" +
                "2- Cep Telefonu İşlemleri\n" +
                "3- Marka Listele\n" +
                "0- Çıkış Yap");

        System.out.print("Tercihiniz: ");

        int select = sc.nextInt();

        if(select == 1){
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("|ID|  Ürün Adı           |Fiyat    |Marka    |Depolama    |Ekran    |Ram  |");
            System.out.println("--------------------------------------------------------------------------------");
            for(Notebooks i: notebooks){
                System.out.println("|"+i.getId()+" | "+i.getName()+"  | "+i.getPrice()+" | "+i.getBrand()+" | "+i.getStorage()+" | "+i.getScreen()+" | "+i.getRam()+" |");
            }
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("1- Ürün Ekle\n2- Ürün Sil\n3- Çıkış Yap");
            System.out.print("Seçiminiz: ");
            int x = sc.nextInt();

            if(x == 1){
                System.out.print("Ürün ID'si: ");
                int id = sc.nextInt();
                System.out.print("Ürün adı: ");
                String name = sc.next();
                System.out.print("Ürün Fiyatı: ");
                String price = sc.next();
                System.out.print("Ürün Markası: ");
                String brand = sc.next();
                System.out.print("Depolama: ");
                int storage = sc.nextInt();
                System.out.print("Ekran Boyutu: ");
                double screen = sc.nextDouble();
                System.out.print("RAM: ");
                int ram = sc.nextInt();

                notebooks.add(new Notebooks(id,name,price,brand,storage,screen,ram));

                System.out.println("Ürün ekleme başarılı !\nGüncel Liste");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("|ID|  Ürün Adı           |Fiyat    |Marka    |Depolama    |Ekran    |Ram  |");
                System.out.println("--------------------------------------------------------------------------------");
                for(Notebooks i: notebooks){
                    System.out.println("|"+i.getId()+" | "+i.getName()+"  | "+i.getPrice()+" | "+i.getBrand()+" | "+i.getStorage()+" | "+i.getScreen()+" | "+i.getRam()+" |");
                }
                System.out.println("--------------------------------------------------------------------------------");
            }

            if(x == 2){
                System.out.print("Silmek istediğiniz ürünün ID'sini yazınız: ");
                int y = sc.nextInt();
                notebooks.remove(y-1);
                System.out.println("Silme işlemi başarılı !");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("|ID|  Ürün Adı           |Fiyat    |Marka    |Depolama    |Ekran    |Ram  |");
                System.out.println("--------------------------------------------------------------------------------");
                for(Notebooks i: notebooks){
                    System.out.println("|"+i.getId()+" | "+i.getName()+"  | "+i.getPrice()+" | "+i.getBrand()+" | "+i.getStorage()+" | "+i.getScreen()+" | "+i.getRam()+" |");
                }
                System.out.println("--------------------------------------------------------------------------------");
            }

            if(x == 3){
                System.out.println("İyi günler dileriz...");
                sc.close();
            }

        }

        if(select == 3){
            System.out.println("Markalarımız");
            System.out.println("---------------");
            for(Brand b: brands){
                System.out.println(b.getName());
            }
        }

        if(select == 0){
            System.out.println("İyi günler dileriz...");
            sc.close();
        }

    }
}