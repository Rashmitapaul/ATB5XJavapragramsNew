package src.basic_jan13.encapsulation;

public class BadExample {
    public static void main(String[] args) {
        vwologin v = new vwologin("admin","admin");

        boolean check = v.isloggedIn("admin","password");
        v.password="password";
        boolean check2 = v.isloggedIn("admin","password");
        System.out.println(check);
    }
}
class vwologin{


    public String username;
    public String password;


    public vwologin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean isloggedIn(String username, String password){
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)){
            System.out.println("Logged In");
            return true;
        }else {
            System.out.println("Wrong");
            return false;
        }
    }

}