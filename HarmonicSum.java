public class HarmonicSum {
    public static void main(String[] args) {
        int[] list = {1,3,8,456,46,1123, -65, 71,-11};

        double sum = 0.0;
        for(int i = 0; i < list.length; i++){
            sum += 1 / list[i];
        }
        double avarage = sum / list.length;
        System.out.println(avarage);

    }
}