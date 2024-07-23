package org.axelxitumul.modelo;
public class Libro {
	//fase de declaración de variables
	private int idLibro;
	private String nombreDelLibro;
	private String nombreDelAutor;
	private String nombreDeLaEditorial;
	private int edicion;
        private boolean estado_actividad;
	
	//fase de declaración y definición de los métodos
	public Libro(){
            
        };
	
	public Libro(String nombreLibro, String nombreAutor, String nombreEditorial, int edicion, boolean estado_actividad) {
		this.nombreDelLibro = nombreLibro;
		this.nombreDelAutor = nombreAutor;
		this.nombreDeLaEditorial = nombreEditorial;
		this.edicion = edicion;
                this.estado_actividad = estado_actividad;
	}
	
	public int getIdLibro(){
		return idLibro;
	}
	
	public void setIdLibro(int id){
		this.idLibro = id;
	}
	
	public String getNombreDelLibro() {
		return nombreDelLibro;
	}
	
	public void setNombreDelLibro(String nombreLibro) {
		this.nombreDelLibro = nombreLibro;
	}
	
	public String getNombreDelAutor(){
		return nombreDelAutor;
	}
	
	public void setNombreDelAutor(String nombreAutor){
		this.nombreDelAutor = nombreAutor;
	}
	
	public String getNombreDeLaEditorial(){
		return nombreDeLaEditorial;
	}
	
	public void setNombreDeLaEditorial(String nombreEditorial){
		this.nombreDeLaEditorial = nombreEditorial;
	}
	
	public int getEdicion(){
		return edicion;
	}
	
	public void setEdicion(int edicion){
		this.edicion = edicion;
	}
        public boolean getEstadoLibro(){
            return estado_actividad;
        }
        public void setEstadoLibro(boolean estado_actividad){
            this.estado_actividad = estado_actividad;
        }
}