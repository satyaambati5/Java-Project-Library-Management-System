public class LibraryManagementSystemMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");
//        Books List
        BookLibrary book1 =new BookLibrary("Java", "satya","JV12345",true);
        BookLibrary book2 =new BookLibrary("Spring Boot", "ambati","CC12345",true);
        BookLibrary book3 =new BookLibrary("python", "satyapy","PY12345",true);

        System.out.println("Available Books: ");
        System.out.println("1. "+book1.getBookDetails());
        System.out.println("2. "+book2.getBookDetails());
        System.out.println("3. "+book3.getBookDetails());
        book2.borrowBook();
        book2.returnBook();

//        System.out.println(book2.getCheckAvailable());
//For Library Member Object
//        LibraryMember libmember=  new LibraryMember("SA1245","SatyaAmbati");
//        libmember.borrowBook(book3);
//        System.out.println(book3.getCheckAvailable());
//
//
//        book3.borrowBook();
//        libmember.borrowBook(book3);
//        book3.returnBook();

    }
}
