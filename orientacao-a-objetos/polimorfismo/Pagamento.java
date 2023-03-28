//polimorfismo -> mesma parte do programa de várias formas diferentes para necessidades diferentes


//sobrecarga : variacoes de um mesmo metodo com a lista de argumentos e retorno diferentes (assinatura)
//

//exemplo de sobrecarga
public class Pagamento {


    //pagamento a vista
    public Double pagamento(Double valor){
        return valor;
    }


    //calcula o valor das parcelas
    public Integer pagamento(Integer valorInteger, Integer parcelas ){
        return valorInteger/parcelas;
    }

    //juros
    public Long pagamento(Integer valorInteger, Integer parcelas, Long juros){
        return (valorInteger/parcelas) + juros;
    }


}
