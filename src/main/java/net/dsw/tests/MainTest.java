package net.dsw.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;

import net.dsw.services.*;


public class MainTest { 

	public static void main(String[] args) throws MalformedURLException {
		//CONFIGURACIÓN DE ACCESO AL WEB SERVICES
		//Se establece la ruta URL donde se puede localizar el endpoint (wsdl)
		final String endpoint ="http://localhost:8080/WS2-JAX-WS/ws/studentport?wsdl";
		//Se crea un objeto url del endpoint
		final URL url = new URL(endpoint);
		//Se crea una instancia del proveedor (servicio). Es facil localizar cual es la clase pues contiene @WebServiceClient
		final StudentService service= new StudentService(url);
		//Se obtiene un punto de acceso o puerto creando una instancia de la clase definida del endpoint
		final Student port = service.getPort(Student.class);
		
		//CONFIGURACIÓN SE LA CABECERA HTTP PARA LA AUTENTICACIÓN
		//Como la seguridad de acceso al endpoint y en general al servicio web se basa en enviar datos de
		//autenticación (usuario y contraseña) en la cabecera http en cada petición, es necesario configurar
		//el proveedor para que en cada petición (invocación a los métodos de un objeto de la clase del endpoint)
		//se añada dichos parámetros.
		BindingProvider bp = (BindingProvider) port;
		// Se configura los parámetros http que iran en la cabecera de todas las peticiones (usuario y contraseña)
        Map<String, List<String>> responseHeaders = new HashMap<String, List<String>>();
        responseHeaders.put("username", Collections.singletonList("root"));
        responseHeaders.put("password", Collections.singletonList("1234"));
        bp.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, responseHeaders);
		
        //OPERATIVA Y EXPLOTACIÓN DEL SERVICIO WEB
        
        //Invocación al método getStudentById
		StudentContainerData objStudent = port.getStudentById(1);
		
		System.out.println("LOS DATOS DEL/LA ESTUDIANTE ID = 1 SON:");
		System.out.println("");
		System.out.println("DNI:" + objStudent.getLista().get(0).getDni());
		System.out.println("NOMBRE:" + objStudent.getLista().get(0).getName());
		System.out.println("APELLIDOS:" + objStudent.getLista().get(0).getFirstLastName() + " " + objStudent.getLista().get(0).getSecondLastName());
		System.out.println("FECHA NACIMIENTO:" + objStudent.getLista().get(0).getBirthdate());

	}

}
