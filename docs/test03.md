# Test 3: Inheritance

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Monday, March 30, 2020
+ **Total Points:** 20
+ Implement `Java` programs for `RaceHorse.java` and `TODO.java`

---

## Part 1: `RaceHorse.java`[10 points]

## Background Theory
+ A `Horse` class is defined with the following instance variables, constructors, and methods:

```java
public class Horse
{
    // instance variables
    private String owner;
    private int age;
    private double value;
    
    // constructors
    public Horse()
    {
        owner = "";
        age = 0;
        value = 0;
    }
    
    public Horse(String own, int a, double v)
    {
        owner = own;
        age = a;
        value = v;
    }
    
    // accessor methods
    public String toString()
    {
        String result = "";
        result += "Owner = " + owner + "\n";
        result += "Age   = " + age   + "\n";
        result += "Value = $" + value;
        return result;
    }
}
```

## Requirements
+ Define a `RaceHorse` class that inherits from the `Horse` class, but has an additional private instance variable that indicates the number of races that the horse has won. The relationship between `RaceHorse` and `Horse` can be illustrated by  the following UML diagram:

![Horse UML Diagram](/csa/img/horseUML.png)

+ Use the following guidelines to implement the `RaceHorse` class.
1. Create a private instance variable of type `int` named `numRacesWon`.
2. Create a default constructor which initializes the instance variables to 0.
3. Create a constructor which takes 4 parameters to initialize the instance variables `owner`, `age`, `value`, and `numRacesWon`.
4. Implement the accessor method `getRacesWon` which has the return type `int`.
5. Implement the mutator method `wonRace` which has the return type `void`. Think about what it means when a horse wins a race. What do you think would happen? Is there any instance variable in particular that would have to change?
6. Override the `toString` method so that the instance variable `numRacesWon` is appended to it.

---

## Part 2: `TODO.java`[10 points]

## Background Theory




## Requirements




---

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for RaceHorse and TODO | KB | [test03.zip](/csa/zip/test03.zip)

**Contents of `test03.zip`:**
```bash

```

## Specification
+ Write a `Java` program in the file `RaceHorse.java` that describes a specific kind of Horse known as a RaceHorse.
+ Write a `Java` program in the file `TODO.java`
+ You will write your solution right below the place where it says: `YOUR CODE HERE`
+ Note that you will not be provided with any test benches.

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench. `JUnit` indicates a successful test with a **green** bar, and an unsuccessful test with a **red** bar.

## Submission
+ Upload the file `RaceHorse.java` and `TODO.java`to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.


