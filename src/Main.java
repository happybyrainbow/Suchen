public class Main {
    public static void main(String[] args) {

        System.out.println(findeZahl(18));

    }

    public static int findeZahl(int gesuchteZahl) {

        int[] array = {1, 2, 5, 7, 8, 10, 12, 15, 18, 20};
        int l = 0;
        int r = array.length-1;

        while (l <= r) {
            int mitte = (l + r) / 2;
            if(array[mitte] == gesuchteZahl) {
                return mitte;
            }
            if (array[mitte] < gesuchteZahl) {
                l = mitte + 1;
            }
            if (array[mitte] > gesuchteZahl) {
                r = mitte - 1;
            }

        }
        return -1;
    }
}
