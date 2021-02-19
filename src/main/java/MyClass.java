import java.util.Arrays;
import java.util.List;

public class MyClass {


    public int[] method1 (int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (arr[i]==4){
                int[] newArray = Arrays.copyOfRange(arr,i+1 , arr.length);
                return newArray;
            };
        };
        throw new RuntimeException ("Не содержит 4");
    }

    public boolean metod2 (int [] arr){
        boolean isContains1=false;
        boolean isContains4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i]!=4) {
                return false;
            }
            if (arr[i]==1){
                isContains1 = true;
            }
            if (arr[i] == 4) {
                isContains4 = true;
            }
        }
        return isContains1 && isContains4;
    }
}
