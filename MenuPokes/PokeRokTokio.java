package MenuPokes;
public class PokeRokTokio extends Poke{

    private static PokeRokTokio instance;

    public PokeRokTokio(){
    }

    @Override
    public int valor(){
        return 27000;   
    }

    public void getContenido() {
        String contenido = "arroz, " + "pepino, " + "atún picante, " + "salsa dragón, " + "plátano maduro, "+ "cebolla caramelizada ";
        System.out.print(contenido);
    }

    public static PokeRokTokio getInstance() {
        if (instance == null) {
            instance = new PokeRokTokio();
        }
        return instance;
    }
    
}
