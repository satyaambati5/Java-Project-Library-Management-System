Project: Library Management System
Objective:
Create a system where users can borrow, return, and search for books in a library. This project will involve various entities like books, members, and staff. The focus is on using OOP principles such as classes, inheritance, polymorphism, and encapsulation.

Key Classes and Concepts:
Class: Book

Fields: title, author, ISBN, isAvailable
Methods: Getters/Setters, checkAvailability(), borrowBook(), returnBook()
Class: LibraryMember (Parent Class)

Fields: memberId, name
Methods: Getters/Setters, borrowBook(Book book), returnBook(Book book)
Class: Student (Child Class of LibraryMember)

Additional fields: studentId, department
Can borrow only a limited number of books (demonstrating polymorphism).
Class: Staff (Child Class of LibraryMember)

Additional fields: staffId, position
Staff can borrow a higher number of books.
Interface: Searchable

Methods: searchByTitle(String title), searchByAuthor(String author)
Polymorphism:

You can show different borrowing limits for Student and Staff using runtime polymorphism.
Class: Library

Fields: List of books, List of members
Methods: addBook(), removeBook(), listAvailableBooks(), searchBook() (implementing the Searchable interface).
Features:
Members can borrow and return books.
A search functionality to find books by title or author.
Ensure the availability of books before borrowing.
Implement different rules for borrowing books depending on the type of member (student or staff).
