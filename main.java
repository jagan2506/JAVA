package jagan;

public class main {
    public static void main(String[] args) {
        User u1 = new User(101, "JAGAN");
        User u2 = new User(101, "RAJ");
        User u3 = new User(102, "PARTHI");

        System.out.println("u1 equals u2? " + u1.equals(u2));  
        System.out.println("u1 equals u3? " + u1.equals(u3)); 

       
        System.out.println("HashCode of u1: " + u1.hashCode());
        System.out.println("HashCode of u2: " + u2.hashCode());
        System.out.println("HashCode of u3: " + u3.hashCode());

        java.util.HashSet<User> users = new java.util.HashSet<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);

        System.out.println("HashSet contents: " + users);
    }
}

