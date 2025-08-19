package jagan;


public class User {
 private int id;
 private String name;

 
 public User(int id, String name) {
     this.id = id;
     this.name = name;
 }


 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }


 @Override
 public boolean equals(Object obj) {
     if (this == obj) {
         return true;
     }
     if (obj == null || getClass() != obj.getClass()) {
         return false; 
     }
     User other = (User) obj;
     return id == other.id && name.equals(other.name);
 }


 @Override
 public int hashCode() {
     return id * 31 + name.hashCode();
 }

 
 @Override
 public String toString() {
     return "User{id=" + id + ", name='" + name + "'}";
 }
}
