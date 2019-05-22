# Problem Set 2: Fahrenheit

!!! note "Due Date"
    Monday, September 16, 2019

## Background
+ **Total Points:** 10
+ In this problem set, you must write a `Java` program that performs a simple
temperature conversion.

## Distribution

Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for Problem Set 2 | 4.1KB | [pset02.zip](pset02.zip)

```bash
PSet02SourceCode/
├── Fahrenheit.class
├── Fahrenheit.ctxt
├── Fahrenheit.java
├── FahrenheitJUnitTest.class
├── FahrenheitJUnitTest.ctxt
├── FahrenheitJUnitTest.java
├── package.bluej
└── README.TXT
```

## Specification
+ Write a `Java` program in the file `Fahrenheit.java` that
converts a temperature from celsius to fahrenheit. The formula for this
conversion is as follows: Take the temperature in celsius, multiply it by 9,
divide the result by 5, and add 32. The equation can be expressed as:

$$
\mbox{fahrenheit} = \frac{\mbox{celsius} \times 9}{5} + 32
$$

+ You will write your solution
in a function called
`calculateFahrenheit(double celsius)`,
right below the place where it says: `YOUR CODE HERE`.

+ When the function call `calculateFahrenheit(100)` is executed, the
output of the program should be: `212.0`

## Hints
+ Recall that `Java` performs integer division. You may have to multiply one
of the constants in the equation by `1.0` to obtain the correct answer.

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench.
`JUnit` indicates a successful test with a **green** bar, and an unsuccessful
test with a **red** bar.

## Submission
+ Submit your `Java` program by uploading it to the
[Web-CAT automated grading platform.](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa)


