package desafio3;

public class Desafio3 {
    /**
     * Enunciado
        Crie um programa que receba dois numeros como parametro e escreva todos
        os numeros do intervalo (ordem crescente) e tambem a soma.

        Entrada: 3 1
        Saida: 1, 2, 3 Soma: 5
        Entrada: 2 6
        Saida: 2,3,4,5,6 Soma: 20

        NAO USAR: Collections, Arrays, metodos utilitarios sort

     */

     public static void main(String[] args) {
        resolucaoDesafio(3, 1);
        resolucaoDesafio(20, 1);
     }

     public static void resolucaoDesafio(int num1, int num2){

        int maior;
        int menor;
        int soma = 0;
        String listaDeNumeros;

        if (num1 > num2){
            maior = num1;
            menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }
        
        listaDeNumeros = String.valueOf(menor); 
        for(int i = menor; i <= maior; i++){
            if(i != menor){
                listaDeNumeros += String.valueOf("," + i);
            }
            
            soma += i;
        }

        System.out.println(listaDeNumeros);
        System.out.println("Soma: " + soma);
     }
}
