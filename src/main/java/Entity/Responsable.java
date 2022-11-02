package Entity;
import jakarta.persistence.Entity;

@Entity
public class Responsable extends User {
    private String domaine;
//    @Enumerated(EnumType.STRING)
    private TypeResponsable TypeResp;

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public TypeResponsable getTypeResp() {
        return TypeResp;
    }

    public void setTypeResp(TypeResponsable typeResp) {
        TypeResp = typeResp;
    }
    public Responsable() {

    }
    public Responsable(int id, String name, String phone, String email, String password, Boolean status, Role role, String domaine, TypeResponsable typeResp) {
        super(id, name, phone, email, password, status, role);
        this.domaine = domaine;
        TypeResp = typeResp;
    }
}
