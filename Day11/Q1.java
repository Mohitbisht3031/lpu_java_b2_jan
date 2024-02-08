public class Q1 {
    // variable arguments
    int max(int... v){
        System.out.println(v.length);
        int maxi = 0;
        // for(int e : v){
        //     maxi = Math.max(maxi,e);
        //     System.out.print(e+" ");
        // }
        for(int i = 0;i<v.length;i++){
            int e= v[i];
            maxi = Math.max(maxi,e);
        }
        System.out.println();
        return maxi;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 6;
        int d = 50;
        Q1 obj = new Q1();
        // int maxi = Math.max(a, b);
        int maxi = obj.max(a,b);
        System.out.println("Max  " + maxi);
        maxi = obj.max(a,b,c);
        System.out.println("Max is " + maxi);
        maxi = obj.max(a,b,c,d);
        System.out.println("Max is " + maxi);
    }
}
