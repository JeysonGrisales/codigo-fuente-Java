import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operaciones {
	
	ArrayList<String> persona = new ArrayList <String>();
	ArrayList<String> Documento = new ArrayList <String>();
	ArrayList<String> Telefono = new ArrayList <String>();
	String nombreCompleto, documento, telefono;
	int indice;

public void registrarPersonas() {
		nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre");
		persona.add(nombreCompleto);
		documento = JOptionPane.showInputDialog("Ingrese el numero de documento");
		Documento.add(documento);
		telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono");
		Telefono.add(telefono);
	}
	
	public void consultarPersonas() {
		
		System.out.println("Consultar personas");
		
		String buscar = JOptionPane.showInputDialog("¿A quien desea buscar?");
		
		if(persona.contains(buscar)) {
			indice = persona.indexOf(buscar);
			System.out.println("Persona: "+ persona.get(indice)+ " Documento: "+Documento.get(indice) + " Telefono: "+Telefono.get(indice));
			System.out.println("--------------------------------------");
		}
	}
	
	
	public void consultarListasPersonas() {
		
		System.out.println("Lista de personas");
		
		for (int i = 0; i < persona.size(); i++) {
			System.out.println("Persona: "+ persona.get(i)+ " Documento: "+Documento.get(i) + " Telefono: "+Telefono.get(i));
			System.out.println("--------------------------------------");
		}
	}
	
	public void actualizarPersonas() {
		
		System.out.println("Actualizacion de datos");
		
		String buscar = JOptionPane.showInputDialog("Nombre que desea actualizar");
		
		int i2= 0;
		
		if(persona.contains(buscar)) {
			String dato = JOptionPane.showInputDialog("¿Actualizar nombre, documento o telefono?");
			i2 = persona.indexOf(buscar);
			if(dato.equalsIgnoreCase("documento")) {
				String doc = JOptionPane.showInputDialog("Introduzca el nuevo documento");
				Documento.set(i2, doc);
			}else if(dato.equalsIgnoreCase("telefono")) {
				String tel = JOptionPane.showInputDialog("Introduzca el nuevo telefono");
				Telefono.set(i2, tel);
			}else if(dato.equalsIgnoreCase("nombre")) {
				String nom = JOptionPane.showInputDialog("Introduzca el nuevo nombre");
				persona.set(i2,nom);
			}else {
				System.out.println("No se encontro");
			}
			
		}
		System.out.println("Datos actualizados");
	}
	
	public void eliminarPersonas() {
		
		System.out.println("Eliminar datos");
		
		String eliminar = JOptionPane.showInputDialog("Persona que desea eliminar");
		
		int i2= 0;
		
		if(persona.contains(eliminar)) {
			i2 = persona.indexOf(eliminar);
			
			System.out.println("Persona: "+ persona.remove(i2)+ " Documento: "+Documento.remove(i2) + " Telefono: "+Telefono.remove(i2));
			System.out.println("Datos eliminados con exito");
			System.out.println("--------------------------------------");
			
		}
	}
	
	public void cantidadPersonas() {
		
		System.out.println("Cantidad de personas");
		
		System.out.println("La cantidad de personas es: "+persona.size());
	}
}
