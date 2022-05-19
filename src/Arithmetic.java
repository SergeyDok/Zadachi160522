import java.util.ArrayList;
public interface Arithmetic {
    static void sum2() {
        System.out.println(2 + 2);
    }


    static int increase(int number1, int number2) {
        return number1 * number2;
    }

    double getSum(double number1, double number2);

    int getSum(ArrayList<Integer>arrayList);
    Integer[] getCountAndSum(ArrayList <Integer> arrayList);
}

