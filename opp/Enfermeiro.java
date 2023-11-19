public class Enfermeiro {
    int horaTrabalho;
    String setor;
    String numeroCadastro;

    Enfermeiro(int horaTrabalho, String setor, String numeroCadastro, String nome, int idade, String documento){
        super(nome, idade, documento);

        public void imprimirInfo() {
            super.imprimirInfo();
            System.out.println("Hora de Trabalho: " + this.horaTrabalho);
            System.out.println("Setor: " + this.setor);
            System.out.println("Número de Cadastro: " + this.numeroCadastro);
        }
    }

}