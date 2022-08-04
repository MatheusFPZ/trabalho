
import java.util.Scanner;
public class cinco {


    public static void main(String []args){

        Scanner ler = new Scanner(System.in);
        int idade=1;
        int somaidade=0;
        float mediaidade=0;
        int cont=0;
        for(int i=1; idade!=0; i++){


            System.out.println("digite a idade");
            idade= ler.nextInt();

            cont=cont+1;
            somaidade=idade+somaidade;

            mediaidade= somaidade/cont;

            System.out.println("media"+mediaidade);


        }

    }
}
