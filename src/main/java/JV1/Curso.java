package JV1;

public class Curso {
    private String Codigo;
    private String Creditos;
    private int Id;

    public Curso(int id, String codigo, String creditos) {
        this.Id = id;
        this.Creditos = creditos;
        this.Codigo = codigo;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getCreditos() {
        return Creditos;
    }

    public void setCreditos(String creditos) {
        Creditos = creditos;
    }
}


