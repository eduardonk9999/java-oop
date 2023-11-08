import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
       int[] idades = {2,3,4};
       String[] nomes = new String[10];


       // Declaracao de arrays dinamicos
       // <Integer> é o tipo que vamos usar, esse Integer é nativo do java
       ArrayList<Integer> idadesDois = new ArrayList<Integer>(); 
       idadesDois.add(22);
       idadesDois.add(50);
       idadesDois.remove(0); // removendo 22
       idadesDois.get(1); // Pega o valor da posicao 1 do array


       

    }
}