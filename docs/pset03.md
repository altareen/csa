# Problem Set 3: Note Frequency

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Monday, September 23, 2019
+ **Total Points:** 10
+ Implement a `Java` program that calculates the frequency of a particular music
note, given its octave and pitch class.

## Background Theory
+ One of the oldest problems in music theory is how to map the notes of a musical
piece to a set of audio frequencies. Your task is to write a `Java` program that
performs a particular kind of mapping.
+ First, we must define a form of musical note notation. One common way of accomplishing
this is to use the *octave pitch* notation. This notation represents each note as
a number pair, where the first number indicates which *octave* the note belongs to, and
the second number indicates which semitone the *pitch* corresponds to.
+ There are 12 **semitone notes** within each octave on the keyboard, as in the
following diagram:

![Semitone notes](/csp/img/semitones.png "Semitone notes")

+ *octave pitch* representations are written in decimal format. For example, the
5th octave and 9th semitone(corresponding to note A) would be written as: 5.9
+ In order to map a sound frequency to this *octave pitch* representation, we must
begin by selecting a reference note. In the Western musical scale, we assign the
frequency 440Hz to the *octave pitch* reference note of 4.9. This corresponds to
the 4th octave, 9th semitone, which is note A.
+ Our mapping must ensure that the same note in the next higher octave has double
the frequency. In other words, 5.9 corresponds to 880Hz, and 3.9 corresponds to
220Hz. This mapping system assumes that each of the semitones within an octave is
equally spaced, and this is known as a **tempered scale.**
+ The formula we use to calculate the frequency from a given *octave pitch* note is as follows:
$$
\mbox{frequency} = \mbox{ref} \times 2^{\mbox{octa} + \frac{\mbox{semi}}{12/0}}
$$
+ In `Java`, this formula would be implemented as:
```java
frequency = ref * Math.pow(2, (octa + (semi/12.0)));
```
+ `double frequency`: The result of the calculation, in Hertz.
+ `int ref`: The frequency of the reference note, which is: `440` Hertz.
+ `int octa`: The *octave* note minus the reference note, which is: `octave - 4`
+ `int semi`: The *pitch* semitone minus the reference semitone, which is: `pitch - 9`

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for fahrenheit | 4.8KB | [pset03.zip](/csa/zip/pset03.zip)

**Contents of `pset03.zip`:**
```bash
PSet03NoteFrequency/
├── NoteFrequency.class
├── NoteFrequency.ctxt
├── NoteFrequency.java
├── NoteFrequencyJUnitTest.class
├── NoteFrequencyJUnitTest.ctxt
├── NoteFrequencyJUnitTest.java
├── package.bluej
└── README.TXT
```

## Specification
+ Write a `Java` program in the file `NoteFrequency.java` that calculates the
frequency of a particular musical note, given its *octave* and *pitch* class.
+ You will write your solution in a function called `temperedscale(octave, pitch)`
right below the place where it says: `YOUR CODE HERE`
+ When the function call `temperedscale(0, 0)` is executed, the
output of the program should be: `16.351597831287414`

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench.
`JUnit` indicates a successful test with a **green** bar, and an unsuccessful
test with a **red** bar.

## Submission
+ Upload the file `NoteFrequency.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.

