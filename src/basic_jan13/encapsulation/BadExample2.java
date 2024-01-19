package src.basic_jan13.encapsulation;

public class BadExample2 {
        public static void main(String[] args) {
            vwologin2 v = new vwologin2("admin","admin");

            boolean check = v.isloggedIn("admin","password");
            v.setUsername("admin");
            System.out.println(v.getPassword());

            boolean check2 = v.isloggedIn("admin","password");
            System.out.println(check);
        }
    }
    class vwologin2{


        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        private String username;

        public String getPassword() {
            return password;
        }

        private String password;


        public vwologin2(String username, String password) {
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
