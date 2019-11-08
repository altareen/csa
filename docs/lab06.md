# Lab 6: Caesar Cipher

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Friday, November 8, 2019
+ **Total Points:** 10
+ Implement a `Java` program that encrypts a message using the caesar cipher.

## Background Theory
+ The main idea behind the Caesar Cipher is to shift each letter in a secret message by a fixed number of positions. If this shifting behaviour goes further than the end of the alphabet, then it **wraps around** to the beginning, and continues from there.
+ The security of this crypto-system relies on having only the sender and the recipient know the secret **key**, which is the number of places by which the letters have been shifted.

![Encryption shift](/csp/img/encrypt.png "Encryption shift")

## Hints
+ Unencrypted text is generally called **plaintext**, and encrypted text is generally known as **ciphertext**. The quantity by which the letters have been shifted is called a **key**.
+ In general, the Caesar Cipher encrypts messages by **rotating** each letter by `key` positions. More formally, if `p` is the `alphabet` index of a plaintext letter, and `key` is the amount by which that letter is shifted, then the `alphabet` index of the corresponding letter in the ciphertext `c`, is computed by the following equation:

$$
c = (p + \mbox{key})\, \mbox{mod}\, 26
$$

+ You may assume that all of the characters in the plaintext messages are in **lowercase**.
+ There will be no punctuation present in any of the plaintext messages, with the exception of the space character. You should design your program so that any spaces in the plaintext message are transferred into the encrypted ciphertext.
+ Note that the complete lowercase `alphabet` has been provided for you:
```Java
String alphabet = "abcdefghijklmnopqrstuvwxyz";
```
+ This means that `"a"` corresponds to index `0`, `"b"` corresponds to index `1`, etc.

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for Caesar Cipher | 5.6KB | [lab06.zip](/csa/zip/lab06.zip)

**Contents of `lab06.zip`:**
```bash
Lab06CaesarCipher/
├── CaesarCipher.class
├── CaesarCipher.ctxt
├── CaesarCipher.java
├── CaesarCipherJUnitTest.class
├── CaesarCipherJUnitTest.ctxt
├── CaesarCipherJUnitTest.java
├── package.bluej
└── README.TXT
```

## Specification
+ Write a `Java` program in the file `CaesarCipher.java` that encrypts a message using the caesar cipher.
+ You will write your solution in a function called `encrypt(String message, int key)` right below the place where it says: `YOUR CODE HERE`
+ When the function call `encrypt("hello", 1)` is executed, the output of the program should be: `ifmmp`

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench. `JUnit` indicates a successful test with a **green** bar, and an unsuccessful test with a **red** bar.

## Submission
+ Upload the file `CaesarCipher.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.

