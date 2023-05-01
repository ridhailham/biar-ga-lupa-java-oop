public class Admin extends User{
    User u = new User();
    public void addUser(String username, String password) {
        u.username = username;
        u.password = password;

        
    }

    public void changeUserUsername(String username) {
        u.setUsername(username);
        System.out.println("admin telah mengubah username user");
    }

    public void changeUserPassword(String password) {
        u.setPassword(password);
        System.out.println("admin telah mengubah password user");
    }

    public void changeUsername(String username) {
        setUsername(username);
        System.out.println("username nama admin telah diubah");
    }

    public void changePassword(String password) {
        setPassword(password);
        System.out.println("password admin telah diubah");
    }


}
