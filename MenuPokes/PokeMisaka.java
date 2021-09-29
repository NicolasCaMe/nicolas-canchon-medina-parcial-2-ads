package MenuPokes;

public class PokeMisaka extends Poke {

    private static PokeMisaka instance;

    private PokeMisaka() {
    }

    @Override
    public int valor() {
        return 22000;
    }

    public void getContenido() {
        String contenido = "arroz, " + "aguacate, " + "salmón, " + "salsa teriyaki";
        System.out.print(contenido);
    }

    public static PokeMisaka getInstance() {
        if (instance == null) {
            instance = new PokeMisaka();
        }
        return instance;
    }

}
