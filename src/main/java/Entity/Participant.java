package Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Participant extends Person {

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

    public Participant(String domaine, String structure) {
        this.domaine = domaine;
        this.structure = structure;
    }

    public Participant(long id, String name, String phone, Role role, String domaine, String structure) {
        super(id, name, phone, role);
        this.domaine = domaine;
        this.structure = structure;
    }
    public Participant(String name, String phone, Role role, String domaine, String structure) {
        super(name, phone, role);
        this.domaine = domaine;
        this.structure = structure;
    }

}
