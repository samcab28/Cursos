Antes de ver el ejemplo se recomienda leer: https://refactoring.guru/design-patterns/factory-method

Se recuerda que para hacer la correcta implementacion de este metodo se requiere de una interfaz (conjunto de reglas que una clase debe de seguir), 
tambien debe de tener clases que implementen la interfaz. Una fabrica principal que sea capaz de llamar a las subFabricas que crearan los nuevos objetos predefinidos.

Al declarar la interfaz donde se tiene el metodo mover, se obliga a que cualquier 
clase que la implemente lo obtenga. En este caso: Avion, Carro y Bicicleta.

FabricaTransporte es una clase abstracta que declara un método abstracto crearTransporte. Esta clase actúa como la fábrica base que define el método que todas las fábricas concretas deben implementar.

FabricaCarro, FabricaBicicleta y FabricaAvion son clases concretas que extienden FabricaTransporte. Cada una implementa el método crearTransporte para devolver una instancia del tipo de transporte correspondiente (Carro, Bicicleta, Avion).

En la clase Main, se crean instancias de las fábricas concretas (FabricaCarro, FabricaBicicleta, FabricaAvion).
Para cada fábrica, se llama al método crearTransporte para obtener una instancia del tipo de transporte correspondiente.
Luego, se llama al método mover en cada instancia de Transporte para demostrar su funcionalidad.

