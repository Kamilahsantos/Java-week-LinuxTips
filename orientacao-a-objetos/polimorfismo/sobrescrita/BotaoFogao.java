package sobrescrita;

public class BotaoFogao extends Botao {

   @Override
   public void ligar() {
//      super.ligar();
    System.out.println("bora esquentar a comida");
   }

   @Override
   public void desligar() {
      super.desligar();
   }
}
