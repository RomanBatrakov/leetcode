package q1431_kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
