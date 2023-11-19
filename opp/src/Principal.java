public class Principal {
    public static void main(String[] args) {
        /**
         * Quando passamos Pessoa paciente, Pessoa enfermeiro, estamos usando o polimorfismo, pois
         * estamos criando "Tranformando", pessoa em uma pessoa enfermeiro ou uma pessoa paciente;
         * Ou seja, dando multiplas formas para uma mesma entidade ou melhor "Polimorfismo". 
         * 
         * 
         */

        Pessoa paciente = new Paciente("1234", "EmpresaPlanoSaude", "Jose", 35, "1234567");
        paciente.imprimirInfo();

        Pessoa enfermeiro = new Enfermeiro(12, "UTI", "122344", "José", 24, "12354789");
        enfermeiro.imprimirInfo();
    }
}