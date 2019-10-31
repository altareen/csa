# Lab 5: Smooth Signal

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Friday, November 1, 2019
+ **Total Points:** 10
+ Implement a `Java` program that smoothes an audio signal by averaging an array of integers.

## Background Theory
+ An audio signal is sometimes stored as an array of integer values. The values represent the intensity of the signal at successive time intervals. Of course, in a program, the signal is represented with an array.
+ Often, a small amount of noise is included in the signal. Noise is usually small, momentary changes in the signal level. An example is the **static** that is heard in addition to the signal in AM radio.
+ Smoothing a signal removes some of the noise, and improves the perceptual quality of the signal. This assignment requires you to smooth the values in an array of integers.

## Hints
+ First, you should create a result array called `smooth`, which has exactly the same size as the `audio` array.
+ The first element of the `smooth` array is a special case, because it should be calculated from the average of the **first** two elements of the `audio` array.
+ The last element of the `smooth` array is also a special case, because it should be calculated from the average of the **last** two elments of the `audio` array.
+ The internal elements of the `smooth` array can be calculated from a `for` loop in the following manner. First, you will need to determine the boundaries of this loop. You should probably begin at index `1`, and go up to index `audio.length-1`.
+ Then, you will need to calculate the average of three elements in the `audio` array, for every index `i`. In other words, you will need to calculate the average of the three values: `audio[i-1], audio[i], and audio[i+1]`.

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for Smooth Signal | 6.2KB | [lab05.zip](/csa/zip/lab05.zip)

**Contents of `lab05.zip`:**
```bash
Lab05SmoothSignal/
├── package.bluej
├── README.TXT
├── SmoothSignal.class
├── SmoothSignal.ctxt
├── SmoothSignal.java
├── SmoothSignalJUnitTest.class
├── SmoothSignalJUnitTest.ctxt
└── SmoothSignalJUnitTest.java
```

## Specification
+ Write a `Java` program in the file `SmoothSignal.java` that smoothes an audio signal by averaging an array of integers.
+ You will write your solution in a function called `levelling(int[] audio)` right below the place where it says: `YOUR CODE HERE`
+ When the function call `levelling([1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4])` is executed, the output of the program should be: `[3 3 4 5 6 7 6 6 5 4 4 4 ]`

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench. `JUnit` indicates a successful test with a **green** bar, and an unsuccessful test with a **red** bar.

## Submission
+ Upload the file `SmoothSignal.py` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.
