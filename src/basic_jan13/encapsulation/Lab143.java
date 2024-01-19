package src.basic_jan13.encapsulation;

public class Lab143 {
    public static void main(String[] args) {
        vwologinFix v = new vwologinFix("admin","admin");

        boolean check = v.isloggedIn("admin","password");
        String username=v.getUsername();
        //String password=v.getpassword();
        //v.password="passwordf";//not possible because of encapsulation



        boolean check2 = v.isloggedIn("admin","password");
        System.out.println(check);
    }
}
class vwologinFix{


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;



    private String password;


    public vwologinFix(String username, String password) {
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



