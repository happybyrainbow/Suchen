public class Suchen {

    public boolean findeZahl(int gesuchteZahl) {

        int[] array = {1, 2, 5, 7, 8, 10, 12, 15, 18, 20};
        int l = array[0];
        int r = array[array.length - 1];
        int mitte = (int)((l + r) / 2);

        while (r <= l) {
            if(mitte == gesuchteZahl) {
                return true;
            }
            if (array[mitte] < gesuchteZahl) {
                mitte /= 2;
                l = mitte + 1;
            }
            if (array[mitte] > gesuchteZahl) {
                mitte /= 2;
                r = mitte - 1;
            }

        }
        return false;
    }



}