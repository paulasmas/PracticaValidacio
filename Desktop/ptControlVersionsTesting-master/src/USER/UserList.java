
package USER;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
//Clase UserList que guarda tots els usuaris
public class UserList {
    //Crea un array list d'usuaris
    public ArrayList<User> userslist = new ArrayList<User>();
    
    //Afegeix un usuari a la llista si no existeix
    public void addUser(User a){
        if (userslist.contains(a)){
            System.out.println("El usuario ya existe.");    
        }
        else{
            userslist.add(a);
        }
    }
    
    //Elimina un usuari de la llista si existeix
    public void remove(User a){
        if (userslist.contains(a)){
            userslist.remove(a);
        }
        else{
            System.out.println("El usuario no esta registrado en la base de datos.");
        }
    }
    
    //Llegeix el json y guarda tots els usuaris del json a la array list
    public void JSONReader(){
    JSONParser parser = new JSONParser();  
        try {     
            Object obj = parser.parse(new FileReader("users.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("JSON READ");
            
            JSONArray array = (JSONArray) jsonObject.get("arrayUsers");
            System.out.println("");
            
            for(int i = 0 ; i < array.size() ; i++) {
                String user;
                String password;
                
                JSONObject jsonObject1 = (JSONObject) array.get(i);
                user = (String) jsonObject1.get("username");
                password = (String) jsonObject1.get("password");
                userslist.add(new User(user,password));
            }
            
        } 
        catch(FileNotFoundException e) { 
            System.out.println("Error al leer el fichero: "+e.getMessage());
        }
        catch(IOException e) { 
            System.out.println("Error IOException: "+e.getMessage());
        }
        catch(ParseException e) { 
            System.out.println("Error al convertir el contenido del fichero JSON. "+e.getMessage());
        }
    }
    //Comprova si un usuari esta en la arraylist d'usuaris
    public boolean userlogin(String username, String password){
      boolean result = false;
      for (int i = 0; i < userslist.size() && result == false ; i++) {
          if((userslist.get(i).username == null ? username == null : userslist.get(i).username.equals(username)) && (userslist.get(i).password == null ? password == null : userslist.get(i).password.equals(password))){
              result = true;
          }
      }
        return result;
    }
}
