package service;

import model.Author;

import java.time.LocalDate;
import java.time.Period;

public class AuthorService {
    private Author author;

    /**
     ** Uses the java.time library to calculate the date of birth to death. If the author has
     ** not died, then the current time will be used to calculate the authors age in the
     ** current year
     **/
    public String authorAge(Author author) {
        if (author.getDateOfDeath() != null) {
            int ageOfDeath = Period.between(author.getDateOfBirth(), author.getDateOfDeath()).getYears();
            return author.getName()  + " died at the age of " + ageOfDeath;
        } else {
            int currentAge = Period.between(author.getDateOfBirth(), LocalDate.now()).getYears();

            if (currentAge > 120) { return "Error: Age is over 120, there is probably a mistake in the Authors Data. " +
                                            "Please check and try again."; }

            return author.getName() + " is currently " + currentAge + " years old.";
        }
    }
}
