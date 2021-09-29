package AdicionesDecorators;

import MenuPokes.Poke;

public class Masago extends Adiciones {
    private Poke pedido;
    int precioAdicion = 10000;

    public  Masago  (Poke pedidio){
        this.pedido = pedidio;
    }
    
    @Override
    public int valor() {
        return pedido.valor() + precioAdicion;
    }

    @Override
    public void getContenido() {
        pedido.getContenido();
        System.out.print(
                " con un extra de masago ($" + precioAdicion + " pesos) sería un total de: $" + valor() + " pesos.");
    }
}
