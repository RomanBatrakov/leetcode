package q1342_number_of_steps_to_reduce_a_number_to_zero;

/**
* Given an integer num, return the number of steps to reduce it to zero.
* In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
*/
public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int stepsCount = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            stepsCount++;
        }
        return stepsCount;
    }
}
