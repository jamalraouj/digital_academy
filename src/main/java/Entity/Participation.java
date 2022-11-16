package Entity;

//the present participant in activities && manyToMany between participant and activity , plus presents


import jakarta.persistence.*;

@Entity
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @ManyToOne
    private  Participant participant;
    @ManyToOne
    private  Activity activity;

    public Participation() {

    }


    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Participation(Participant participant, Activity activity) {
        this.participant = participant;
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Participation{" +
                "id=" + id +
                ", participant=" + participant +
                ", activity=" + activity +
                '}';
    }
}
