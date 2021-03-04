/**
 *
 */
public class Book {
    private String nameBook, author, genre;
    private int yearRealize, numberOfPages;
    private String code;

    public Book (String nameBook,String author,String genre,int yearRealize,int numberOfPages,String code){
        this.nameBook = nameBook ;
        this.author = author;
        this.genre = genre;
        this.yearRealize = yearRealize;
        this.numberOfPages = numberOfPages;
        this.code = code;
    }
    private Book(){

    }

    public void showBook(){
        System.out.println("Название книги : "+nameBook);
        System.out.println("Автор : "+author);
        System.out.println("Жанр : "+genre);
        System.out.println("Написана в "+yearRealize);
        System.out.println("Кол-во страниц : "+numberOfPages);
        System.out.println("Номер в бибилиотеке : "+code);
    }

}