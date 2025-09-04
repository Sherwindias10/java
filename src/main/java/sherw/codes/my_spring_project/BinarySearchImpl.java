package sherw.codes.my_spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println("Using: " + sortAlgorithm.getClass().getSimpleName());

        // Binary search logic
        int left = 0, right = sortedNumbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedNumbers[mid] == numberToSearchFor) {
                return mid;
            }

            if (sortedNumbers[mid] < numberToSearchFor) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }
}
