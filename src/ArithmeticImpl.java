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
        Integer[] resheni = new Integer[2];
        if (!arrayList.isEmpty()) {
            resheni[0] = 0;
            resheni[1] = 0;
            for (int i : arrayList) {
                if (i > 0) {
                    resheni[0]++;
                    resheni[1] += i;
                }
            }
        }
        return resheni;
    }
}
