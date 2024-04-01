class Empleado extends Persona {
    private String departamento;
    private double salario;
    private String fechaContratacion;


    public Empleado(String nombre, String direccion, String telefono, String email, String departamento, double salario, String fechaContratacion) {
        super(nombre, direccion, telefono, email);
        
        if (departamento.equals("Contabilidad") || departamento.equals("Recursos Humanos") || departamento.equals("Compras")) {
            this.departamento = departamento;
        } else {
            this.departamento = "Recursos Humanos";
        }
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
	public String toString() {
		return "Empleado [departamento=" + departamento + ", salario=" + salario + ", fechaContratacion="
				+ fechaContratacion + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}
}

