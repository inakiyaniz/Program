package generalClasses;

public class PersonalData {
	
	private String name;
	private String apellido1;
	private String apellido2;
	private String dni;
	
	
	public PersonalData(String name, String apellido1, String apellido2, String dni ) {
		
		this.name = name;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}
	
	public String toString() {
		System.out.println("the name is: "+name);
		return apellido1;
	}
	public String getNombre() {
		return name;
		
	}
	
	public String getApellido1() {
		return apellido1;
		
	}
	public String getApellido2() {
		return apellido2;
		
	}
	public String getDni() {
		return dni;
		
	}
	public void setNombre(String unknown) {
		this.name = unknown;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void rellenaDatos() {
		
	}
	
}

