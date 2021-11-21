package TEST;

import ADN.ADN;
import USER.User;
import USER.UserList;
import mainClass.PracticaVersionsYTesting;
import java.io.IOException;
import java.util.List;

//Clase per fer proves DAOTest
public class DAOTest {
    
    public static void main(String[] args) throws IOException {

        //Comprovem que els users s'importen bé del json
        UserList usersTest = new UserList();
        ADN adn = new ADN();
        usersTest.JSONReader();
        for(int i = 0; i< usersTest.userslist.size() ; i++) {
            usersTest.userslist.get(i).toString();
        }
        System.out.println("User Test Correct!!");
        
        //Mirem si la funció login funciona
        boolean loginExist = usersTest.userlogin("ivan","1234");
        System.out.println(loginExist?"SÍ":"NO");
        
        boolean loginNew = usersTest.userlogin("test","test");
        System.out.println(loginNew?"SÍ":"NO");

        //Proves de el paquet de ADN per operar sobre cadenes de ADN
        System.out.println(adn.ADNValidation("AGGGAAAT"));
        System.out.println(adn.ADNValidation("AGGGAAAX"));
        System.out.println(adn.ADNTurn("AAAGX"));
        System.out.println(adn.ADNtoARN("AAAGGGTTT"));
        System.out.println(adn.ADNtoARN("AAAGGGTSSADSTT"));
        System.out.println(adn.ARNtoADN("AGGUU"));
        System.out.println(adn.ARNtoADN("AGASDADGUU"));
        System.out.println(adn.popularBase("AAAAAGCT"));
        System.out.println(adn.unpopularBase("AAAGGGCCT"));
    }
    public void testLong1(){
        System.out.println("la logitud es correcta");
    }
    public void testLong2(){
        System.out.println("la logitud no correcta");

    }
    public void testLong3(){
        System.out.println("Error");
    }
    
}