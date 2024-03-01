package Day21;

/*
 * given a bniary string that will be having atleast one '1'
 * convert the string by rearraging the char to the greates possible odd number
 */

public class Q2 {

    String makeLargestOdd(String s){
        char arr[] = s.toCharArray();
        int c = 0;
        for(int i = 0;i<arr.length;i++){
            char ch = arr[i];
            if(ch == '1')c++;
            arr[i] = 0;
        }

        arr[arr.length-1] = '1';
        c--;

        int i = 0;
        while(c > 0){
            arr[i] = '1';
            i++;
            c--;
        }
        return arr.toString();
    }
    
}
