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

	        

	        Hashtable<String,String> telefonos = new Hashtable<String,String>();

	        telefonos.put("Mikel", "688815554");
			telefonos.put("Anthony", "625990165");
			telefonos.put("Sergei", "654341315");
			telefonos.put("David", "943786361");
			telefonos.put("Odei", "638828783");

			System.out.println("\tContenido del HASHTABLE de nombres y telefonos");
			System.out.println(telefonos.get("Mikel"));
			System.out.println(telefonos.get("Odei"));
			System.out.println(telefonos.get("688815554"));
	        
	}
}