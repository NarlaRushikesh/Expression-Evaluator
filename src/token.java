public class token{
    String token_id;
    String token_value;
    token(){
        this.token_id="";
        this.token_value="";
    }
    token(String token_id, String token_value){
        this.token_id=token_id;
        this.token_value=token_value;
    }

    public  void print_token(){
        System.out.println("Token [ID: " + token_id + ", Value: " + token_value + "]");
    }
}