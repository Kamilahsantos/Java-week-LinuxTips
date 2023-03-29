//sublcasse herda da classe principal

// heranca x composicao: https://imasters.com.br/back-end/heranca-x-composicao
// http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/pat/herancavscomposicao.htm

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
