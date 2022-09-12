import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    private List<Integer> sortedList;
    public BinarySearch(List<Integer> sortedList) {
        this.sortedList = sortedList;
    }
    public int indexOf(int value) {
        int res = -1;
        int left = 0, right = sortedList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedList.get(mid) == value) {
                res = mid;
            }
            if(sortedList.get(mid) < value){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        if (res == -1){
            throw new IllegalArgumentException("Value not in array");
        }
        return res;
    }


    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(List.of(1, 2, 3, 6, 7, 8, 9, 15, 16, 19));
        System.out.println(binarySearch.indexOf(16));

    }
}
