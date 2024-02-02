package Day9;

public class multi {
    public static void main(String[] args) {
        // way 1
        int arr [][] = {{1,2},
                        {3,4,5,6,7},
                        {8,9,10}};

        // way 2
        // int arr2[][] = new int[2][3];
        // arr2[0][0] = 1;
        // for(int i = 0;i<arr.length;i++){
        //     for(int j = 0;j<arr[i].length;j++)System.out.print(arr[i][j]+" ");
        //     System.out.println();
        // }
        for(int[] arr3:arr){
            for(int e : arr3)System.out.print(e+" ");
            System.out.println();
        }
        // System.out.println(arr[0][0]);
    }
}
