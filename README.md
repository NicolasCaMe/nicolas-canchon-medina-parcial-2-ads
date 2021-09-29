
## Contexto
Comencemos por contextualizando el concepto de poke: bowls de comida. El programa representa una poke-ton, donde los clientes pueden escoger entre dos tipos de pokes y agregar adiciones. Se busca que por usuario se cree un único pedido.
El programa está desarrollado en Java en el IDE Visual Studio Code.
Para poderlo ejecutar es necesario tener descargado el jdk junto con la extención de java para visual studio agregándola directamente desde Visual Studio buscando e instalando 'Extension Pack for Java'.

## Patrón de diseños usados
## Singleton 
a)
La clase Singleton fue necesaria debido a que, la poke-ton crea demasiados pedidos que pueden llenar la memoria ram de nuevas intancias. El patrón ayuda a que, por cliente se cree una sola instancia de poke.
b)
El patrón fue usado por las clases que extienden de 'Poke', tales como 'PokeMisaka' y 'PokeRokTokio', que eran los lugares donde se crean los objetos. Las dos clases poseen una estructura muy similar representada por:
```java
    //Esta es lo primero que llama el main cuando se busque crear un nuevo poke. Acá se evalúa di ya existe una instancia creada
    public static PokeMisaka getInstance() {
        if (instance == null) {
            instance = new PokeMisaka();
        }
        return instance;
    }
```


A pezar de ser llamada tantas veces, el uso de singleton ayuda a que 

## Detalles técnicos

