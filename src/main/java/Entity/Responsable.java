package Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Responsable extends Person {
    private String domaine;
//    @Enumerated(EnumType.STRING)
    private TypeResponsable TypeResp;

    public Responsable(String name, String phone,Role role,TypeResponsable typeResp, String domaine) {
        super(name, phone, role);
        this.domaine = domaine;
        TypeResp = typeResp;
    }
    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }
    @Enumerated(EnumType.STRING)
    public TypeResponsable getTypeResp() {
        return TypeResp;
    }

    public void setTypeResp(TypeResponsable typeResp) {
        TypeResp = typeResp;
    }
    public Responsable() {

    }

    public Responsable(String domaine, TypeResponsable typeResp) {
        this.domaine = domaine;
        TypeResp = typeResp;
    }

    public Responsable(long id, String name, String phone, Role role, String domaine, TypeResponsable typeResp) {
        super(id, name, phone, role);
        this.domaine = domaine;
        TypeResp = typeResp;
    }
}
