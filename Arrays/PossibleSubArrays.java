import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int count = 0;

        // Generate all subarrays
        for(int i = 0; i < n; i++){
            int sum = 0;

            for(int j = i; j < n; j++){
                sum += A[j];

                if(sum < 0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
