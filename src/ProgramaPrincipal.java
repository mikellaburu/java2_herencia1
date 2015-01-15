import java.util.Hashtable;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main (String [ ] Args) {

	        Parque parque = new Parque();
	        parque.setTipoEspacio("Parque");
	        parque.setUbicacion("Aiako Harriak");
	        parque.setExtension(13563);
	        parque.setTipoParque("Natural");
	        
	        
	        System.out.println("Tipo de espacio:" + parque.getTipoEspacio());
	        System.out.println("Ubicacion:" + parque.getUbicacion());
	        System.out.println("Extension:" + parque.getExtension() + " m2");
	        System.out.println("Tipo de parque:" + parque.getTipoParque());
	        System.out.println();

	        Museo museo = new Museo();
	        museo.setTipoEspacio("Museo");
	        museo.setUbicacion("Miramon");
	        museo.setExtension(1363);
	        museo.setTipoMuseo("Ciencia");
	        museo.setCantidadObras(56);
	        museo.setPrecio(2.50);
	        
	        
	        System.out.println("Tipo de espacio:" + museo.getTipoEspacio());
	        System.out.println("Ubicacion:" + museo.getUbicacion());
	        System.out.println("Extension:" + museo.getExtension() + " m2");
	        System.out.println("Tipo:" + museo.getTipoMuseo());
	        System.out.println("Cantidad de obras:" + museo.getCantidadObras());
	        System.out.println("Precio:" + museo.getPrecio());
	        System.out.println();

	        Biblioteca biblio = new Biblioteca();
	        biblio.setTipoEspacio("Biblioteca");
	        biblio.setUbicacion("Hernani");
	        biblio.setExtension(986);
	        biblio.setNombre("Biteri");
	        biblio.setCantidadLibros(3543);
	        biblio.setCantidadSocios(10254);
	        biblio.setEsPublico(true);

	        System.out.println("Tipo de espacio:" + biblio.getTipoEspacio());
	        System.out.println("Ubicacion:" + biblio.getUbicacion());
	        System.out.println("Extension:" + biblio.getExtension() + " m2");
	        System.out.println("Nombre:" + biblio.getNombre());
	        System.out.println("Cantidad de libros:" + biblio.getCantidadLibros());
	        System.out.println("Cantidad de socios:" + biblio.getCantidadLibros());
	        if (biblio.getEsPublico) {

	        	System.out.println("Es pública");

	        }else{

	        	System.out.println("Es privada");
	        }
	        System.out.println();


	        Hashtable<String,String> telefonos = new Hashtable<String,String>();

	        telefonos.put("Mikel", "688815554");
			telefonos.put("Anthony", "625990165");
			telefonos.put("Sergei", "654341315");
			telefonos.put("David", "943786361");
			telefonos.put("Odei", "638828783");

			System.out.println("\tContenido del HASHTABLE de nombres y telefonos");
			System.out.println(telefonos.get("Mikel"));
			System.out.println(telefonos.get("Odei"));
			System.out.println(telefonos.get("Anthony"));
	        
	}
}