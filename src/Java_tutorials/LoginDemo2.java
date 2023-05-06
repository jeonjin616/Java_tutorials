package Java_tutorials;

public class LoginDemo2 {
    public static void main(String[] args) {
        String id = args[0];
        String Password = args[1];
        if (id.equals("egoing")){
            if (Password.equals("1111")){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            System.out.println("wrong");
        }
    }
}
