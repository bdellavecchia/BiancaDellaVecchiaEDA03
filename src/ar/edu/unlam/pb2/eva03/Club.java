package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String,Evento> competencias;
	
	
	public Club(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		socios=new HashSet<Deportista>();
		competencias = new HashMap();
	}


	public void agregarDeportista(Deportista deportista) {
		// TODO Auto-generated method stub
		socios.add(deportista);
	}


	public Integer getCantidadSocios() {
		// TODO Auto-generated method stub
		return socios.size();
	}


	public void crearEvento(Evento evento, String nombreEvento) {
		// TODO Auto-generated method stub
		competencias.put(nombreEvento, new Evento(evento));
	}
	
	
	public Boolean inscribirEnEvento(String string, Deportista deportista) throws NoEstaPreparado {
		return null;
		// TODO Auto-generated method stub
	
	}



}
