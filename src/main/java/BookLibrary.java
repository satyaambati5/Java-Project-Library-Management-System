public class BookLibrary {
//    Fields or arguments
    private String title;
    private String author;
    private String ISBN;
    private Boolean isAvailable;

//    Constructor
    public BookLibrary(String title,String author,String ISBN,Boolean isAvailable){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.isAvailable= true;

    }

//Getters and Setters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Boolean getCheckAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(Boolean available) {
        this.isAvailable = available;
    }

    public String getBookDetails(){
        return String.format("Title:%s, Author: %s, ISBN: %s, IsAvailable: %s", getTitle(),getAuthor(),getISBN(),getCheckAvailable() ?"Yes": "No");
    }
    public void borrowBook(){
        if(isAvailable){

            System.out.println("The book '" + getTitle() + "' has been borrowed.");
            setAvailable(false);
        }
        else {
            System.out.println("The book '" + this.getTitle()+ "' is Not Available.");
        }
    }

    public void  returnBook() {
        if (!isAvailable) {
            System.out.println("The book '" + getTitle() + "' has been returned Successfully.");
            setAvailable(true);
            System.out.println("Book Is Available: " + getBookDetails());
        } else {
            System.out.println("The book '" + getTitle() + "' was missing SFrom the Borrowed Entry Log.");
        }
    }
}




