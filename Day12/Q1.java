/*
 * Print the index of the first non-repeating char of the string
 * or -1 if none
 */
public class Q1{
    // Approach 1 , TC : O(n^2) , SC : O(1)
    void unique(String s){
        int ind = -1;
        for(int i = 0;i<s.length();i++){
            boolean f = false;
            for(int j = 0;j<s.length();j++){
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    f = true;
                }
            }
            if(!f){
                ind = i;
                break;
            }
        }
        if(ind != -1){System.out.println("index of uniqure ele is "+ind +" val at this ind is "+s.charAt(ind));}
        else System.out.println("no uniqure char!!!");
    }

    // approach 2 , TC : O(N) , SC: O(1)
    void unique2(String s){
        int freq[] = new int[26];
        for(int i = 0 ;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        boolean f = false;
        for(int i = 0;i<s.length();i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                System.out.println("the index of unique char is "+i+ " val at this ind is "+s.charAt(i));
                f = true;
                break;
            }
        }
        if(!f){
            System.out.println("no unique char in it!!");
        }
    }
    public static void main(String[] args) {
        // String s = "Mohit";
        // for(char ch : s.toCharArray()){
        //     System.out.println(ch);
        // }
        StringBuilder str = new StringBuilder("mohit0");
        StringBuilder str2 = new StringBuilder("mohit0");

        if(str.compareTo(str2) == 0)System.out.println("same");
        else System.out.println("not same");

    }
}