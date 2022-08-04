import java.util.Scanner;

public class oito {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Character caracter;
        String texto;
        int vogal=0;



        System.out.println("digite o texto");
        texto = ler.nextLine();

        for(int i=0; i<texto.length();i++){
            caracter = texto.charAt(i);
            if(Character.isLetter(caracter)){

                if(caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u'){
                    vogal = vogal+1;
                }
            }




        }

        System.out.println("numero de vogais: "+ vogal);

    }




}
