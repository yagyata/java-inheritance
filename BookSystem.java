class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo(){
        System.out.println("Book's title: " + title + " (" + publicationYear + ")");
    }
}

class Author extends Book {
    String name;
    String bio;
    public Author(String title, int publicationYear, String name, String bio) {
        super(title,publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author: " + name + "\nBio: " + bio);
    }
}

public class BookSystem {
    public static void main(String[] args) {
        Author author = new Author("Jane Eyre", 1847, "Charlotte Brontë", "Charlotte Nicholls, commonly known as Charlotte Brontë, was an English novelist and poet, the eldest of the three Brontë sisters who survived into adulthood and whose novels became classics of English literature.");

        author.displayInfo();
    }
}
