import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class seis {

    public static void main(String[]args){


        Scanner ler = new Scanner(System.in);
        String nome;
        ArrayList<String> listanomes = new ArrayList<String>();

        for(int i=0; i<2; i++) {
            System.out.println("digite os nomes");
            nome = ler.nextLine();
            listanomes.add(nome);

        }
        Collections.sort(listanomes);
        System.out.println(listanomes);





    }


}