/*
    Casting é a gente transformar um valor de um tipo para outro tipo
 */

public class Condicionais {
    public static void main(String[] args) {
       // casting implícito, sem declarar que estamos fazendo o casting
       int idade1 = 22;
       double idade2 = idade1;


       // explícito, vamos dizer pra linguagem que estamos ciente do casting
       char letra = 'a';
       String nome = String.valueOf(letra); 

    }
}