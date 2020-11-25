package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	
	public Evento(TipoDeEvento tipo, Map<Integer, Deportista> participantes) {
		super();
		this.tipo = tipo;;
		this.participantes = participantes;
	}

	public Evento(Evento evento) {
		// TODO Auto-generated constructor stub
	}
	

	public TipoDeEvento getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}


	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}


	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}


	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}


	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}
	
}
