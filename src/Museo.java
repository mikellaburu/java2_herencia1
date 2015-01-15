
//subclase
public class Museo extends EspacioPublico {
	
	//atributos
	private String tipoMuseo;
	private int cantidadObras;
	private double precio;

	//getters
	public String getTipoMuseo() {
		return this.tipoMuseo;
	}

	public int getCantidadObras() {
		return this.cantidadObras;
	}

	public double getPrecio() {
		return this.precio;
	}

	//setters
	public void setTipoMuseo(String tipo) {
		this.tipoMuseo = tipo;
	}

	public void setCantidadObras(int obras) {
		this.cantidadObras = obras;
	}

	public void setPrecio(double euros) {
		this.precio = euros;
	}
}