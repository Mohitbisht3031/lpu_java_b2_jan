package Day40;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandeling {

    public static String Extract(StringBuilder str){
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                // ans.append(str.charAt(i));
                int j = i;
                for(;j<str.length();j++){
                    if(str.charAt(i) >= '0' && str.charAt(i) <= '9')ans.append(str.charAt(j));
                }
                ans.append(" ");
                i = j;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        try{
            File obj = new File("Aditya.txt");
            if(obj.createNewFile())
            {    System.out.println("file generated!!");
            }else System.out.println("file not generated!!");

            if(obj.canRead())System.out.println("yes we can " + obj.getName() +" read it!!");
            System.out.println("the path of the file is "+obj.getAbsolutePath());
            System.out.println(obj.length());
            // System.out.println(obj.getParent());
            // if(obj.delete())System.out.println("file deleted!!");

            FileWriter wrt = new FileWriter(obj);
            wrt.write("Hey my name is aditya and i'm inactive in the classs!!! 10 20 40 23");
            wrt.close();

            Scanner sc = new Scanner(obj);
            while(sc.hasNextLine()){
                StringBuilder str = new StringBuilder(sc.nextLine());
                // str.reverse();
                String ans = Extract(str);
                System.out.println(ans);
            } 
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
