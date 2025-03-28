class Book {
    String title;
    int publicationYear;

    Book(String name, int year) {
        this.title = name;
        this.publicationYear = year;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String nameOfAuthor;
    String bio;

    Author(String title, int publicationYear, String authName, String bio) {
        super(title, publicationYear);
        this.nameOfAuthor = authName;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + nameOfAuthor);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author book = new Author("wings of fire", 2004, "A. P. J. Abdul Kalam",
                "Former President of India and aerospace scientist");
        System.out.println("Book Details: \n");

        book.displayInfo();
    }
}