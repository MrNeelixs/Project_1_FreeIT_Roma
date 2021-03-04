/**
 *
 */
public class Author {
    private String name, surname, pseudonym, genreWork;
    private int age, numberOfPieces;

    public Author(String name, String surname, String genreWork, int age, int numberOfPieces) {
        this.name = name;
        this.surname = surname;
        this.genreWork = genreWork;
        this.age = age;
        this.numberOfPieces = numberOfPieces;
    }

    public Author(String pseudonym, String genreWork, int age, int numberOfPieces) {
        this.pseudonym = pseudonym;
        this.genreWork = genreWork;
        this.age = age;
        this.numberOfPieces = numberOfPieces;
    }

    private Author() {

    }


}