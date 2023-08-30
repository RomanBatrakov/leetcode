package q605_can_place_flowers;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be
 * planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and
 * false otherwise.
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int value = 0;

        if (n == 0 || (n == 1 && flowerbed.length == 1 && flowerbed[0] == 0)) return true;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {
                value++;
            } else {
                value = 0;
            }

            if (value > 2 || (value == 2 && (i == 1 || (i == flowerbed.length - 1 && flowerbed[i] == 0)))) {
                count++;
                value = 1;
            }

        }

        return count >= n;
    }
}
