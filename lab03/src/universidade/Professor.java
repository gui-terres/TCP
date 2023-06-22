package universidade;

public class Professor {
    private int id;
    private String departamento;

    public Professor(int idProf, String depto) {
        this.id = idProf;
        this.departamento = depto;
    }

    public Professor() {}

    public void setId(int newId) {
        this.id = newId;
    }

    public void setDepartamento(String newDepartamento) {
        this.departamento = newDepartamento;
    }
}
