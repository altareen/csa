# Problem Set 11: Vigenere Cipher

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Monday, December 2, 2019
+ **Total Points:** 10
+ Implement a `Java` program that encrypts a message using the Vigenere Cipher.

## Background Theory
+ The Vigenere Cipher improves upon the Caesar Cipher by encrypting a message using a **sequence** of keys, also known as a **keyword**.
+ A **keyword** is an alphabetical string, where `a` represents `0`, `b` represents `1`, `c` represents `2`, and so on, all the way up to `z` which represents `25`.
+ In other words, if \(p\) is some plaintext, and \(k\) is a keyword, then each letter \(c_i\) in the ciphertext \(c\) is computed as:

$$
c_i = (p_i + k_j)\, \mbox{mod}\, 26
$$

+ Note that the Vigenere Cipher uses \(k_j\) in constrast to the Caesar Cipher, which just uses \(k\). Also, if \(k\) is shorter than the plaintext message \(p\)(which is usually the case), then the letters in \(k\) must be reused cyclically as many times as it takes to encrypt \(p\).

## Example Case
+ Consider the case where the plaintext message is `hello`, and the keyword is `abc`. With this keyword, the `h` would be encrypted with a key of `0`, the `e` with a key of `1`, and the first `l` with a key of `2`.
+ At this point, we have exhausted all of the letters in the keyword, so we must resuse part of it to encrypt the rest of the plaintext message. The second `l` would be encrypted with a key of `0`, and the `o` would be encrypted with a key of `1`.
+ After the encryption is complete, the result would be the ciphertext `hfnlp`.

![Encryption shift](/csp/img/vigenere.png "Encryption shift")

## Hints
+ In order to solve this problem set, a clever strategy may be to figure out how many times you need to repeat the keyword so that it matches up with the message. One way to do this is to divide the length of the message by the length of the keyword. **Remember to multiply by 1.0 when performing this division**.
+ Once you have this comparison value, you want to determine the next largest integer value. An effective way of doing this is to use the mathematical **ceiling** function. For example, ceiling applied to `5.279` will produce a value of `6`. In Java, we must use the `Math` class to use the ceiling function:
```Java
int num = Math.ceil(x)
```

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for Vigenere Cipher | 6.1KB | [pset11.zip](/csa/zip/pset11.zip)

**Contents of `pset11.zip`:**
```bash
PSet11VigenereCipher/
├── package.bluej
├── README.TXT
├── VigenereCipher.class
├── VigenereCipher.ctxt
├── VigenereCipher.java
├── VigenereCipherJUnitTest.class
├── VigenereCipherJUnitTest.ctxt
└── VigenereCipherJUnitTest.java
```

## Specification
+ Write a `Java` program in the file `VigenereCipher.java` that encrypts a message using the Vigenere Cipher.
+ You will write your solution in a function called `encrypt(String message, String key)` right below the place where it says: `YOUR CODE HERE`
+ When the function call `encrypt("hello", "abc")` is executed, the output of the program should be: `hfnlp`

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench. `JUnit` indicates a successful test with a **green** bar, and an unsuccessful test with a **red** bar.

## Submission
+ Upload the file `VigenereCipher.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.

