# swing-escuela

En el siguiente documento que funciones se tienen en cada una de las carpetas que estan dentro de la carpeta
src que es donde se encuentra todos el codigo.

## Frames y school

Entrando de primera instancia a src, se encuentran los frames que son jinternalframes
Que son ventanas que estan dentro de otra ventana. Esto, se podra notar ya que las ventanas
que aparecen despues de elegir una en los menus en las barras de opciones, no pueden salir 
del panel que esta debajo de la barra de opciones.

* School: es el programa principal, que es la clase que integra las demas ventanas.
* Frame: todos los archivos que empiezan con frame. Son las ventanas de cada uno de los crud(Create, Read, Update and Delete)

## Models
<div class=text-justify> Dentro de models se encuentran los pojo(Plain old Java object) que son las clases simples de lo que se muestra en el diagrama Uml.
Estas se integran de sus atributos,los setters y getters de cada uno de los atributos. Y finalmente, un metodo toString que se 
utiliza para poder guardar los datos de los archivos de texto. Y se tienen las siguientes clases: </div>


* Admin
* Course
* CourseTeacher(la union entre curso y maestro)
* Director
* Student
* Teacher

Nota: los metodos toString dan el texto en el siguiente formato dato,dato,dato,dato.

## Adapters

En adapter todos inician con CRUD. Y lo que se encuentra aqui son clases que heredan de abstractTables. Practicamente son las tablas que se van
a mostrar dentro de cada una de las ventanas.Además los datos que muestran se cargan a traves de una lista de objetos. 

Lo que ofrecen estas tablas es que se pueden manipular cada aspecto de ellas, estos metodos que se encargan de esto son los que tienen overrride.y los metodos
add y remove. En cuento a los demas metodos estos son: 

* getRowCount: Que te devuelve el numero de filas
* getColumnName: Te devuelve el nombre de la columna
* getColumnCount: Te regresa el numero de columnas
* getvalueAt: te devuelve el valor de una celda, para ello te pide el numero de fila y el de columna 
* setValueAt: te configura el valor de una celda, para ello te pide el numero de fila y el de columna 
* remove: es para eliminar una celda (estos son para simular el cambio que se realiza en los archivos de texto)
* add: es para arregar una celda (estos son para simular el cambio que se realiza en los archivos de texto)

Despues de estos metodos se encuentran los metodos que se encargan de enviar un string ya armado para guardarlos en un arhivos de texto.
Y empiezan de la siguiente forma:

* agregar
* eliminar
* actualizar
* obtener: El de obter es especial ya que es el que arma la lista de objetos que se mostrara dentro de la tabla

Para esto lo que se hace es obtiene el siguiente String:

	 ```
		1, Roberto, director ;3, Astolfo, director ;4, Fernando, director

	```

Se le hace un split utilizando como delimitador el ; y se obtiene la siguiente lista:

	 ```
		["1, Roberto, director","3, Astolfo, director","4, Fernando, director"]
	```

Despues dentro de un ciclo, utilizando como delimitador la , se hace un split y cada campo se asignar a sus correspondiente campo

* setId([0]) --> este seria el id 1
* setName([1]) --> este seria el nombre Roberto
* setJob([1]) --> este seria el puesto director

Y de esta manera ya se formaria, en el caso de este ejemplo nuestra lista de directores que se mostrara dentro de la tabla

## Connects

En esta carpeta se encuentra el archivo TextFile que se encarga de:

* guardar datos en archivos de texto, a este se le pasa de parametro el texto a guardar
* actualizar datos en archivos de texto, a este se le pasa de parametro el texto a actualizar
* eliminar datos en archivos de texto, a este se le pasa de parametro el texto a eliminar
* leer archivo de texto, te trae todos los datos del archivo de texto en el formato dato;dato;dato;

Y para usar esta clase solo se tiene que pasar el nombre del archivo, y la clase se encargara de crearlo dentro de **connects**.

## Datas

Eran datos que se usaron de prueba. Digamos que su proposito era cargar listas para mostrarlas en las tablas.
Pero, ya no se usan ya que los datos ya los obtiene de los archivos de texto.

## Renders

Dentro de esta carpeta, no se usa nada. Ignorala por completo


