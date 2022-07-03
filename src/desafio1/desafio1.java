package desafio1;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Desafio1 {
/**
 *@Enunciado
 * 
 * Escreva um algoritmo que receba um parâmetro String.
 *
 * Verificar se há 3 letras "X" em sequência entre dois números que somam 8.
 * Exemplo: frdts2XXX6xxbl2XXXeee5
 *
 * Retorna true pois a String possui a combinação "2XXX6" (Sequencia de 3 "X" entre os números 6 e 2 que somam 8).
 * 
 *  
 */
    public static void main(String[] args) throws Exception {
        List<String> expressions = new ArrayList<>();
        expressions.add("frdts1XXX1xxbl2XXX6eee5"); // expect true
        expressions.add("frdts1XXX7xxbl1XXX7eee5"); // expect true
        expressions.add("frdts1XXX7xxbl1XXX1eee5"); // expect true
        expressions.add("frdts1XXX1xxbl1XXX1eee5"); // expect false
        expressions.add("frdtasasdsxxbasaedleee5"); // expect false

        expressions.forEach(expression ->  validExpression(expression));   
    }



    public static void validExpression(String expression){
        if (isValid(expression)) {
            
            Matcher matcher = findGroups(expression);
    
            while(matcher.find()){
                String group = matcher.group().toString();
                List<Integer> numbers = getNumbers(group);

                if(isEqualEight(numbers)){
                    System.out.println(true);
                    break;
                }                
            }

            if (matcher.hitEnd()){
                System.out.println(false);  
            }

        }else{
            System.out.println(false);
        }

    }

    public static List<Integer> getNumbers(String group){
        List<Integer> numbers = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\d").matcher(group);
        while(matcher.find()){
            numbers.add(Integer.parseInt(matcher.group()));
        }

        return numbers;
    }

    public static boolean isEqualEight(List<Integer> numbers){
        int sum = numbers.get(0) + numbers.get(1);

        if (sum == 8){
            return true;
        }

        return false;   
    }

    public static Matcher findGroups(String text){
        Pattern pattern = Pattern.compile("\\dX{3}\\d");
        Matcher matcher = pattern.matcher(text);

        return matcher;
    }

    public static boolean isValid(String text){
        return Pattern.compile(".*\\dX{3}\\d.*").matcher(text).matches();
    }
}
