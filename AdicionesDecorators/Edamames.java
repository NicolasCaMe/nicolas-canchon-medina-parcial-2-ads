package AdicionesDecorators;

import MenuPokes.Poke;

public class Edamames extends Adiciones {
    private Poke pedido;
    int precioAdicion = 4000;

    public Edamames(Poke pedidio) {
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
                " con un extra de edamames ($" + precioAdicion + " pesos) sería un total de: $" + valor() + " pesos.");
    }

}
