package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.Period;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public Profile(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        if (dateOfBirth == null) {
            return -1;
        } else {
            return Period.between(dateOfBirth, LocalDate.now()).getYears();
        }
    }

    public boolean allowedToWatch(Content content) {
        int minimumAge = content.getMaturityRating().getMinimumAge();
        int profileOwnerAge = this.getAge();

        return profileOwnerAge >= minimumAge;
    }


}
