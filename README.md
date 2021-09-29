
## Contexto
Comencemos por contextualizando el concepto de poke: bowls de comida. El programa representa una poke-ton, donde los clientes pueden escoger entre dos tipos de pokes y agregar adiciones. Se busca que por usuario se cree un único pedido.
El programa está desarrollado en Java en el IDE Visual Studio Code.
Para poderlo ejecutar es necesario tener descargado el jdk junto con la extención de java para visual studio agregándola directamente desde Visual Studio buscando e instalando 'Extension Pack for Java'.

## Patrón de diseños usados
### Singleton 
#### a)
El patrón de diseño Singleton fue necesario debido a que, la poke-ton crea demasiados pedidos que pueden llenar la memoria ram de nuevas intancias. El patrón ayuda a que, por cliente se cree una sola instancia de poke.
#### b)
El patrón fue usado por las clases que extienden de 'Poke', tales como 'PokeMisaka' y 'PokeRokTokio', que eran los lugares donde se crean los objetos. Las dos clases poseen una estructura muy similar representada por:
```java
    //Esta es lo primero que llama el main cuando se busque crear un nuevo poke. Acá se evalúa di ya existe una instancia creada
    private PokeMisaka() {
    }
    public static PokeMisaka getInstance() {
        if (instance == null) {
            instance = new PokeMisaka();
        }
        return instance;
    }
```

### Decorator
#### a)
El patrón de diseño Decorator fue necesario pues en la Poke-ton el valor agregado es la opción de agregar adiciones a cada poke, de forma surgía la necesida que a un mismo objeto base poke se le le puedan añadir más atributos según lo necesite el cliente.

#### b)
El patrón fue usado en las clases que están dentro de la carpeta 'AdicionesDecorators', más puntualmente las clases 'Edamames', 'Kanikama', 'Masago'. Y tambien en la clase principal donde se crean estos objetos con sus adiciones, viendose representado en:
```java
    //CLASE Main
    //Creo un objeto base poke por medio del patrón singleton 
    Poke poke = PokeMisaka.getInstance();

    //CLASE Main
    //A ese objeto creado, según las adiciones que quiere el cliente, le agrego el decorator. Si el usuario desea agregarle más decorators, se hará de esta misma forma añadiéndole al objeto poke lo adicional
    poke = new Edamames(poke);

    //CLASE Main
    //Muestro finalmente la facutra por consola el resultado de las adiciones, 
    poke.getContenido();

    //CLASE AdicionesDecorators.Edamames;
    //Creamos un objeto poke llamado 'pedido'
   public Edamames(Poke pedidio) {
        this.pedido = pedidio;
    }

    //CLASE AdicionesDecorators.Edamames;
    //A este le agregamos los atributos deseados al objeto base poke, como en estos casos el valor y el contenido
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

 

```
