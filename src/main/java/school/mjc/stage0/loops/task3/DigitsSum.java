package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        String numberLine = String.valueOf(t);
        for (int i = 0; i < numberLine.length(); i++) {
            if (Character.isDigit(numberLine.charAt(i)))
                sum += Character.getNumericValue(numberLine.charAt(i));
        }
        System.out.println(sum);
    }
}
