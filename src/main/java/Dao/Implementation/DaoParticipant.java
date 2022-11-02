package Dao.Implementation;

import Dao.Interface.IDao;
import Entity.Participant;

import java.util.List;

public class DaoParticipant implements IDao<Participant> {

    @Override
    public boolean delete(Participant o) {
        return false;
    }

    @Override
    public List<Participant> findAll() {
        return null;
    }

    @Override
    public boolean insert(Participant o) {
        return false;
    }

    @Override
    public boolean update(Participant o) {
        return false;
    }
}
