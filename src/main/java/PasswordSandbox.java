import org.mindrot.jbcrypt.BCrypt;

public class PasswordSandbox {

    public static void main(String[] args) {
        String password = "password123";
//        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hash);
//
//        hash = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hash);

        for (int i = 0;i<10;i++) {
            String salt = BCrypt.gensalt();
            System.out.println(salt);
            String hash = BCrypt.hashpw(password, salt);
            System.out.println(hash);
            System.out.println(BCrypt.checkpw("passWord123", hash));
        }
    }
}
