import java.util.Scanner;

public class dez {

    public static void main(String[] args) {


        Scanner ler= new Scanner(System.in);
        String texto;

        System.out.println("digite o texto");
        texto= ler.nextLine();
        int espaco=1;
        Character cha;


        for(int i=0; i<texto.length();i++){
            cha  = texto.charAt(i);


                if(cha>2){

                }
                if(cha==' '){
                    espaco= espaco+1;

                }

            }




        System.out.println("o numero de palavra e:"+ espaco);
    }


}
