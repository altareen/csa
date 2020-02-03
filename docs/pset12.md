# Problem Set 12: Library Rental(Winter Break Assignment)

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Monday, March 2nd, 2020
+ **Total Points:** 10
+ Implement a `Java` program that manages an electronic book rental system for a library.

## Background Theory
+ The libraries of SmallTownX need a new electronic book rental system, and it is up to you to build it. SmallTownX has two libraries. Each library offers many books to rent. Customers can print the list of available books, borrow, and return books.
+ Four classes have been given: `Book`, `Library`, `LibraryTest`, and `LibraryJUnitTest`. These classes provide the functionality for the book database. You must implement the missing methods in the file `Library.java` to make these classes work.

## The Problem Scope
+ Your task for this problem set is to implement the `Library` class. It is the class that will represent each library, and manage a collection of books. All libraries have the same hours: 9AM to 5PM daily. However, they have different addresses and book collections (i.e., ArrayLists of `Book` objects).
+ The files `Book.java`, `Library.java`, `LibraryTest.java` and `LibraryJUnitTest.java` have been provided for you. `public static void main(String[] args)` method is included in `LibraryTest.java` which creates two libraries, and then performs some operations on the books. However, most of the necessary methods in the file `Library.java` are missing.
+ Specifically, the methods you will need to define and implement are the following:
```bash
public static String displayOpeningHours()
public String displayAddress()
public String addBook(Book novel)
public String borrowBook(String novelName)
public String returnBook(String textName)
```

## Hints

+ Note that all of these methods return a `String`. If you examine the output of the program run, you will notice that every time some method is called, it returns a confirmation message.
+ Do not include any `System.out.println()` statements to display a confirmation message to the output. These `String` messages are return values from each method, which are then printed out in the file `LibraryTest.java`.
+ Be careful when comparing `String` objects. Use `first.equals(second)` for comparing the contents of
`first` and `second`.
+ You should get a small part working at a time. Start by commenting out the entire `public static void main(String[] args)`, then uncomment it line by line. Run the program, get the first lines working, then uncomment the next line, get that working, etc.
+ You must **not** modify the code in `Book.java`, `LibraryTest.java`, and `LibraryJUnitTest.java`.
+ This is a much tougher assignment than what you are accustomed to. Start working on this project as soon as possible, and leave plenty of time for debugging. Also, I will be checking carefully for plaigiarism violations.

## Example Case

+ The output when you run this program should be similar to the following:

```bash
Adding books to the first library:
You have successfully added The Da Vinci Code
You have successfully added Le Petit Prince
You have successfully added A Tale of Two Cities
You have successfully added The Lord of the Rings

Library hours:
Libraries are open daily from 9am to 5pm.

Library addresses:
10 Main St.
228 Liberty St.

Borrowing The Lord of the Rings:
You have successfully borrowed The Lord of the Rings
Sorry, this book is already borrowed.
Sorry, this book is not in our catalog.

Books available in the first library:
The Da Vinci Code
Le Petit Prince
A Tale of Two Cities

Books available in the second library:
No books in our catalog.

Returning The Lord of the Rings to the second library:
Sorry, this book is not in our catalog.

Returning The Lord of the Rings to the first library:
You have successfully returned The Lord of the Rings

Books available in the first library:
The Da Vinci Code
Le Petit Prince
A Tale of Two Cities
The Lord of the Rings
```

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for Library Rental | 12KB | [pset12.zip](/csa/zip/pset12.zip)

**Contents of `pset12.zip`:**
```bash
PSet12LibraryRental/
├── Book.class
├── Book.ctxt
├── Book.java
├── Library.class
├── Library.ctxt
├── Library.java
├── LibraryJUnitTest.class
├── LibraryJUnitTest.ctxt
├── LibraryJUnitTest.java
├── LibraryTest.class
├── LibraryTest.ctxt
├── LibraryTest.java
├── package.bluej
└── README.TXT
```

## Specification
+ Write a `Java` program in the file `Library.java` that manages an electronic book rental system for a library.
+ You will write your solutions in the following functions where it states: `YOUR CODE HERE`
```bash
public static String displayOpeningHours()
public String displayAddress()
public String addBook(Book novel)
public String borrowBook(String novelName)
public String returnBook(String textName)
```

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench. `JUnit` indicates a successful test with a **green** bar, and an unsuccessful test with a **red** bar.

## Submission
+ Upload the file `Library.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.

