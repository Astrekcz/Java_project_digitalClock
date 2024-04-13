package Adapter;

import java.util.Collection;

public interface Student {

    String getFullName();
    String getContactDetail();
    boolean isAdult();
    Collection<Integer> getResults();
}
