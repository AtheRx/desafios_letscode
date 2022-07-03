package desafio2;

import java.util.TreeSet;

public class Desafio2 {

    public static void main(String[] args) {
        /**
        Enunciado
        Crie um programa que recebe duas listas de números separadas por vírgula. 
        Criar uma terceira lista para unir as duas listas recebidas, eliminando os itens repetidos. 
        Imprimir a lista final em ordem decrescente.

        Entrada:

        Lista 1 => 1,2,3,4
        Lista 2 => 2,5
        Saida: 5,4,3,2,1 
        */

        TreeSet<Integer> numeros = new TreeSet<>();
        String listaDeNumeros = "1,2,3,4";
        String listaDeNumeros2 = "2,5";
        String listaDeNumeros3 = listaDeNumeros.trim() + "," + listaDeNumeros2.trim();

        for (String numero : listaDeNumeros3.split(",")){
            numeros.add(Integer.parseInt(numero));
        }

        numeros = (TreeSet<Integer>) numeros.descendingSet();
        System.out.println(numeros);
    }
    
}
