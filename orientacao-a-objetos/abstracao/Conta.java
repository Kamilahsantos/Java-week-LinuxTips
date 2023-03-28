
interface  Conta {


    //abstracao consiste em ocultar detalhes e exibir somente as informacoes necessárias
    //na abstração expomos certos métodos que desejamos que as outras classes acessem
    //e obrigamos que elas sigam aquele comportamento em específico
    //em resumo oculta o que nao precisa ser exposto e cria  comportamentos padrões
    
    public void consultarSaldo();
    public  void fazerPix();
}
