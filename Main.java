import javax.swing.JOptionPane;

import AdicionesDecorators.Edamames;
import AdicionesDecorators.Kanikama;
import AdicionesDecorators.Masago;
import MenuPokes.Poke;
import MenuPokes.PokeMisaka;
import MenuPokes.PokeRokTokio;

public class Main {

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane
                    .showInputDialog("¡Bienvenido a la POKE-TON! ¿Qué quieres pedir? \n ======== Opciones ========\n"
                            + "1. Poke Misaka\n" + "2. Poke RokTokio\n" + "0. Salir"));
            switch (opcion) {
                case 1:
                    Poke poke = PokeMisaka.getInstance();
                    menu2(poke);
                    break;
                case 2:
                    poke = PokeRokTokio.getInstance();
                    menu2(poke);
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esa opción no existe...");
            }

        } while (opcion != 0);
    }

    public static void menu2(Poke poke) {
        int opcion2;
        do {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog("¿Le quieres añadir algo más?\n " + "TOTAL $"
                    + poke.valor() + " pesos \n ======== Opciones ========\n" + "1. Edamames\n" + "2. Kanikama\n"
                    + "3. Masago\n" + "4. Terminar compra\n" + "0. Salir"));
            switch (opcion2) {
                case 1:
                    poke = new Edamames(poke);
                    JOptionPane.showMessageDialog(null, "Edamames añadidos");
                    break;
                case 2:
                    poke = new Kanikama(poke);
                    JOptionPane.showMessageDialog(null, "Kanikama añadido");
                    break;
                case 3:
                    poke = new Masago(poke);
                    JOptionPane.showMessageDialog(null, "Masago añadidos");
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esa opción no existe...");
            }
        } while (opcion2 != 0 && opcion2 != 4);
        if (opcion2 != 0) {
            JOptionPane.showMessageDialog(null, "======Venta realizada====== \n=Imprimiendo factura en la consola=");
            System.out.print("-----FACTURA-----\nPoke Misaka ");
            poke.getContenido();
            
        }

    }
}