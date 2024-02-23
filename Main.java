
package user;

public class Main {
    public static void main(String[] args) {
        
        User user = new User("aaa", "bbb");
        User user1 = new User();
        
        user.setUsername( "Lol");
        user.setPassword("Lil");
        user.setId(123);
        user.setStatus(true);
        
        System.out.println("Username : "+ user.getUsername());
        System.out.println("Password :"+ user.getPassword());
        System.out.println("Id : "+ user.getId());
        System.out.println("Status : "+ user.isStatus());
    }
}
