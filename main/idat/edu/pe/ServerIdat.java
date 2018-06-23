package idat.edu.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Es necesario agregar la anotacion para cambiar el  tipo de clase
@SpringBootApplication
public class ServerIdat {
	
	public static void main(String[] args) {
//		Inicializar el server
//		El codigo esta generando un servidor
//		Parametro 1 Nombre de la clase
		SpringApplication.run(ServerIdat.class, args);
	}
	

}
