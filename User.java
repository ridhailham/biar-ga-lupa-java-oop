public class User {
    protected String username;
    protected String password;


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void registration(String username, String password) {
        this.username = username;
        this.password = password;

        System.out.println("registrasi akun berhasil");
    }
    
    public void login() {
        System.out.println("login akun berhasil");
        System.out.println();
        System.out.println("===AKUN===");
        System.out.println("my username : " + getUsername());
        System.out.println("my password : " + getPassword());
    }

    public void changeUsername(String username) {
        setUsername(username);
        System.out.println("user telah mengubah username");
    }

    public void changePassword(String password) {
        setPassword(password);
        System.out.println("user telah mengubah password");
    }



}
