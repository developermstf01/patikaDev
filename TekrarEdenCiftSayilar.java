import java.util.Arrays;

public class TekrarEdenCiftSayilar {

    static boolean isFind(int[] arr, int value){

        for (int x: arr){
            if (x == value) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] myList = {1,4,5,7,4,10,13,2,10,9,2,7,1};
        int[] duplicate = new int[myList.length];
        int x = 0;

        for (int i = 0; i < myList.length; i++){

            for (int j = 0; j < myList.length; j++){

                if ((i != j) && (myList[i] == myList[j])){

                    if (!isFind(duplicate, myList[i]) && (myList[i] % 2 == 0)){
                        duplicate[x++] = myList[j];
                    }
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar: ");
        for (int k: duplicate){
            if (k != 0) System.out.println(k);
        }

    }
}
