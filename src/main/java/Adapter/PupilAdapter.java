package Adapter;

import java.util.Collection;
import java.util.List;

public class PupilAdapter
implements Student{
    private final Pupil pupil;

    public PupilAdapter(final Pupil pupil) {
        this.pupil = pupil;
    }
    @Override
    public String getFullName(){
        return
                pupil.getFirstName() + " " +
                pupil.getLastNAme()
                ;
    }

    @Override
    public String getContactDetail() {
        return pupil.getEmail();
    }

    @Override
    public boolean isAdult() {
        return pupil.getAge() >= 18;
    }
    @Override
    public Collection<Integer> getResults() {
        return pupil.getGrades();
    }
}
