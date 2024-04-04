
/* given a MxN grid of char named board
 * givn a string name word
 * have to find if there is continues way of making word in this board while
 * traveling to horizontal or vertical neibours. Note u can only travel one cell
 * only once
 */
public class Q1 {

    boolean dfs(char b[][],int i,int j,int wi,String w){
        if(wi >= w.length())return true;
        if(i < 0 || i >= b.length || j < 0 || j>= b[0].length || b[i][j] != w.charAt(wi))return false;

        

    }
    boolean check(char b[][] , String word){
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[0].length;j++){
                if(word.charAt(0) == b[i][j]){
                    if(dfs(b,i,j,0,word))return true;
                }
            }
        }
        return false;
    }
}
