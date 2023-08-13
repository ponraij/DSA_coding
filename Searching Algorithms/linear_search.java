// Linear Search implementation in Java

// Time Complexity (best case): O(1)
// Time Complexity (wost case): O(N)
// Space Complexity : O(1)
// Auxiliary Space Complexity : O(N) due to function call stack

public class linear_search {
    private static void LinearSearch(int[] arr, int item) {

        for(int i=0;i < arr.length;i++){
            if(arr[i] == item)
            {
                System.out.println(item + " Found at index : " + i);
                return;
            }
        }
        System.out.println("Not found");

    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 25, -3, 19};

        int item = 25;
        LinearSearch(arr, item);
    }
}

// Space Complexity : O(N)
// Time Complexity : O(N)