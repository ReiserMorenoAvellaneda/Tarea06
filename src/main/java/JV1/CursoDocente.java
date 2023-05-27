package JV1;

public class CursoDocente {
    private int id;
    private Curso[] curso;
    private Docente[] docente;
    private int indicecursos;
    private int indicedocentes;

    public CursoDocente(int id, Curso curso, Docente docente) {
        this.id = id;
        this.curso = curso;
        this.docente = docente;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Docente[] docentes;

    private Curso[] cursos;

    public Docente[] getDocentes() {
        return docentes;
    }

    public void setDocentes(Docente[] docentes) {
        this.docentes = docentes;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    //CURSO
    public void agregarCurso(Curso curso) {
        this.cursos[this.indicecursos] = cursos;
        this.indicecursos++;

    }

    public void listarCurso(Curso curso) {

    }

    public void buscarCurso(Curso curso) {
        for (int i = 0; i < this.cursos.length; i++) {
            if (this.cursos[i].getId() == id) {
                return i;
            }
        }
        return 0;
    }

    public void editarCurso(Curso curso) {
        for (int i = 0; i < this.cursos.length; i++) {
            if (this.cursos[i].getId() == curso.getId()) {
                this.cursos[i] = curso;
                break;
            } else {
                this.cursos[i] = curso;
                break;
            }
        }

    }

    public void eliminarCurso(Curso curso) {
        for (int i = 0; i < this.cursos.length; i++) {
            if (this.cursos[i].getId() == curso.getId()) {
                for (int j = i; j < this.cursos.length - 1; j++) {
                    this.cursos[j] = this.cursos[j + 1];
                }
                this.docentes[indicedocentes - 1] = null;
                indicedocentes--;
                break;

            }
        }


    }

    //DOCENTE
    public void agregarDocente(Docente docente) {
        this.docentes[this.indicedocentes] = docente;
        this.indicedocentes++;

    }

    public void listarDocente() {

    }

    public void buscarDocente(Docente docente) {
        for (int i = 0; i < this.docentes.length; i++) {
            if (this.docentes[i].getId() == id) {
                return i;
            }
        }
        return 0;


    }

    public void editarDocente(Docente docente) {
        for (int i = 0; i < this.docentes.length; i++) {
            if (this.docentes[i].getNombres() == docente.getNombres()) {
                this.docentes[i] = docente;
                break;
            } else {
                this.docentes[i] = docente;
                break;
            }
        }
    }


    public void eliminarDocente(Docente docente) {
        for (int i = 0; i < this.docentes.length; i++) {
            if (this.docentes[i].getNombres() == docente.getNombres()) {
                for (int j = i; j < this.docentes.length - 1; j++) {
                    this.docentes[j] = this.docentes[j + 1];
                }
                this.docentes[indicedocentes - 1] = null;
                indicedocentes--;
                break;

            }
        }
    }
}