//sublcasse herda da classe principal
public class Pessoa {

    public static void main(String[] args) {

        PessoaDesenvolvedoraBackend pessoaDesenvolderaBackend =
                new PessoaDesenvolvedoraBackend("kamilabackend", "java e spring", 10000.0);
        pessoaDesenvolderaBackend.codar();



        PessoaDesenvolvedoraFrontEnd pessoaDesenvolvedoraFrontEnd =
                new PessoaDesenvolvedoraFrontEnd("kamilafrontend", "javaescripto", 10000.0);
        pessoaDesenvolvedoraFrontEnd.codar();


    }
}
