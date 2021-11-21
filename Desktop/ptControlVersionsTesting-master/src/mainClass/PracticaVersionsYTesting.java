
package mainClass;
import ADN.ADN;
import USER.*;
import java.util.Scanner;

public class PracticaVersionsYTesting {
    static UserList users = new UserList();
    static ADN adn = new ADN();
    
    public static final String[] ADNMenu = {
        "Exit",
        "Turn a strand of DNA",
        "Find the most repeated base",
        "Find the base less repeated",
        "Count the bases and show them.",
        "Convert RNA to DNA.",
        "Convertir DNA a RNA",
        "Longitud ADN"
     };
    
    public static void main(String[] args) {
        JSONUsers();
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        //Llegeix username y password que introdueixi l'usuari
        do{
            System.out.println("Type an option:");
            System.out.println("0- Exit");
            System.out.println("1- Login");
            try{
                //Agafem per scanner l'opció que ha seleccionat l'usuari
                option = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Option not valid.");
            }
            //Si ha accedit a login demanem l'username y password
            if (option == 1){
                System.out.println("Enter username: ");    
                String username = scanner.next();
                System.out.println("Enter password: ");  
                String password = scanner.next();
                //Comprovem que l'usuari que ha escrit existeix
                boolean loginOK = users.userlogin(username, password);
                //Si existeix continua
                if(loginOK == true) {
                    System.out.println("Login correct. Welcome to ADNManager!");
                    int opcion = -1;
                    //Se li mostra un menú per operar amb cadenes d'ADN y se li demana una opció
                    do{
                        menuADN();
                            try{
                                System.out.println("Type an option:");
                                opcion = scanner.nextInt();
                            }catch(Exception e){
                                    System.out.println("Format option incorrect!");
                            }
                            String cadena;
                            boolean valid;
                            //Depen de l'opció que escolleixi se li fara una operació amb la cadena d'adn o una altre de la clase ADN
                            switch (opcion) {
                                case 0:
                                  System.out.println("Thank you for using the aplication.");
                                  break;
                                case 1:
                                    System.out.println("Type de ADN Strand:");
                                    cadena = scanner.next();
                                    valid = adn.ADNValidation(cadena);
                                    if(valid == true){
                                        System.out.println("Turn ADN Strand:");
                                        System.out.println(adn.ADNTurn(cadena));
                                    }
                                    else{
                                        System.out.println("ADN format not valid.");
                                    }
                                    break;
                                case 2: 
                                    System.out.println("Type de ADN Strand:");
                                    cadena = scanner.next();
                                    valid = adn.ADNValidation(cadena);
                                    if(valid == true){
                                        System.out.println("Most Repeated base in ADN Strand:");
                                        System.out.println(adn.popularBase(cadena));
                                    }
                                    else{
                                        System.out.println("ADN format not valid.");
                                    }
                                    break;
                                case 3: 
                                    System.out.println("Type de ADN Strand:");
                                    cadena = scanner.next();
                                    valid = adn.ADNValidation(cadena);
                                    if(valid == true){
                                        System.out.println("Less Repeated base in ADN Strand:");
                                        System.out.println(adn.unpopularBase(cadena));
                                    }
                                    else{
                                        System.out.println("ADN format not valid.");
                                    }
                                    break;
                                case 4: 
                                    System.out.println("Type de ADN Strand:");
                                    cadena = scanner.next();
                                    valid = adn.ADNValidation(cadena);
                                    if(valid == true){
                                        System.out.println("Base Count in ADN Strand:");
                                        adn.countBase(cadena);
                                    }
                                    else{
                                        System.out.println("ADN format not valid.");
                                    }
                                    break;
                                case 5: 
                                    System.out.println("Type de RNA Strand:");
                                    cadena = scanner.next();
                                    valid = adn.ARNValidation(cadena);
                                    if(valid == true){
                                        System.out.println("DNA Strand:");
                                        System.out.println(adn.ARNtoADN(cadena));
                                    }
                                    else{
                                        System.out.println("ADN format not valid.");
                                    }
                                    break;
                                case 6: 
                                    System.out.println("Type de DNA Strand:");
                                    cadena = scanner.next();
                                    valid = adn.ADNValidation(cadena);
                                    if(valid == true){
                                        System.out.println("RNA Strand:");
                                        System.out.println(adn.ADNtoARN(cadena));
                                    }
                                    else{
                                        System.out.println("ADN format not valid.");
                                    }
                                    break;
                                default:
                                    System.out.println("Invalid option.");
                                    break;
                            }             
                        }while(opcion != 0);
                    }else{System.out.println("Invalid login.");}
            }else{}
        }while(option != 0); 
    }
    
    //Funció que crida a la funció de UserList per llegir el json y implementarlo a l'array d'usuaris
    public static void JSONUsers(){
        users.JSONReader();
    }
    
    //Funció per imprimir el menú d'ADN
    public static void menuADN(){
        System.out.println("------------------------------");
        System.out.println("Select an option:");  
        for (int i = 0; i < ADNMenu.length; i++) {
            System.out.println(i + " - " + ADNMenu[i]);
        }
        System.out.println("------------------------------");
    }
    

    
}
