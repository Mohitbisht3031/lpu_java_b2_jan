package Day16;
/*
 * Given an int array consisting of duplicates
 * print the majority element
 * element occuring more then equal to n/2 number of times is a majority element
 */
public class Q1 {
   void majority(int arr[]){
        int n = -1;
        for(int i = 0;i<arr.length;i++){
            int c = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j])c++;
            }
            if(c >= (arr.length-1)/2){
                n = arr[i];
                break;
            }
        }
        System.out.println("the number is"+n);
   } 
}
