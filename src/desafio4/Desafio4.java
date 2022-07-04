package desafio4;

public class Desafio4 {    

    public static void main(String[] args) {
        /**
         *  Enunciado
            Una dois arrays de inteiros em um unico array

            Regras:

            Nao é permitido uso de Collections ou java.util.Arrays
            Nao é permitido uso de arrays temporários, com exceçao do arrayConsolidado
            Ex.: ENTRADA

            [1, 3, 5, 7]
            [2, 4, 6, 8, 12, 15]
            SAIDA

            [1, 2, 3, 4, 5, 6, 7, 8, 12, 15]
         */


        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 12, 15};

        int[] array3 = new int[array1.length + array2.length];
        String saidaFormatada;

        for (int i = 0; i < array1.length; i ++){
            array3[i] = array1[i];
        }

        int cont = 0;
        for (int i =  array1.length; i < array3.length; i ++ ){
            array3[i] = array2[cont];
            cont ++;
        }

        saidaFormatada = String.format("[%d", array3[0]);
        for (int i : array3) {
            if(i != array3[0]){
                saidaFormatada += String.format(",%d", i);
            }
        }
        saidaFormatada += "]";

        System.out.println(saidaFormatada);
    }
}
