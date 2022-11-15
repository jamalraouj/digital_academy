package Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Activity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String dess;
    @Enumerated(EnumType.STRING)
    private Type type;
    private LocalDate startDate;
    private LocalDate endDate;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    private Responsable responsable;

    @OneToMany(mappedBy = "activity")
    private List<Participation> participation=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDess() {
        return dess;
    }

    public void setDess(String dess) {
        this.dess = dess;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Activity() {

    }
    public Activity(int id,String title, String dess, Type type, LocalDate startDate, LocalDate endDate, Status status, Responsable responsable) {
        this.id=id;
        this.title = title;
        this.dess = dess;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.responsable = responsable;
    }
    public Activity(String title, String dess, Type type, LocalDate startDate, LocalDate endDate, Status status, Responsable responsable) {
        this.title = title;
        this.dess = dess;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dess='" + dess + '\'' +
                ", type=" + type +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                ", responsable=" + responsable +
                '}';
    }
}
