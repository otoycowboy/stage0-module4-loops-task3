package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int multiplier = 1;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += 9 * multiplier;
            multiplier = multiplier * 10 + 1;
        }
        System.out.println(sum);
    }
}
