package Entity;
import jakarta.persistence.Entity;

@Entity
public class Participant extends User{

    private String domaine;
    private String structure;


    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }
    public Participant() {

    }

    public Participant(long id, String name, String phone, String email, String password, Boolean status, Role role, String domaine, String structure) {
        super(id, name, phone, email, password, status, role);
        this.domaine = domaine;
        this.structure = structure;
    }
}
