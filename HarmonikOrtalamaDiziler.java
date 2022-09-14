public class HarmonikOrtalamaDiziler {
    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5};

        double harmonikSeri = 0;

        for (int i = 0; i < list.length; i++){
            harmonikSeri += 1 / list[i];
        }
        System.out.println("Harmonik ortalama: "+list.length/harmonikSeri);
    }
}
