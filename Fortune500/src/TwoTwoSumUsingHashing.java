import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoTwoSumUsingHashing {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 12;
        int[] result = new int[2];

        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement = target-arr[i];

            if(hm.containsKey(complement)){
                result[0] = hm.get(complement);
                result[1] = i;

            }

            hm.put(arr[i],i);
        }

        System.out.println("Two indexes are-->"+ Arrays.toString(result));

    }
}
