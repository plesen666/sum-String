public class SumChetnye {


    public static int sumCh(int a) {
        int count = 0;
        for (int i = 0; i < 11; i++) {

            if (i % 2 == 0) {
                count += i;
            }
        }
        return count;
    }
}
