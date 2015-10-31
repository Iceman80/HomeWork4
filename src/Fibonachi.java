public class Fibonachi {
    private static int f(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return f(index - 1) + f(index - 2);
        }
    }

    public static void main(String[] args) {

        boolean cont = true;
        int time;
        int count = 0;

        // №5

        System.out.println(" Task 5");
        for (int i = 1; cont; i++) {
            double timeStart = System.currentTimeMillis();
            f(i);
            double timeEnd = System.currentTimeMillis();
            time = (int) ((timeEnd - timeStart) / 60000);
            if (time > 1) cont = false;
            count = i;

        }

        System.out.println(" Time of calculation of numbers of Fibonachi is more than 1 minute since an " + count + " element");
    }
}
