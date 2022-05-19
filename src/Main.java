import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(23);
        array.add(-1);
        System.out.println(Arithmetic.increase(2, 4));
        ArithmeticImpl arithmetic = new ArithmeticImpl();
        System.out.println(arithmetic.getSum(2, 4));
        System.out.println(arithmetic.getSum(array));
        arithmetic.getCountAndSum(array);
        System.out.println(Arrays.toString(arithmetic.getCountAndSum(array)));

        StringUtilImpl text = new StringUtilImpl();
        String fraza = "Лучшее решение - самое простое";
        System.out.println(text.getRevertedSubstring(fraza,1,15));
        System.out.println(text.countChar(fraza,'е'));
    }

}
