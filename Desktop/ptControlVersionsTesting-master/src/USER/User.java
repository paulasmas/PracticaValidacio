
package USER;


//Clase User on es guarden els usuaris
public class User {
    String username;
    String password;
    //Constructors
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User(){
        this.username = "";
        this.password = "";
    }
    //Getters i Setters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //Métode to string
    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + '}';
    }
}
