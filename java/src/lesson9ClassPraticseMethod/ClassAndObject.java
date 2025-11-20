package lesson9ClassPraticseMethod;

public class ClassAndObject {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.id=1;
        book1.name="The Great Gatsby";
        book1.author="F. Scott Fitzgerald";
        book1.pageCount=180;
        book1.description="A novel set in the Jazz Age that tells the story of Jay Gatsby's unrequited love for Daisy Buchanan.";

        System.out.println("Book id: "+book1.id);
        System.out.println("Book name: "+book1.name);
        System.out.println("Book author: "+book1.author);
        System.out.println("Book page: "+book1.pageCount);
        System.out.println("Book desc : "+book1.description);
    }
}
