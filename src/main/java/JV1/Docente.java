package JV1;

    public class Docente {
        private int Id;
        private String Nombres;
        private String Apellidos;
        private String Carrera;

    public Docente(int id, String nombres, String apellidos, String carrera) {
        this.Id = id;
        this.Nombres = nombres;
        this.Apellidos = apellidos;
        this.Carrera = carrera;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
}
