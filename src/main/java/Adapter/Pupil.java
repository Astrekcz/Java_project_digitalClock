package Adapter;

import java.util.List;

public class Pupil {
    private final String firstName;
    private final String LastNAme;
    private final String email;
    private final Integer age;
    private final List<Integer> grades;

    public Pupil(final String firstName, final String lastNAme, final String email,
                 final Integer age, final List<Integer> grades) {
        this.firstName = firstName;
        LastNAme = lastNAme;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNAme() {
        return LastNAme;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
