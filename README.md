--------------------------------------------------------------------------------------------------------
                                Java-Jaxws-Soap-ProjectDemo1-Test       

                                    - Autor: Daniel Pérez                     
                                    - Fecha: 11/07/2023                       
--------------------------------------------------------------------------------------------------------

--------------------------------------------------------------------------------------------------------
Requisitos técnicos
--------------------------------------------------------------------------------------------------------

	- Versión JDK: OpenJdk (v17)
        - IDE: Eclipse 2023-06
        - Gestor de proyecto y arquetipo: Maven (Proyecto java de consola)
        - Plugin de Maven para consumir web services: cxf-codegen-plugin
	- Dependencia: jaxws-rt v4.0.1
       
-------------------------------------------------------------------------------------------------------
Descripción
-------------------------------------------------------------------------------------------------------

Este proyecto se corresponde con una aplicación de consola que consume el Web Services Soap disponible en el repositorio Java-Jaxws-Soap-ProjectDemo1

Como requisito previo, debe tener desplegada dicha aplicación (Jaxws-Soap-ProjectDemo1) en el correspondiente servidor (ej: Apache TomCat 10) y estar accesible el contrato del siguiente end-point del webservices:

http://localhost:8080/WS2-JAX-WS/ws/studentport?wsdl

-------------------------------------------------------------------------------------------------------
Compilación y ejecución
-------------------------------------------------------------------------------------------------------

Es necesario, que una vez alojado e importado en eclipse el directorio de este proyecto, en tu espacio de trabajo, modifiques las rutas absolutas del pom.xml y que se indican a continuación:

C:/Users/dani1/eclipse-workspace/TEST-WS-JAXWS/target/generated-sources/cxf
C:/Users/dani1/eclipse-workspace/TEST-WS-JAXWS/src/main/resources/studentport.wsdl

Es decir, debe modificar o revisar, la sección de dichas rutas relativas a C:/Users/dani1/eclipse-workspace/TEST-WS-JAXWS/ por la ruta real según su máquina.

Tras adaptar dichas rutas, debe forzar un "maven update", limpiar y recompilar el proyecto.

Nota: Si no adapta dichas rutas y fuerza una actualización de maven, entonces se producirán errores en tiempo de compilación al no poderse localizar las clases serializadas desde el webservices. Recuerde, desplegar antes el WS SOAP en el servidor y estar accesible la url del contrato del end-point que se consumira en esta aplicación.

-------------------------------------------------------------------------------------------------------
Orden del desarrollo de este proyecto
-------------------------------------------------------------------------------------------------------

-1º Se creó un proyecto maven de tipo consola de java (quickstart)
-2º Se accedió vía url al end-point del ws a consumir (http://localhost:8080/WS2-JAX-WS/ws/studentport?wsdl) y se copio dicha especificación y se guardo en /src/main/resources/studentport.wsdl
-3º Se modificó el pom.xml adaptando la versión del JDK, añadiendo la dependencia jaxws-rt y añadiendo la referencia al plugin de maven cxf-codegen-plugin. Dentro de dicho plugin debe indicar la ruta donde se encuentra el contrato del end-point (wsdl) y la ruta bajo la cual se creará el espacio de nombre y clases serializadas del web services.
-4º Se creó la clase MainTest y el código de acceso, autenticación y consumo del ws.

Nota: Tenga en cuenta que cuando realice un maven update, el plugin cxf-codegen-plugin, en base al contrato del fichero studentport.wsdl generará bajo el target todas las clases relativas a dicho end-point. Es posible, que tras esto aparezca errores que deba subsanar o adaptar.
