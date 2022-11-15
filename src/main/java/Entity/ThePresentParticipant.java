package Entity;

//the present participant in activities && manyToMany between participant and activity , plus presents


import jakarta.persistence.OneToMany;

import java.io.Serializable;

public class ThePresentParticipant implements Serializable {
    @OneToMany
    private  Participant participant;
    @OneToMany
    private  Activity activity;

    public ThePresentParticipant() {
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

    public ThePresentParticipant(Participant participant, Activity activity) {
        this.participant = participant;
        this.activity = activity;
    }

}
