import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class scan{

    public static ArrayList<token> scanning(String str){
        ArrayList<token> tokens=new ArrayList<>();
        int n=str.length();
        int i=0;
        while(i<n){
            char c=str.charAt(i);
            if(c=='('){
                tokens.add(new token("Left Bracket",c+""));
                i++;
            }
            else if(c==')'){
                tokens.add(new token("Right Bracket",c+""));
                i++;
            }
            else if(c=='+'){
                tokens.add(new token("Plus sign",c+""));
                i++;
            }
            else if(c=='-'){
                tokens.add(new token("Minus sign",c+""));
                i++;
            }
            else if(c=='*'){
                tokens.add(new token("Multiplications sign",c+""));
                i++;
            }
            else if(c=='/'){
                tokens.add(new token("Division sign",c+""));
                i++;
            }
            else if(c=='s' && i + 2 < n && str.substring(i, i + 3).equals("sin")){
                tokens.add(new token("Angle","sin"));
                i+=3;
            }
            else if(c=='c' && i + 2 < n && str.substring(i, i + 3).equals("cos")){
                tokens.add(new token("Angle","cos"));
                i+=3;
            }
            else if(c=='t' && i + 2 < n && str.substring(i, i + 3).equals("tan")){
                tokens.add(new token("Angle","tan"));
                i+=3;
            }
            else{
                StringBuilder temp=new StringBuilder();
                while(i<n && Character.isDigit(str.charAt(i))){
                    temp.append(str.charAt(i));
                    i++;
                }
                tokens.add(new token("Number",temp.toString()));
            }
        }
        return tokens;
    }
    public static String readFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }
    public static ArrayList<token> tokenize(String filename) throws IOException{
       String input = readFile(filename);
       ArrayList<token> tokens = scanning(input);
       return tokens;
    }
    
}