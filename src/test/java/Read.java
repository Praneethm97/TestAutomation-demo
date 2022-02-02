
import java.util.Scanner;

public class Read {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {5,3,9,4,2,1};
        int temp;
        for(int i=1;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-2;j++)
            {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i:arr) System.out.println(i);

    }
}
