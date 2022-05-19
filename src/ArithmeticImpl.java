import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticImpl implements Arithmetic {
    @Override
    public double getSum(double number1, double number2) {

        return number1 + number2;
    }

    @Override
    public int getSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int arr : arrayList) {
            sum += arr;
        }
        return sum;
    }

    @Override
    public Integer[] getCountAndSum(ArrayList<Integer> arrayList) {
        Integer[] resh = new Integer[2];
        if (!arrayList.isEmpty()) {
            resh[0] = 0;
            resh[1] = 0;
            for (int i : arrayList) {
                if (i > 0) {
                    resh[0]++;
                    resh[1] += i;
                }
            }
        }
        return resh;
    }
}
