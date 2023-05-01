public class main {

    public static void main(String[] args) {
        User u1 = new User();
        u1.registration("ridha ilham", "1234");
        u1.login();

        User a1 = new Admin();
        a1.registration("ilham", "2345");
        a1.login();

    }
}
