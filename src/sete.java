import java.util.ArrayList;
import java.util.Scanner;

public class sete {

    public static void main(String []args){

        //Cadastro de Candidatos
        Scanner ler= new Scanner(System.in);
        ArrayList<String> candidatos = new ArrayList<String>();
        String nome;

        int contvotos=0;
        int candidato=0;

        do {
            System.out.println("digite o nome do candidato");
            nome = ler.nextLine();


            candidatos.add(nome);
            if(nome.equals("0")){
            candidatos.remove(nome);

            }


        }while(!nome.equals("0"));




        //Votação:
        do{
            System.out.println("digite o numero do candidato na ordem começando em 0");
            candidato = ler.nextInt();

            System.out.println(candidatos.get(candidato));


            System.out.println("digite a quantidade de votos");
            contvotos = ler.nextInt();


        }while(candidato!=0);
    }


}
