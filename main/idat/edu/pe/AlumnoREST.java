package idat.edu.pe;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;


//Convirtiendo la clase a una rest
@RestController
public class AlumnoREST {
	
	
	
//	Lista = GET
	public List<Alumno> getListaAlumnos(){
		return null;
	}
	
//	Guarde = POST
	public List<Alumno> postGuardarAlumno(Alumno alumno){
		return null;
	}
	
//	Eliminar == DELETE
	public List<Alumno> deleteEliminarAlumnos(int codigo){
		return null;
	}
	
	
	

}
