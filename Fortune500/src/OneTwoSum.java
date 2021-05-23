import java.util.Arrays;

//Brute force solution
public class OneTwoSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int[] result = new int[2];
        int targrt = 7;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] +arr[j] == targrt){
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
