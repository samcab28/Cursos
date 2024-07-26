Antes de leer el ejemplo se recomienda leer: https://refactoring.guru/design-patterns/command

Primero, se define una interfaz. Esta interfaz nos sirve como estándar para los métodos que queremos que estén disponibles y se puedan ejecutar. En este caso, se ejemplifica con hacer algo y regresarlo.

Una vez hecho esto, se crean las clases receptoras. En estas clases es donde se verá reflejado el cambio, por lo que se agrega un pequeño mensaje para poder discernirlo.

Una vez creadas las clases receptoras, se deben crear las clases de acción. En estas clases es donde ocurre el cambio. Además, se debe manejar el caso de regreso. Por ejemplo, al prender la luz, no es lo mismo regresarla (apagarla) que al apagar la luz, cuyo regreso sería encenderla.

Una vez definidas estas acciones, se puede crear un archivo de control remoto que tiene disponibles las posibles acciones que se usarán dependiendo del objeto. Esto también puede verse como un filtro por parámetros, ya que al llamarlo se puede declarar una función que solo sea accedida por las clases que lo requieren, no como en este caso binario.

Una vez hecho todo lo anterior, se llama desde el main (en este caso, cliente). Se declaran los objetos a utilizar y seguidamente se declara el control remoto donde se pasan los parámetros que se requieren, y seguidamente los métodos que se quieren utilizar. Es importante el envío de parámetros, ya que el patrón establece que se deben seguir reglas para un adecuado funcionamiento y diferenciación con otras clases.