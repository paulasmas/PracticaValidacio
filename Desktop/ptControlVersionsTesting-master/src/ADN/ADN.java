
package ADN;
//Clase per fer operacions sobre cadenes de ADN
public class ADN {
    //Funció que Torna la cadena girada
    public String ADNTurn (String cadena){
        String cadenaTurn = "";
            for (int i = (cadena.length() - 1); i >= 0; i--){
                cadenaTurn += cadena.charAt(i);
            }
        return cadenaTurn;
    }
    //Valida si la cadena de ADN es correcta
    public boolean ADNValidation(String cadena){
        boolean resultado = true;
        char letra;
        for(int i = 0; i < cadena.length(); i++){
            letra = cadena.charAt(i);
            if(letra == 'A' || letra == 'a' || letra == 'C' ||
               letra == 'c' || letra == 'G' || letra == 'g' || 
               letra == 'T' || letra == 't'){
                
            } else {    
                resultado = false;
            }
        }
        return resultado;
    }
    //Valida si la cadena de ARN es correcta
    public boolean ARNValidation(String cadena){
        boolean resultado = true;
        char letra;
        for(int i = 0; i < cadena.length(); i++){
            letra = cadena.charAt(i);
            if(letra == 'A' || letra == 'a' || letra == 'C' ||
               letra == 'c' || letra == 'G' || letra == 'g' || 
               letra == 'U' || letra == 'u'){
                
            } else {    
                resultado = false;
            }
        }
        return resultado;
    }
    //Funció que Retorna la base menys frequent de la cadena donada de ADN
    public char unpopularBase(String cadena){
        int a = 0;
        int g = 0;
        int c = 0;
        int t = 0;
        char letra;
        char unpopularBase = 'X';
        for(int i = 0; i < cadena.length(); i++){
            letra = cadena.charAt(i);
            if(letra == 'A' || letra == 'a'){
                a++;
            }
            if(letra == 'G' || letra == 'g'){
                g++;
            }
            if(letra == 'C' || letra == 'c'){
                c++;
            }
            if(letra == 'T' || letra == 't'){
                t++;
            }
        }
        
        if(a<g && a<c && a<t){
           unpopularBase = 'A';
        }
            else if (g<a && g<c && g<t){
               unpopularBase = 'G'; 
            }
                else if (c<a && c<g && c<t){
                   unpopularBase = 'C'; 
                }
                    else if (t<a && t<c && t<g){
                       unpopularBase = 'T'; 
                    }
        
        return unpopularBase;   
    }
    //Funció que Retorna la base més frequent de la cadena donada de ADN
    public char popularBase(String cadena){
        int a = 0;
        int g = 0;
        int c = 0;
        int t = 0;
        char letra;
        char popularBase = 'X';
        for(int i = 0; i < cadena.length(); i++){
            letra = cadena.charAt(i);
            if(letra == 'A' || letra == 'a'){
                a++;
            }
            if(letra == 'G' || letra == 'g'){
                g++;
            }
            if(letra == 'C' || letra == 'c'){
                c++;
            }
            if(letra == 'T' || letra == 't'){
                t++;
            }
        }
        
        if(a>g && a>c && a>t){
           popularBase = 'A';
        }
            else if (g>a && g>c && g>t){
               popularBase = 'G'; 
            }
                else if (c>a && c>g && c>t){
                   popularBase = 'C'; 
                }
                    else if (t>a && t>c && t>g){
                       popularBase = 'T'; 
                    }
        
        return popularBase;   
    }
    ////Funció que conta les bases d'una cadena d'ADN donada
    public void countBase(String cadena){
    int a = 0;
    int g = 0;
    int c = 0;
    int t = 0;
    char letra;
    for(int i = 0; i < cadena.length(); i++){
        letra = cadena.charAt(i);
        if(letra == 'A' || letra == 'a'){
            a++;
        }
        if(letra == 'G' || letra == 'g'){
            g++;
        }
        if(letra == 'C' || letra == 'c'){
            c++;
        }
        if(letra == 'T' || letra == 't'){
            t++;
        }
    }
    System.out.println("Adenina(A)- " + a);
    System.out.println("Guanina(G)- " + g);
    System.out.println("Citosina(C)- " + c);
    System.out.println("Timina(A)- " + t);
    }
    //Converteix la cadena d'ADN a ARN
    public String ADNtoARN(String cadena){
       String ARN;
       ARN = cadena.replace("T","U");
       return ARN;
    }
    //Converteix la cadena d'ARN a ADN
    public String ARNtoADN(String cadena){
       String ARN;
       ARN = cadena.replace("U","T");
       return ARN;
    }
}
