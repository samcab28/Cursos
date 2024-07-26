Antes de leer el ejemplo se recomienda leer: https://refactoring.guru/design-patterns/chain-of-responsibility

Primero, se crea una interfaz que determina qué debe tener cada Handler. En este caso, únicamente se requiere la capacidad de enviar el error al siguiente handler o solucionarlo.

Cuando un handler llega a su manejo de error respectivo, vemos que tiene la funcionalidad de enviarlo al siguiente en caso de que no pueda solucionarlo. Además, existe una función encargada de manejar el error en caso de que sea necesario.

Cada handler recibe una solicitud, que en este ejemplo maneja un mensaje y un número de gravedad. Según el número de gravedad, aumentará la dificultad del error y también la capacidad de solucionarlo. Basado en estos valores, se debe crear previamente el árbol de decisión para intentar solucionar todas las solicitudes. En este caso, si no se puede solucionar una solicitud, simplemente indica que no fue posible.

Al ejecutar el método main, siempre se llama primero al Front Desk. Esto es porque los handlers siguen un orden jerárquico establecido para un manejo adecuado de las solicitudes. El orden es:

1. Front Desk
2. Supervisor 
3. Manager

También es importante mencionar que se puede ajustar el árbol de decisión para que, dependiendo de la solicitud, no siempre se empiece por el Front Desk. Cabe aclarar que esto será un problema de diseño de software y de las necesidades del cliente.
