public class string {

    public static void main(String[] args) {
        // String s = "Mohit";
        // System.out.println(s);
        // // for(int i = 0;i<s.length();i++){
        // //     System.out.print(s.charAt(i));
        // // }
        // // System.out.println(s.concat(" we are in day 11"));
        // System.out.println(s.toLowerCase());
        // // .substr(); in c++
        // System.out.println(s.substring(1));
        // System.out.println(s.substring(1,5));
        StringBuilder str = new StringBuilder("mohit");
        System.out.println(str);
        str.append(" bISHT");
        System.out.println(str);

        StringBuffer s = new StringBuffer("Mohit");
        System.out.println(s);
        s.append(" Bisht");
        System.out.println(s);
        // String str = new String("MOHIT");
        // if(str.equalsIgnoreCase(s)){
        //     System.out.println("Same same");
        // }else System.out.println("same same but different!!");
        // if(s.contains("Mi")){
        //     System.out.println("we have this");
        // }else System.out.println("we don't have this!!");

        // System.out.println(s.replace('M', 'R'));
        // System.out.println(s);
    }
    
}
