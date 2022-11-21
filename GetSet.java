package javaTut;

public class GetSet {

    public static void main(String[] args) {
        Customer obj =  new Customer();
        // System.out.println(obj.userName);
        System.out.println(obj.getUserName());
        // System.out.println(obj.provideUserName());
        obj.setUserName("Uncle Jhon");
        System.out.println(obj.getUserName());
        
    }
    
}

class Customer{
    private String userName;
    private String password;

    Customer(){
        this.userName = "aman";
        this.password = "1234";
    }
    Customer(String userName , String password){
        this.userName = userName;
        this.password = password;
    }
    // getter methods
    public String getUserName(){
        return this.userName;
    }
    // public String provideUserName(){
    //     return this.userName;
    // }

    public String getPassword(){
        return this.password;
    }
    // setter methods
    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
