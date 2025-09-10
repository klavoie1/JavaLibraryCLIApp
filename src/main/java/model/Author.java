package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Author {
    private int id;
    private String name;
    private String nationality;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;
    private ArrayList<String> genres;

    public Author() {
        id = 0;
        name = "unknown";
        nationality = "unknown";
        dateOfBirth = null;
        dateOfDeath = null;
        genres = new ArrayList<>();
    }

    public Author(int id, String authorName, String authorNationality, LocalDate authorDateOfBirth,
                  LocalDate authorDateOfDeath, ArrayList<String> genres) {
        this.id = id;
        this.name= authorName;
        this.nationality = authorNationality;
        this.dateOfBirth = authorDateOfBirth;
        this.dateOfDeath = authorDateOfDeath;
        this.genres = new ArrayList<>(genres);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", nationality='" + nationality + "'" +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfDeath=" + dateOfDeath +
                ", genres=" + genres +
                "}";
    }

    /**
     ** Uses the java.time library to calculate the date of birth to death. If the author has
     ** not died, then the current time will be used to calculate the authors age in the
     ** current year
     **/
    public String authorAge(LocalDate dateOfBirth, LocalDate dateOfDeath) {
        if (this.dateOfDeath != null) {
            int ageOfDeath = Period.between(this.dateOfBirth, this.dateOfDeath).getYears();

            return this.name  + " died at the age of " + ageOfDeath;
        } else {
            int currentAge = Period.between(this.dateOfBirth, LocalDate.now()).getYears();

            return this.name + " is currently " + currentAge + " years old.";
        }
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getNationality() { return nationality; }

    public void setNationality(String nationality) { this.nationality= nationality; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public LocalDate getDateOfDeath() { return dateOfDeath; }

    public void setDateOfDeath(LocalDate dateOfDeath) { this.dateOfDeath = dateOfDeath; }

    public List<String> getGenres() { return genres; }

    public void setGenres(ArrayList<String> genres) { this.genres = new ArrayList<>(genres); }
}
