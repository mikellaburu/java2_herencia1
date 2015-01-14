//superclase

public class EspacioPublico {
	//atributos
	private String tipoEspacio;
	private String ubicacion;
	private double extension;
	
	//constructor por defecto
	EspacioPublico(){
		this.tipoEspacio = " ";
		this.ubicacion = " ";
		this.extension = 0;
	}

	//getters
	public String getTipoEspacio(){
		return this.tipoEspacio;
	}

	public String getUbicacion(){
		return this.ubicacion;
	}

	public double getExtension(){
		return this.extension;
	}

	//setters
	public void setTipoEspacio (String tipo){
		this.setTipoEspacio = tipo;
	}
	
	public void setUbicacion (String sitio){
		this.ubicacion = sitio;
	}
	
	public void setExtension (double m2){
		extension = m2;
	}
	
	
}