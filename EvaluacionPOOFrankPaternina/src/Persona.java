
class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String email;

    public Persona(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDirección: " + direccion + "\nTeléfono: " + telefono + "\nEmail: " + email;
    }
}
