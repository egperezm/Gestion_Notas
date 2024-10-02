# Gestion_Notas
Se agrega el proyecto
# Pasos iniciales para el desarrollo
- 1)	Como primer paso es ir a la página de https://start.spring.io
- 1.1)	Establecer en Projet: Maven
- 1.2)	En lenguaje: Java
- 1.3)	En spring boot: 3.3.4
- 1.4)	En Project Metadata: notasapp (en mi caso, ustedes coloquen el nombre que quieran)
- 1.5)	En Packagin seleccionan: Jar
- 1.6)	En Java: seleccionan: 17
  
- 2)	Luego seleccionar GENERATE, el archivo se generará en su carpeta de descargas (o la que tenga seleccionada por default.).
- 3)	Extraer el archivo con 7-zip 24.08 o Winrar7.0. 
- 4)	Luego abrir Visual Studio Code 1.93.
- 5)	Luego abrir la carpeta que ha descomprimido desde Visual studio code 1.93.
- 6)	Al abrir la carpeta debe crear cuatro carpetas desde la raiz main , controller, model, repository y service.
- 7)	Dentro de la carpeta controller debe crear un archivo .java con el nombre NotaController.java
- 8)	Dentro de la capeta model debe crear un archivo .java con el nombre Nota.java
- 9)	Dentro de la carpeta repository, debe crear un archivo .java con el nombre NotaRepository.java
- 10)	Dentro de la carpeta service, debe crear un archivo NotaService.java

# Descripción del controller, model, repository, service
## Controller/NotaController.java
- Implementé un controlador API RESTful para manejar las operaciones solicidadas CRUD.
## repository/Notarepository.java
- Persistencia de los datos, define un repositorio para la entidad nota.
## Service/NotaService.java
- Implementa la lógica en el servicio para calcular el puntaje total, validar que los puntajes ingresados no excedan los máximos permitidos.
## Model/Nota.java
- Esta es la entidad principal que sería Nota, toma las anotaciones de validación como @max(35) y @Max (15), para los puntajes correspondientes, o validar manualmente en la capa de servicio.
## Pasos para ejecutar el backend 
- presionando las teclas CMD+J, En el caso de MacOS o Control+J en el caso de un ambiente windows.
## En el terminal escribir mvn spring-boot:run
-Deberá visualizar la ejecución del Backend siguiendo este comando mvn spring-boot:run
## Apertura del local host
Abrirlo de forma manual http://localhost:3000 o puede utilizar Postman para enviar la solicitud, auque a decir verdad no es necesario abrir el navegador para que el backed tenga comunicación con el Frontend lo importante es que los comandos para ejecutar el backend estén bien escritos para que se habilite el puerto. Apertura del local host.
# Desarrollo del frontend
- 1) Para el desarrollo del Frontend es necesario tener instalado node.js y npm debe asegurarse de tenerlo instalado para poder seguir
- 2) Debe crear una carpeta junto o al Backend para tener todo ordenado y colocarle el nombre que prefiera en mi caso frontend-notas.
- 3)	Abrir la carpeta desde el Visual Studio Code
- 4)	Abrir el terminal como lo indicamos anteriormente
## Creacion del frontend
- 1)	Debe ejecutar el siguiente comando npx create-react (“el nombre que le colocaron”) en mi caso es npx create-react frontend-notas
- 2)	Seguido deben ingresar a la carpeta con el siguiente comando cd frontend-notas, luego npm start para iniciar y debe mostrar la ejecución.
- 3)	Recuerde tener instalado axios para manejar las solicitudes HTTP:/
- 4)  Para instalar axios debe ingresar el siguiente comando Npm install axios
## Creación de los archivos .js
- Esto es para agregar los archivos necesarios para el frontend
- 1)	NotaForm.js
- Formulario para agregar o editar notas
- 2)	NotaList.js
- Mostrará los resultados de las operaciones y las entradas del usuario, en resumen, mostrará todas las notas.
- 3)	App.js
-Este es el componente principal que se encarga de la lógica para obtener, crear, editar y eliminar las notas.
- 4)	Aplication.properties
- En el archivo src/main/resourses/aplication.properties, se configura la conexión a MySQL
# Ejecución del Frontend
- 1)	Debe abrir el terminal con control+j
- 2)	Escribir los siguientes comando para que el frontend se ejecute y se abra de forma automática. 
- 3)	Comando (1) cd frontend-notas, este comando es necesario si y solo si la carpeta está dentro de otra carpeta. Sino solo se usa el siguiente comando.
- 4)	Comando (2) npm start
## Despliegue del Proyecto localmente
- 1)	Mediante el navegador de forma manual http://localhost:3000, pero lo abre de forma automática al ingresar el comando dos (2), como se explica anterior mente.
- 2)	Mediante un complemento por parte de Create React App Sample
## Material completo almacenado en GitHub
- ttps://github.com/egperezm/Gestion_Notas.git
- Documentación en formato PDF [Proyecto2.pdf](https://github.com/user-attachments/files/17235286/Proyecto2.pdf)

  















