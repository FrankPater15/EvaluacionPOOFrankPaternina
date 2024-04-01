class Estudiante extends Persona {
    private int estado;
    private double promedio;

    public Estudiante(String nombre, String direccion, String telefono, String email, int estado, double promedio) {
        super(nombre, direccion, telefono, email);
        this.promedio = promedio;
        
        if (estado >= 1 && estado <= 4) {
            this.estado = estado;
        } else {
            this.estado = 1;
        }
    }

    @Override
	public String toString() {
		return "Estudiante [estado=" + estado + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + ", email=" + email + "promedio=" + promedio;
	}
}

