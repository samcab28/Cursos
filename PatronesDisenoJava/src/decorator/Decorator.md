Antes de leer el ejemplo se recomienda leer: https://refactoring.guru/design-patterns/decorator

Primero, se debe crear una interfaz sobre la cual trabajar. En este caso, esta interfaz (Car) servirá únicamente como un ensamblador para el carro. Seguidamente, se crea un componente básico del carro (BasicCar) que sirve como objeto de referencia o punto de partida.

Una vez definido el objeto sobre el cual vamos a añadir decoraciones, podemos empezar a decorarlo. Para esto, utilizamos el decorador del carro (CarDecorator), que implementa la interfaz previamente definida. Este decorador actúa como un molde sobre el cual se añaden decoraciones específicas.

Por último, solo falta agregar las decoraciones específicas. En este caso, tenemos las clases SportsCar y LuxuryCar, que extienden el decorador (CarDecorator) para añadir características deportivas y de lujo, respectivamente.

Al declarar el método main, se puede optar por declarar el carro básico desde el principio o, como se muestra en el ejemplo, comenzar decorando el objeto desde su instancia para una mayor practicidad.
