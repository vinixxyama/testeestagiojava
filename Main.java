import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
        int i,count;
        Scanner dia = new Scanner(System.in); 
        String entrada;
        String[] separador;
        ArrayList<String> comida = new ArrayList<>();
        ArrayList<String> cardapio = new ArrayList<>();
        //inicia os objetos
        refeicao teste = new refeicao();

        //pega a entrada com virgula
        entrada = dia.nextLine();
        //separa os valores das virgulas
        separador = entrada.split(",");

        while(separador[0].equals("morning") || separador[0].equals("night")){
            count = 0;
            //adiciona em um arraylist para usar separado
            for(i=0;i<separador.length;i++){
                comida.add(i,separador[i]);
            }
            //chama os metodos
            if(comida.get(0).equals("morning")){
                cardapio = teste.manha(comida);
            }else{
                cardapio = teste.noite(comida);
            }
            //imprimi o output
            for(i=0;i<cardapio.size();i++){
                System.out.print(cardapio.get(i));
            }
            System.out.println();

            //pega a entrada com virgula
            entrada = dia.nextLine();
            //separa os valores das virgulas
            separador = entrada.split(",");
            comida.clear();
        }
	}	 
}