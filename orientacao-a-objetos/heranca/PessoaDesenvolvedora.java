

//subclasse herda metodos e comportamentos de uma superclasse
//semelhante a heranca da vida real
//classe base possui serie de metodos
//quem herda é obrigado a usar
public class PessoaDesenvolvedora {

    private String nome;
    private String stack;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public PessoaDesenvolvedora(String nome, String stack, Double salario) {
    }

    public void codar() {
        System.out.println("bora codar" );
    }

}
