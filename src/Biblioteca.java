
//subclase
public class Biblioteca extends EspacioPublico {
	
	//atributos
	private String nombre;
	private int cantidadLibros;
	private int cantidadSocios;
	private boolean esPublico; //si es publico es 'true', si no es privado

	//getters
	public String getNombre() {
		return this.nombre;
	}

	public int getCantidadLibros() {
		return this.cantidadLibros;
	}

	public int getCantidadSocios() {
		return this.cantidadSocios;
	}

	public boolean getEsPublico() {
		return this.esPublico;
	}

	//setters
	public void setTipoMuseo(String tipo) {
		this.tipoMuseo = tipo;
	}

	public void setCantidadLibros(int libros) {
		this.cantidadLibros = libros;
	}

	public void setCantidadSocios(int socios) {
		this.cantidadSocios = socios;
	}

	public void setPrecio(boolean publico) {
		this.esPublico = publico;
	}

}