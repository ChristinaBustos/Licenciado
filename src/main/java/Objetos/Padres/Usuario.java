package Objetos.Padres;

public abstract class Usuario {
    private int id;
    private String role;
    private String nombre;
    private int edad;
    private String email;
    private String password;

    public Usuario(int id, String role, String nombre, int edad, String email, String password) {
        this.id = id;
        this.role = role;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.password = password;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //No sé que otros métodos pueden ser Abstractos
    public abstract void acciones();
    public abstract boolean createAccount(Usuario user, String Secret);
}
