Antes de leer el ejemplo se recomienda leer: https://refactoring.guru/design-patterns/visitor

Primeramente, se declaran las interfaces, en este caso hay dos: una de visitante y otra de ítem. Para la de visitante, se enlistan las clases que podrán ser visitadas de manera accesible, y después en la clase de ítem está el método de aceptación para poder realizar la visita a los datos.

Seguidamente, se declara la clase de carrito de compras (ShoppingCart). Acá se establecen las medidas para poder observar de manera correcta los elementos del supermercado que hemos ido comprando. Cabe aclarar que hay un método por cada clase, ya que requiere de una salida especial. No obstante, todos estos métodos están dentro de una misma clase, lo que la convierte en un punto de unión, ya que muchas clases llegan a una y desde ahí se procesan.

Una vez las clases son procesadas, se van imprimiendo con los datos de entrada que ya previamente fueron declarados.