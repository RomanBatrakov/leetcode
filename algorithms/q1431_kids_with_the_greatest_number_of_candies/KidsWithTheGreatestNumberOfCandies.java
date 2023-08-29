package q1431_kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 *
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 *
 * Note that multiple kids can have the greatest number of candies.
 */
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> objects = new ArrayList<>();
        int largest = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            boolean isMore = (candy + extraCandies) >= largest;
            objects.add(isMore);
        }

        return objects;
    }
}
