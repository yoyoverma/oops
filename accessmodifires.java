package OOPS;
class Account {
    public String name;
    protected String email;
    private String password;

    //for private modifire use getters & setters
    public  String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}

public class accessmodifires {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Yoges verma";
        account1.email = "yogesh scsiafud.gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
