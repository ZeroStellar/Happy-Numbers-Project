package student.zernil.classpractice;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
    int sum = 0;
    List<Integer> nSplit = new ArrayList<>();
    Calculation(){
    }
    private List<Integer> numberCheck(int n) {
        nSplit.clear();
        if (n > 9) {
            String nString = String.valueOf(n);
            char[] nArray = nString.toCharArray();
            for (char a : nArray) {
                int addThis = Character.getNumericValue(a);
                nSplit.add(addThis);
            }
            return nSplit;
        } else {
            nSplit.add(n);
            return nSplit;
        }
    }
    public int runCalculator(int n) {
        int sum = 10;
        while (sum > 1) {
            numberCheck(n);
            n = 0;
            for (int i = 0; i < nSplit.size(); i++) {
                int num = nSplit.get(i);
                int square = num * num;
                nSplit.set(i, square);
            }
            for (int i = 0; i < nSplit.size(); i++) {
                n = nSplit.get(i) + n;
                sum = n;
            }
            System.out.println(n);
        }
        return sum;
    }
}
