Antes de leer el ejemplo se recomienda leer: https://refactoring.guru/design-patterns/mediator

Para este ejemplo, se utilizará una aplicación de mensajería donde el mediador es el sistema encargado de enviar y recibir mensajes. Todos los usuarios intentan acceder al chat constantemente y enviar sus mensajes, pero el sistema debe ser capaz de reconocer quién es la persona que envía cada mensaje para determinar su cuerpo de mensaje, ya sea como "Enviado" o "Recibido".

En primer lugar, se crea una interfaz que define los métodos que el mediador debe implementar. En este caso, solo se incluyen los métodos para enviar mensajes y agregar usuarios al chat.

Luego, se implementa una clase ChatRoom que concreta la interfaz previamente creada con las funciones necesarias para este caso. Aquí se muestra una de las posibilidades del patrón Mediator: el ChatRoom actúa como el mediador que maneja la comunicación entre los usuarios en un chat grupal. Sin embargo, este sistema es flexible y se puede adaptar a diferentes escenarios, como chats privados o foros.

Una vez creado el ChatRoom, se definen los usuarios. Es importante recordar que la clase User es una plantilla abstracta
La clase User es abstracta en el patrón Mediator para proporcionar una estructura básica que define los métodos que los objetos concretos (en este caso, los usuarios) deben implementar. Aquí hay algunas razones clave por las que se utiliza una clase abstracta:
1. Definición de Contrato: La clase abstracta User define un contrato mediante los métodos abstractos send y receive. Esto garantiza que todas las clases concretas que hereden de User implementen estos métodos, estableciendo una interfaz común para los usuarios.
2. Encapsulamiento de Comportamiento Común: La clase abstracta puede contener campos y métodos comunes a todos los usuarios, como el mediador y el nombre. Esto permite reutilizar código y evita la duplicación en las clases concretas.
3. Flexibilidad para Extensión: Al usar una clase abstracta, puedes crear diversas implementaciones concretas de User sin modificar la clase base. Por ejemplo, podrías tener diferentes tipos de usuarios con comportamientos específicos, pero todos seguirán el contrato definido por la clase abstracta.

Retomando la interacción real se realiza a través de la clase ConcreteUser. La clase ConcreteUser implementa los métodos de comunicación definidos en la interfaz del mediador, permitiendo que el usuario envíe y reciba mensajes.

Finalmente, en el archivo principal se crean instancias de usuarios, se agregan al chat y se inician los envíos de mensajes. Cada mensaje enviado llama al método del mediador, que decide si se trata de un envío o una recepción, y luego pasa la acción a la instancia concreta del usuario para procesar el mensaje de manera adecuada y generar el orden deseado en el chat.