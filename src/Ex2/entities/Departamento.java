package Ex2.entities;

public class Departamento {
	private String name;
	
	public Departamento() {
		
	}
	public Departamento(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Departamento [name=" + name + "]";
	}
	
}
