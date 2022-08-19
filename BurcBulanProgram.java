import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int month, day;
        boolean isError = false;
        String burc = "";

        System.out.print("Kaçıncı ayda doğdunuz? : ");
        month = inp.nextInt();
        System.out.print("Hangi günde doğdunuz? : ");
        day = inp.nextInt();


        if ((month <= 12) && (month > 0)) {

            if (month == 1) {
                if ((day <= 21) && (day > 0)) {
                    burc = "Oğlak";
                } else if ((day <= 31) && (day > 21)) {
                    burc = "Kova";
                } else {
                    isError = true;
                }
            }
        } else {
            isError = true;
        }

        if ((month <= 12) && (month > 0)) {

            if (month == 2) {
                if ((day > 0) && (day <= 19)) {
                    burc = "Kova";
                } else if ((day <= 31) && (day >= 20)) {
                    burc = "Balık";
                } else {
                    isError = true;
                }
            }
        }

        if ((month <= 12) && (month > 0)) {
            if (month == 3) {
                if ((day > 0) && (day < 21)) {
                    burc = "Balık";
                } else if ((day >= 21) && (day <= 31)) {
                    burc = "Koç";
                } else {
                    isError = true;
                }
            }
        }


        if ((month <= 12) && (month > 0)) {
            if (month == 4) {
                if ((day > 0) && (day < 21)) {
                    burc = "Koç";
                } else if ((day >= 21) && (day <= 31)) {
                    burc = "Boğa";
                } else {
                    isError = true;
                }
            }
        }

        if ((month <= 12) && (month > 0)) {
            if (month == 5) {
                if ((day > 0) && (day <= 21)) {
                    burc = "Boğa";
                } else if ((day >= 22) && (day <= 31)) {
                    burc = "İkizler";
                } else {
                    isError = true;
                }
            }
        }

        if ((month <= 12) && (month > 0)) {
            if (month == 6) {
                if ((day > 0) && (day <= 22)) {
                    burc = "İkizler";
                } else if ((day >= 23) && (day <= 31)) {
                    burc = "Yengeç";
                } else {
                    isError = true;
                }
            }
        }

        if ((month <= 12) && (month > 0)) {
            if (month == 7) {
                if ((day > 0) && (day <= 22)) {
                    burc = "Yengeç";
                } else if ((day >= 23) && (day <= 31)) {
                    burc = "Aslan";
                } else {
                    isError = true;
                }
            }
        }

        if ((month <= 12) && (month > 0)) {
            if (month == 8) {
                if ((day > 0) && (day <= 22)) {
                    burc = "Aslan";
                } else if ((day >= 23) && (day <= 31)) {
                    burc = "Başak";
                } else {
                    isError = true;
                }
            }
        }


        if ((month <= 12) && (month > 0)) {
            if (month == 9) {
                if ((day > 0) && (day <= 22)) {
                    burc = "Başak";
                } else if ((day >= 23) && (day <= 31)) {
                    burc = "Terazi";
                } else {
                    isError = true;
                }
            }
        }

        if ((month <= 12) && (month > 0)) {
            if (month == 10) {
                if ((day > 0) && (day <= 22)) {
                    burc = "Terazi";
                } else if ((day >= 23) && (day <= 31)) {
                    burc = "Akrep";
                } else {
                    isError = true;
                }
            }
        }

        if ((month <= 12) && (month > 0)) {
            if (month == 11) {
                if ((day > 0) && (day <= 21)) {
                    burc = "Akrep";
                } else if ((day >= 22) && (day <= 31)) {
                    burc = "Yay";
                } else {
                    isError = true;
                }
            }
        }

        if ((month <= 12) && (month > 0)) {
            if (month == 12) {
                if ((day > 0) && (day <= 21)) {
                    burc = "Yay";
                } else if ((day >= 22) && (day <= 31)) {
                    burc = "Oğlak";
                } else {
                    isError = true;
                }
            }
        }

        if (isError) {
            System.out.print("Hatalı bir değer girdiniz !");
        } else {
            System.out.print("Hoşgeldiniz, burcunuz: " + burc);
        }
    }
}
