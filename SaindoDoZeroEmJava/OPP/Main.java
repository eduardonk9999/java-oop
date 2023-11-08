// Classes, são feitos para modelar nossos objetos, e nossos objetos vai ter atributos e comportamentos
// Construtor, são metodos da nossa classe que vão ser chamados para inicializar uma estancia dessa classe
// Modificadores de acesso, determina o nível de visibilidade das nossas classes
// Herança, herdar algo, ou seja vamos herdar de uma classe pra outra, ela vai ter todos atributos e metodos publicos da classe que ela herdou,  a famosa super classe.
// Polimorfismo, são quando objetos de diferentes classes responderem a mesma mensagem de maneira diferente
// Ele vai ter uma transformação...
// Ex: Anima, anima faz barulho, Animal Cachorro Late, Animal Gato Mia.


public class Main {
    String nome;

    public static void main(String[] args) {

        
    }

    
    // Construtor => É um método com o mesmo nome da classe
    // quando a gente chamar new Main(), estamos chamando o construtor da classe
    public Main(String nome) {
        this.nome = nome;
    }

}

// Chmando o construtor =>
class Pessoa {
    void criaMain() {
        Main meuMain = new Main("Eduardo")
    }
}


// Modificadores
public class Main {
    public String name;

    private int salary;
    
    public static void main(String[] args) {

    }

    void atualizaSalario() {
        this.salary = 1000; // Aqui eu consigo modificar pois está dentro do acesso da visibilidade, FAMOSO ESCOPO
    }
}

class Pessoa {
    void criaMain() {
        Main meuMain = new Main();
        System.out.println(meuMain.name);
        System.out.println(meuMain.salary); // Salary has private access in 'Main'

    }
}


// Herança e Polimorfismo
// Herança

class Ser{
    String nome;
    int idade;

    public Ser(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    public String saudacao(){
        return null;
    }
}



public class Pessoa extends Ser {
    // chmando o construtor da classe na minha subclasse
    public Pessoa(String nome, int idade) {
        super(nome, idade);
    }


    // Herdando de Ser
    this.idade = 22;


    // Polimorfismo aqui a pessoa fala

    @Override
    public String saudacao() {
        return "Ola, meu nome é" + this.nome;
    }
}


// Polimorfismo
public class Cachorro extends Ser {
    String nomeDono;

    public Cachorro(String nome, int idade, String nomeDono) {
        super(nome, idade);
        this.nomeDono = nomeDone;
    }


     // Polimorfismo aqui o cao late
    @Override
    public String saudacao() {
        return "au au";
    }
}