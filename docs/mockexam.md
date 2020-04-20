# Mock Exam

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Monday, April 20, 2020 at 11:00AM CST.
+ Download and extract the `mockexamcode.zip` source code distribution, posted below.
+ Read through **Free-Response Questions 1** and **2**, and develop your responses with **BlueJ**.
+ Upload `CheckDigit.java` and `ReviewCollecter.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.
+ You may use the following [Java Quick Reference](/csa/pdf/javaQuickReference2020.pdf) sheet.
+ Consult the [Technical Support Page](techsupport.md) if you encounter any problems, such as: Unable to access Web-CAT, BlueJ difficulties, etc.

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for the Mock Exam | 19KB | [mockexamcode.zip](/csa/zip/mockexamcode.zip)

## Free-Response Question 1: `CheckDigit`
+ This question involves the use of **check digits**, which can be used to help detect if an error has occurred when a number is entered or transmitted electronically.
+ An algorithm for computing a check digit, based on the digits of a number, is provided in Part (a).
+ The `CheckDigit` class is shown below. You will write two methods of the `CheckDigit` class.

```java
public class CheckDigit
{
    /** Returns the check digit for num, as described in Part (a).
     *  Precondition: The number of digits in num is between one and six, inclusive.
     *  num >= 0
     */
    public static int getCheck(int num)
    {
        /* To be implemented in Part (a). */
    }

    /** Returns true if numWithCheckDigit is valid, or false otherwise, as described in Part (b).
     *  Precondition: The number of digits in numWithCheckDigit is between two and seven, inclusive.
     *  numWithCheckDigit >= 0
     */
    public static boolean isValid(int numWithCheckDigit)
    {
        /* To be implemented in Part (b). */
    }

    /** Returns the number of digits in num. */
    public static int getNumberOfDigits(int num)
    {
        /* Implementation not shown. */
    }

    /** Returns the nth digit of num.
     *  Precondition: n >= 1 and n <= the number of digits in num.
     */
    public static int getDigit(int num, int n)
    {
        /* Implementation not shown. */
    }

    // There may be instance variables, constructors, and methods not shown.
}
```

### Part (a): The `getCheck` method
Complete the `getCheck` method, which computes the check digit for a number, according to the following rules:

+ Multiply the first digit by 7, the second digit(if one exists) by 6, the third digit(if one exists) by 5, and so on. The length of the method's `int` parameter is at most six; therefore, the last digit of a six-digit number will be multiplied by 2.
+ Add together the products calculated in the previous step.
+ Extract the check digit, which is the rightmost digit of the sum that was calculated in the previous step.

The following are examples of the check-digit calculation:

### Example 1: `num` has the value `283415`
+ The sum to calculate is:

$$
\mbox{products} = (\texttt{2} \cdot 7) + (\texttt{8} \cdot 6) + (\texttt{3} \cdot 5) + (\texttt{4} \cdot 4) + (\texttt{1} \cdot 3) + (\texttt{5} \cdot 2)\\
\mbox{products} = 14 + 48 + 15 + 16 + 3 + 10\\
\mbox{products} = 106
$$

+ The check digit is the rightmost digit of 106, which is 6. Therefore, the `getCheck` method returns the integer value `6`.

### Example 2: `num` has the value `2183`
+ The sum to calculate is:

$$
\mbox{products} = (\texttt{2} \cdot 7) + (\texttt{1} \cdot 6) + (\texttt{8} \cdot 5) + (\texttt{3} \cdot 4)\\
\mbox{products} = 14 + 6 + 40 + 12\\
\mbox{products} = 72
$$

+ The check digit is the rightmost digit of 72, which is 2. Therefore, the `getCheck` method returns the integer value `2`.

### Helper Methods

Two helper methods, `getNumberOfDigits` and `getDigit`, have been provided for you.

+ `getNumberOfDigits` returns the number of digits in its `int` parameter.
+ `getDigit` returns the nth digit of its `int` parameter.

The following are examples of the use of `getNumberOfDigits` and `getDigit`.

Method Call | Return Value | Explanation
----------- | ------------ | -----------
`getNumberOfDigits(283415)` | `6` | The number `283415` has `6` digits.
`getDigit(283415, 1)`       | `2` | The first digit of `283415` is `2`.
`getDigit(283415, 5)`       | `1` | The fifth digit of `283415` is `1`.

### Specification
+ Write your `Java` program code response in the file `CheckDigit.java`.
+ Place your solution in the function called `getCheck(int num)` right below the place where it says: `Part (a): YOUR CODE HERE`
+ You must use the methods `getNumberOfDigits` and `getDigit` appropriately to receive full credit.

---

### Part (b): The `isValid` method
+ The `isValid` method returns `true` if its parameter `numWithCheckDigit`, which represents a number containing a check digit, is valid, and `false` otherwise.
+ The check digit is always the rightmost digit of `numWithCheckDigit`.
+ The following table shows some examples of the use of the `isValid` method.

Method Call | Return Value | Explanation
----------- | ------------ | -----------
`getCheck(159)` |     `2` | The check digit for `159` is `2`.
`isValid(1592)` |  `true` | The number `1592` is a valid combination of a number(`159`) and its check digit(`2`).
`isValid(1593)` | `false` | The number `1593` is not a valid combination of a number(`159`) and its check digit(`3`) because `2` is the check digit for `159`.

### Specification
+ Write your `Java` program code response in the file `CheckDigit.java`.
+ Place your solution in the function called `isValid(int numWithCheckDigit)` right below the place where it says: `Part (b): YOUR CODE HERE`
+ You must use the method `getCheck` appropriately to receive full credit.

### Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench. `JUnit` indicates a successful test with a **green** bar, and an unsuccessful test with a **red** bar.

### Submission
+ Upload the file `CheckDigit.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.

---

## Free-Response Question 2: `ReviewCollector`
+ A student plans to analyze product reviews found on a Web site by looking for keywords in posted reviews.
+ The `ProductReview` class, shown below, is used to represent a single review.
+ A product review consists of a product name, and a review of that product.

```java
public class ProductReview
{
    private String name;
    private String review;

    /** Constructs a ProductReview object and initializes the instance variables. */
    public ProductReview(String pName, String pReview)
    {
        name = pName;
        review = pReview;
    }

    /** Returns the name of the product. */
    public String getName()
    {
        return name;
    }

    /** Returns the review of the product. */
    public String getReview()
    {
        return review;
    }
}
```

The `ReviewCollector` class, shown below, is used to represent a collection of reviews to be analyzed.

```java
public class ReviewCollector
{
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;
    
    /** Constructs a ReviewCollector object and initializes the instance variables. */
    public ReviewCollector()
    {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }
    
    /** Adds a new review to the collection of reviews, as described in Part (a). */
    public void addReview(ProductReview prodReview)
    {
        /* To be implemented in Part (a). */
    }
    
    /** Returns the number of good reviews for a given product name, as described in Part (b). */
    public int getNumGoodReviews(String prodName)
    {
        /* To be implemented in Part (b). */
    }
    
    // There may be instance variables, constructors, and methods not shown.
}
```

### Part (a): The `addReview` method
The `addReview` method adds a single product review, represented by a `ProductReview` object, to the `ReviewCollector` object. The `addReview` method does the following when it adds a product review:

+ The `ProductReview` object is added to the end of the `reviewList` instance variable.
+ The product name from the `ProductReview` object is added to the end of the `productList` instance variable, if the product name is not already found in `productList`.

### Specification
+ Write your `Java` program code response in the file `ReviewCollector.java`.
+ Place your solution in the function called `addReview(ProductReview prodReview)` right below the place where it says: `Part (a): YOUR CODE HERE`

---

### Part (b): The `getNumGoodReviews` method
+ The `getNumGoodReviews` method returns the number of good reviews for a given product name.
+ A review is considered **good** if it contains the string `"best"`(with all lowercase letters).
+ If there are no reviews with a matching product name, then the method returns `0`.
+ Note that a review that contains the string `"BEST"` or `"Best"` would **not be considered** a good review, since some of the letters are uppercase.
+ However, a review that contains the string `"asbestos"` would be considered a good review, since it does happen to contain the string `"best"` within it.

### Specification
+ Write your `Java` program code response in the file `ReviewCollector.java`.
+ Place your solution in the function called `getNumGoodReviews(String prodName)` right below the place where it says: `Part (b): YOUR CODE HERE`

### Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench. `JUnit` indicates a successful test with a **green** bar, and an unsuccessful test with a **red** bar.

### Submission
+ Upload the file `ReviewCollector.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.

## End of Mock Exam.

