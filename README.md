SortingAlgorithms
=================

Desarrollo en Java y prueba de los siguientes algoritmos de ordenación.

* Ordenación por burbuja
* Ordenación Shell
* Ordenación por inserción
* Ordenación por mezcla
* Ordenación por montículo
* Ordenación rápida

Cada commit está asociado a una entrada del blog [exacs.tumblr.com](http://exacs.tumblr.com) marcada con la etiqueta [#SortingAlgorithms](http://exacs.tumblr.com/tagged/SortingAlgorithms). En cada post se explica un algoritmo de ordenación.

Se ha empezado creando una clase abstracta **Algorithm** que incluye un método abstracto **sort**. Esta clase sirve de base para tener homogéneas todas las clases de los diferentes algoritmos que se van a implementar. Se puede ver dicha clase base [aquí](https://github.com/exacs/SortingAlgorithms/blob/master/src/algorithms/Algorithm.java).

El código en Java hace hincapié en estas convenciones

* Verbos para los métodos.
* Métodos que retornan valores no booleanos: prefijo *get*.
* Métodos que retornan valores booleanos: prefijo *is*.
* **Pendiente de realizar**. Comentarios *javadoc* para los métodos.
* Comentarios en línea `//` para explicaciones internas

## Futuras características

1. Realización de pruebas objetivas con los siguientes arrays

* Array casi ordenado
* Array invertido
* Array con pocos elementos muy repetidos

2. Creación de una interfaz gráfica y animaciones
