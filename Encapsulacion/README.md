# ENCAPSULACIÓN

- Cuando un objeto se encuentra encpasulado, sólo sus métodos tienen acceso a sus atributos, evitando así la manipulación de los atributos mediante la presencia de fuentes externas, es decir, quién programa un objeto controla los métodos de acceso, su estado y su comportamiento.

- Es una de las propiedades más importantes de la POO.

- Consiste en la separación de las propiedades externas de un objeto, correspondiente a la interfaz de sus funciones de los detalles de implementación interna del objeto.

- Se reduce la complejidad del sistema, portegiendo los objetos ontra posibles errores, permitiendo lograr de mejor manera extensiones futuras en la implementación de los objetos.

- Consiste básicamente en proteger los atributos del acceso directo de los objetos colocándolos en una zona privada, y la única forma de acceder a ellos es por medio de los métodos que están en una zona pública.

## MENSAJES

- Una aplicación orientada a objetos está compuesta por varios objetos creados desde sus respectivas clases.

- Estos objetos necesitan una forma de comunicarse, para intercambiar datos entre sí, y lo hacen por medio de mensajes.

- Los mensajes pueden contener parámetros, en los cuales se indican las características específicas de la acción a realizar.

- Estructuralmente está compuesto por los siguientes elementos:

    1. Objeto destino, hacia el cual el mensjae es enviado.
    2. El nombre del método a llamar.
    3. Parámetros solicitados por el método, a través del cual suele darse la información.

- El envío y recepción de mensajes es simplemente una petición de un objeto a otro objeto para que éste se comporte de una manera determinada, ejecutando uno de sus métodos.

- Ejemplo:
    Si existe un objeto A de la clase Carro y un objeto B de la clase Impuesto, para calcular el 10% del impuestos sobre el precio del carro, la comunicación podría ser:
    
    `float costo = A.getPrecio();`
    `B.calcularImpuesto(costo*0.10);`

## Ciclo de vida de los objetos

- El objeto nace cuando se crea, vive cuando se utiliza en un programa en un programa y muere cuando deja de usarse.

## Constructores

- Son métodos especiales que tienen las siguientes características:
    1. Se llaman sólo una vez al crear el objeto.
    2. Tienen le mismo nombre de la clase.
    3. Puede haber varios (sobrecarga de métodos).
    4. Al crear un objeto sólo se utiliza uno.
    5. No devuelve nada, ni void (realmente devuelve el objeto creado).

- Inicializa los atributos de objeto al momento de crearse sin hacer otra instrucción adicional.

- Java provee un constructor por defecto.

- Tipos:
    1. Por defecto, no recibe parámetros.
    2. Común u ordinario, puede recibir toda clase de parámetros.
    3. De copia, permite la construcción de una copia del objeto.

## Crecimiento y vida del objeto

- Una vez creado el objeto
    1. Se puede trabajar con él.
    2. Llamar a los métodos de su clase.
    3. Guardar datos para almacenarlos temporalmente antes de registrarlos en una BD.
    4. Compartir datos con los demás objetos, pasándoles mensajes.

- Cada objeto consume memoria, y depende de los atributos que tenga.

## Muerte del objeto

- Java utiliza el Garbage Collector para liberar los objetos no referenciados.

- Java cuenta las referencias que hay sobre cada objeto. El objeto se borra cuando no tenga referencia.

- Antes de borrarlo, Java de la oportunidad de limpiarse así mismo (finalización).

- Se puede hhacer un llamado explícito al gc System.gc(); 

## Ejercicio

- Crear un programa para gestionar un plan de telefonía móvil. El plan tiene un número de celular, un operador, una cantidad de minutos y un costo por minuto.

- Calcular el total a pagar teniendo en cuenta que si el operador el Movilujo tiene un 50% de descuento. Usar mínimo 3 constructores.

## Análisis

- Plan
- Numero celular

- Operador
- Cantidad minutos
- Costo por minuto
- Costo del plan

- Descuento