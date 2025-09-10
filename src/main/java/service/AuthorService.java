package service;

import model.Author;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author kenneth
 */
public class AuthorService {

    public static boolean authorLiving(Author author) { return author.getDateOfDeath() == null; }

    /**
     * Gives a summary of an author's information. Has an internal check for an author's current
     * alive or dead status. It will print out the correct info based on this information.
     */
    public static String authorSummary(Author author) {
        String deathInfo = authorLiving(author)
                ? "Currently Alive"
                : author.getDateOfDeath().toString();

        return "\n------------Author Summary------------\n" +
                "Name: " + author.getName() + ",\n" +
                "Nationality: " + author.getNationality() + ",\n" +
                "Date of Birth: " + author.getDateOfBirth() + ",\n" +
                "Date of Death: " + deathInfo + ",\n" +
                "Primary Genre(s): " + author.getGenres();
    }

    /**
     ** Uses the java.time library to calculate the date of birth to death. If the author has
     ** not died, then the current time will be used to calculate the authors age in the
     ** current year
     **/
    public static String authorAge(Author author) {
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
