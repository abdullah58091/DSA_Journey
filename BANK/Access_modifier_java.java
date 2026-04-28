

class Account {
    public String name6 ;
    protected String email;
    private String password ;


    public void  setPassword(String password) {
        this.password = password;
    }
        public String getPassword() {
            return password;
        }

}

public class Access_modifier_java {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.name6 = "abdullah";
        acc.email= "abdullah@gamil.com";
        acc.setPassword("abdc");

        System.out.println(acc.name6);
        System.out.println(acc.email);
        System.out.println(acc.getPassword());


    }
}
