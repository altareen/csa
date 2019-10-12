# Lab 3: Coin Change

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Saturday, October 12, 2019
+ **Total Points:** 10
+ Implement a `Java` program that calculates the minimum number of coins
required to give a user change.

## Background Theory
+ A **greedy algorithm** is one, "that always takes the best immediate, or local, solution while finding an answer."
+ Suppose a cashier owes a customer some change, and that cashier wishes to minimize the quantity of quarters, dimes, nickels and pennies that are dispensed to the customer.
+ A **greedy algorithm** is one that would take, on each pass, the biggest bite out of this problem as possible.
+ For example, if a customer is owed 41 cents, the biggest first(i.e., best immediate, or local) bite that can be taken is 25 cents. That bite is the "best," as it gets us closer to 0 cents faster than any other coin would.
+ Note that a bite of this size would reduce what was a 41 cent problem down to a 16 cent problem, since `41 - 25 = 16`.
+ Another 25 cent bite would be too big, so our cashier would move on to a bite of size 10 cent, resulting in a 6 cent problem.
+ At that point, the greedy algorithm calls for one 5 cent bite followed by one 1 cent bite, at which point the problem is solved.
+ The result of this greedy algorithm is that the customer receives one quarter, one dime, one nickel, and one penny: four coins in total.

## Hints
There are a few different ways in which this assignment can be solved. One of the ways is with a clever use of the integer division operator.

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for Coin Change | 4.4KB | [lab03.zip](/csa/zip/lab03.zip)

**Contents of `lab03.zip`:**
```bash
Lab03CoinChange/
├── CoinChange.class
├── CoinChange.ctxt
├── CoinChange.java
├── CoinChangeJUnitTest.class
├── CoinChangeJUnitTest.ctxt
├── CoinChangeJUnitTest.java
├── package.bluej
└── README.TXT
```

## Specification
+ Write a `Java` program in the file `CoinChange.java` that outputs the minimum number of coins that can be dispensed from a given quantity of cents.
+ Assume that the only coins available are quarters(25 cents), dimes(10 cents), nickels(5 cents), and pennies(1 cent).
+ You will write your solution in a function called `minimumCoins(int cents)`
right below the place where it says: `YOUR CODE HERE`
+ When the function call `minimumCoins(41)` is executed, the
output of the program should be: `4`

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench.
`JUnit` indicates a successful test with a **green** bar, and an unsuccessful
test with a **red** bar.

## Submission
+ Upload the file `CoinChange.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.
