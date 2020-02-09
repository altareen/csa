# Problem Set 15: Bar Code

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Monday, March 23, 2020
+ **Total Points:** 10
+ Implement a `Java` program that determines whether a particular bar code pattern is valid.

## Background Theory
+ The Universal Product Code(UPC-A) is a bar code system that was first used in an Ohio grocery store back in 1974, to automate the checkout process. The UPC-A system has since been much more widely adopted, and it is now seen on virtually every product in existence.
+ For example, the UPC code shown below is for a box of tissues made by a US company called Kleenex. Every UPC code contains 12 digits in total, and this code would be read as: `036000291452`
![Kleenex UPC](/csa/img/kleenex.png)
+ In recent years, a new system has emerged called the European Article Number(EAN-13), which is backwards compatible with UPC-A. However, in this problem set, we will deal exclusively with the UPC-A system.
+ Consider the following detailed diagram of a UPC-A code. It corresponds to a 2 Liter bottle of Pepsi.
![Pepsi UPC](/csa/img/pepsidetail.png)
+ Each of the vertical bars in the UPC-A code represents a binary digit, where a black vertical bar represents a `1`, and a white vertical bar represents a `0`.
+ You may have noticed that the middle and ends of a UPC-A code have several bars which are longer than the others. These longer bars serve to separate the UPC-A code into two distinct sections. The **Left Hand Guard Bars** and the **Right Hand Guard Bars** each consist of the bit pattern `101`. The **Tall Center Bars** have the pattern `01010`.
+ The UPC-A code is separated into two distinct sections: The part to the left of the **Tall Center Bars**, and the part to the right of them. Each section has its own unique encoding scheme for describing the decimal number data which is contained within it. The reason for this is to allow bar codes to be read upside down, as well as right side up.
+ The following is a description of each section's encoding scheme, where each decimal number appears on top, and its corresponding bar pattern follows below it. Note that consecutive black bars have no dividing markers, so they just appear to be thicker. Also note that the white bars encode data(binary digit `0`) just like the black bars(binary digit `1`).

### Left Section
+ The data in this section appears between the **Right Hand Guard Bars** and the **Tall Center Bars**. It contains the **Number System Character** and the **Manufacturer ID Number**. The encoding scheme for this section is as follows:
![Left section](/csa/img/left.png)

### Right Section
+ The data in this section appears between the **Tall Center Bars** and the **Left Hand Guard Bars**. It contains the **Item Number** and the **Modulo Check Character**. The encoding scheme for this section is as follows:
![Right section](/csa/img/right.png)

### Lookup Table
+ We can represent these two encoding schemes with a lookup table:
![Lookup table](/csa/img/encoding.png)
+ These encoding schemes will be used to represent an entire UPC-A bar code, where a `0` represents a white bar, and a `1` represents a black bar. In other words, the previously indicated Pepsi bar code, corresponding to the decimal number `012000002304`, can be represented by the following binary string of digits:
```bash
10100011010011001001001100011010001101000110101010111001011100101101100100001011100101011100101
```

## Example Case
+ One of your tasks is to convert this string of binary digits to its corresponding UPC-A number, in decimal form. You will have to contend with the **Guard Bars**, the **Tall Center Bars**, and the different encoding schemes.
+ Once you have the decimal form of the UPC-A number, you must verify that it is valid. Fortunately, UPC-A codes have a **checksum** built into them, which is a mathematical relationship between the digits, that enables us to perform a verification algorithm.
+ According to this algorithm, you can determine if a UPC-A number is valid by executing the following steps:
    1. Add together all of the numbers corresponding to an **even** index, starting with the number at index `0`. Take this result, and multiply it by `3`.
    2. Add together all of the numbers corresponding to an **odd** index, starting with the number at index `1`, but excluding the last digit(the **Modulo Check Character**) from this calculation.
    3. Add together these two results. From this sum, find the remainder when it is divided by 10.
    4. If the result is `0`, then your **Check Digit** is `0`. Otherwise, calculate the **Check Digit** by subtracting the result from `10`.
    5. Compare your **Check Digit** to the **Modulo Check Character**. If they are equal, then the UPC-A number is `VALID`.

### Applying the Algorithm
+ Consider an example of the UPC-A verification algorithm with the following number: `012000002304`. Note that the **Modulo Check Character** is 4.
+ For the sake of clarity, I have underlined every other digit, starting with the number's first digit:

$$
\underline{0}1\underline{2}0\underline{0}0\underline{0}0\underline{2}3\underline{0}4
$$

+ Then, add together each of the underlined digits(the ones corresponding to **even** indexes):

$$
0 + 2 + 0 + 0 + 2 + 0 = 4
$$

+ Next, multiply this sum by 3:

$$
4 * 3 = 12
$$

+ Add together each of the non-underlined digits(the ones corresponding to **odd** indexes), except for the final digit:

$$
1 + 0 + 0 + 0 + 3 = 4
$$

+ Then, add these two results together:

$$
12 + 4 = 16
$$

+ Determine the remainder when this result is divided by 10(**Hint:** use the modulus operator):

$$
16 \,\,\texttt{%}\,\, 10 = 6
$$

+ The result is not equal to 0, so subtract it from 10:

$$
10 - 6 = 4
$$

+ Notice that the resulting number 4 is exactly the same as the **Modulo Check Character**, so the UPC-A number is legitimate.

## Hints
+ Note that the UPC-A bar code pattern is being brought into the function as a String. This means that you will have to use the `substring()` method throughout your program, to extract the necessary bit patterns. Also, remember to use the `Integer.parseInt(String sample)` method to convert from a String to an integer.
+ The UPC-A bar code pattern includes the **End Guard Bars** and the **Tall Center Bars** with the numerical data. You must take these into account, when you are extracting the bit patterns corresponding to the numerical data. The following diagram outlines each of the sections that are contained in the bit code pattern:
![Bit code pattern](/csa/img/sections.png)
+ You are provided with two `String` arrays that describe both the left-hand encoding scheme, and the right-hand encoding scheme. Note that the index of each bit pattern corresponds to its equivalent decimal value. You will have to perform a lookup with the bit pattern on its respective array, to retrieve its index.

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for Bar Code | 5.8KB | [pset15.zip](/csa/zip/pset15.zip)

**Contents of `pset15.zip`:**
```bash
PSet15BarCode/
├── BarCode.class
├── BarCode.ctxt
├── BarCode.java
├── BarCodeJUnitTest.class
├── BarCodeJUnitTest.ctxt
├── BarCodeJUnitTest.java
├── package.bluej
└── README.TXT
```

## Specification
+ Write a `Java` program in the file `BarCode.java` that determines whether a UPC-A bar code pattern is legitimate or not.
+ You will write your solution in a function called `validate(String barPattern)`, right below the place where it says: `YOUR CODE HERE`.
+ If the UPC-A number is valid, then your `validate` function should return a String `VALID`. Otherwise, if the UPC-A number is not valid, then your `validate` function should return the String `INVALID`.
+ When the function call `validate("10100011010011001001001100011010001101000110101010111001011100101101100100001011100101011100101")` is executed, the output of the program should be: `VALID`

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench. `JUnit` indicates a successful test with a **green** bar, and an unsuccessful test with a **red** bar.

## Submission
+ Upload the file `BarCode.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.

