

public class LibraryMember {
//    fields
    private String memberId;
    private  String name;
//Constructor
    public LibraryMember(String memberId,String name){
        this.memberId=memberId;
        this.name = name;

    }
    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void borrowBook(BookLibrary book){
        if (book.getCheckAvailable()){
            System.out.println("Student Name: "+ getName()+"(ID: "+ getMemberId()+ ")"+" is trying to borrow the book " +book.getTitle());
            System.out.println("checking Availability......\n");
            System.out.println(book.getBookDetails());
            System.out.println("Borrowing is Successful!");
            book.setAvailable(false);
            System.out.println(getName()+" has borrowed the book " + book.getTitle()+" >> "+book.getAuthor());
        }
        else {
            System.out.println(" The book " +book.getTitle()+" is already borrowed by another member.");
        }
    }

    public void  returnBook(BookLibrary book){
        if(!book.getCheckAvailable()){
            System.out.println("The book '" + book.getTitle() + "' has been returned.");
            book.setAvailable(true);
            System.out.println("Book Is Available: " + book.getBookDetails());
        }
        else {
            System.out.println("The book  " + book.getTitle() + "  was missing From the Borrowed Entry Log.");


        }

    }

}
