# Laboratorio I: Patrones de Diseño

***
## Pregunta 1

Usted como ingeniero de software ha sido contratado para mejorar un aplicativo de comercio electrónico de celulares. El sistema actualmente permite a los clientes realizar compras de productos, en este caso celulares, pero se ha identificado la necesidad de introducir mejoras al código. Actualmente el stock de productos lo mantiene el proveedor ACME, que ha tenido una capacidad limitada de abastecer el stock actual por causa del gran crecimiento que ha tenido la empresa en el último tiempo. Estos proveedores cuentan con sus sistemas y en particular, interfaces propias para la adquisición de productos. Por ejemplo, para adquirir celulares de PCFactory se requiere hacer una llamada de método **getPCFactoryCelularAnho(int anho)** por año y en el caso del proveedor Afel, se solicitan por el tamaño de la pantalla del celular, **getAfelCelularTamanho(int pulgadas)**. 

Por lo tanto, se le ha encomendado la tarea de mejorarlo, utilizando el **patrón Adapter**, teniendo en cuenta los siguientes requisitos:


1. Debe implementa un mecanismo que permita que todos los proveedores de productos se comuniquen de manera uniforme con el sistema de compras;
2. Debe mantener la flexibilidad para agregar nuevos proveedores en el futuro sin cambiar el código existente;
3. No se debe modificar la clase del proveedor existente.

## Pregunta 2

Continuando con el mismo sistema de comercio electrónico, a los gerentes les preocupa que el actual sistema de notificación sobre el estado de la compra es limitado. En ese sentido, se le pregunta a usted como este se podría mejorar por medio de un mecanismo que permita a los clientes recibir notificaciones en tiempo real sobre el estado de su compra. De acuerdo a los stakeholders, las historias de usuario con las siguientes:


1. Yo como cliente, me gustaría recibir notificaciones cuando el pedido haya sido confirmado, enviado o entregado.
2. Yo como cliente, me gustaría poder suscribirme o cancelar las notificaciones de estado del producto.  

***
## Diagrama de Clases


![Diagrama de Clases!](1.png "Diagrama de Clases")

