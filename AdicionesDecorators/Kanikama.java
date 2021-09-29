package AdicionesDecorators;

import MenuPokes.Poke;

public  class Kanikama extends Adiciones{
    private Poke pedido;
    int precioAdicion = 7000;

    public  Kanikama  (Poke pedidio){
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
                " con un extra de kanikama ($" + precioAdicion + " pesos) sería un total de: $" + valor() + " pesos.");
    }


}
