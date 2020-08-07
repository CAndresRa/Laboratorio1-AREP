# Implementación Linked List, cálculo de media y desviación estandar 

### Autor: Carlos Andrés Ramírez Torres
### Fecha: Viernes, 7 de Agosto del 2020
##### LOC/h: 1559/12 = 129.91 LOC/h

## Uso 

Para el desarrollo del proyecto se utilizo **Maven** como una herramienta para la construccion y gestion del mismo, el codigo fue desarrollado con el lenguaje de programación **Java**.

Utilizar `mvn package` para la generacion del fichero .jar con los .class compilados.

![Texto alternativo](https://github.com/CAndresRa/Laboratorio1-AREP/blob/master/ImgReadme/MVN%20package.png)

Una vez realizado el `mvn package` el codigo estara listo para ser utilizado bajo la siguiente estructura.

Existe un caso de uso para la ejecución del proyecto, el cual es:
 * A partir de un archivo que contenga datos que permitan el calculo de la media y de la desviación estandar, se procedera a leer linea por linea y guardar en una estructura de datos que permita la iteración correspondiente para obtener los resultados adecuados.
 
 **Con el fin de mejorar la lectura de los resultados se muestran redondeados a dos cifras decimales**
 
Para ejecutar el programa sobre un unico archivo se utilizara desde la terminal el siguiente comando en terminal:

`java -cp target/Laboratorio1-AREP-1.0-SNAPSHOT.jar edu.escuelaing.arep.App <File Path>`
 
por ejemplo:

`java -cp target/Laboratorio1-AREP-1.0-SNAPSHOT.jar edu.escuelaing.arep.App src/main/resources/prueba1.txt`

![Texto alternativo](https://github.com/CAndresRa/Laboratorio1-AREP/blob/master/ImgReadme/Simple.png)

Adicionalmente es permitido pasar un directorio que contiene archivos de codigo para obtener la media y desviación estandar de cada uno de ellos utilizando el siguiente comando en terminal:

`java -cp target/Laboratorio1-AREP-1.0-SNAPSHOT.jar edu.escuelaing.arep.App <Directory Path>`

por ejemplo:

`java -cp target/Laboratorio1-AREP-1.0-SNAPSHOT.jar edu.escuelaing.arep.App src/main/resources`

![](https://github.com/CAndresRa/Laboratorio1-AREP/blob/master/ImgReadme/Directory.png)

## Documento PDF realizado en LATEX 

[Introduction To Complex Systems Java MVN And Git](https://github.com/CAndresRa/Laboratorio1-AREP/blob/master/Introduction%20To%20Complex%20Systems%2C%20Java%2C%20MVN%2CAnd%20Git.pdf)

## Diagrama

* Aplicación 

![Texto alternativo](https://github.com/CAndresRa/Laboratorio1-AREP/blob/master/ImgReadme/Diagrama%20Aplicacion.png)

El diagrama muestra que la clase **App** recibe el argumento, en este caso se trata de la ruta del archivo al cual se le realizara el calculo correspondiente a la **media** y **desviación estandar**, la clase **App** crea una instancia de la clase **CalculateMeanAndDeviationService** cuya finalidad es la lectura del archivo encontrado y mediante los metodos **calculateMean** y **calculateStandardDeviation** envia una **MyLinkedList** que contiene los datos del archivo leido anteriormente, para ser utilizada por la interfaz ***Calculate*** que con el uso de polimorfismo obtendra el calculo correspondiente a la media o desviación estandar, esta estructura permitira posibles cambios que se deseen implementar como en el caso de que el usuario quiera obtener unicamente un valor y a su vez la extension del software para otros calculos.

* Linked List 

![Texto alternativo](https://github.com/CAndresRa/Laboratorio1-AREP/blob/master/ImgReadme/Diagrama%20coleccion.png)

Para la implementación de la estructura de datos **Linked List** y dado el requerimiento de corresponder con el api de java, se procede a utilizar dos clases **MyLinkedList** la cual implementa **List** y la clase llamada **Node** la cual permitira guardar el dato correspondiente que se desee, esto se logra mediante **Tipos Genericos**, algunos metodos implementados para la utilización de la estructura son:

* **add**: Permite agregar objetos a la estructura.
* **size**: Permite obtener la cantidad de objetos de la estructura.
* **iterator**: Permite utilizar for each facilitando la iteración por la estructura.
* **Remove**: Permite remover un nodo dependiendo de una posición indicada.


## Pruebas 


Se han realizado un **total de 16** pruebas en donde se contemplan distintos escenarios que muestran que el codigo es correcto, entre las pruebas se probaron los siguientes eventos:

* Lectura de archivos existentes.
* Lectura de archivos no encontrados.
* Lectura de archivos contenidos en un directorio.
* Calculo de la **Media** de una muestra de datos.
* Calculo de la **Desviación estandar** de una muestra de datos.
* Prueba de metodos de la **linked list** implementada.

**Para el desarrollo de las pruebas debido al redondeo de los resultados se opto por usar un delta de error del 1% en algunos casos**

* Pruebas implementadas

![Texto alternativo](https://github.com/CAndresRa/Laboratorio1-AREP/blob/master/ImgReadme/Implement%20test.png)

* Utilizando el comando de `mvn test`

![](https://github.com/CAndresRa/Laboratorio1-AREP/blob/master/ImgReadme/mvn%20Test.png)

