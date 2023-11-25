import java.util.ArrayList;

public class FindLeadersInArray {
    /**
     *Method finds the greatest elements to the right of the given element
     * @param arr The array of values of type int that are passed in
     * @return an arraylist containing the greatest elements
     */
    public static ArrayList<Integer> leaders(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ArrayList<Integer> result = new ArrayList();
        int max = arr[arr.length - 1];
        result.add(max);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                result.add(max);
            }
        }
        reverse(result);
        return result;
    }

    /**
     * Method that reverses the order of the array to put it in sequential order
     * @param arr the arraylist containing the greatest elements of type Integer
     */
    public static void reverse(ArrayList<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 72 ,4 ,1};
        System.out.println(leaders(nums));

    }
}
