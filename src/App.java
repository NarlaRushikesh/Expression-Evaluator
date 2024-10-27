import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<token> tokens=scan.tokenize("D:\\Myjava\\src\\evaluator\\src\\text.txt");
        for(token t: tokens){
            t.print_token();
        }
    }
}
