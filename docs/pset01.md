# Problem Set 1: HelloWorld

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Background
+ **Due Date:** Monday, September 9, 2019
+ **Total Points:** 10
+ This problem set introduces you to the **write-compile-run** software development
cycle, with a very simple code framework.

## Code Distribution

Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for HelloWorld | 3.9KB | [pset01.zip](/csa/zip/pset01.zip)

```bash
PSet01SourceCode/
├── HelloWorld.class
├── HelloWorld.ctxt
├── HelloWorld.java
├── HelloWorldJUnitTest.class
├── HelloWorldJUnitTest.ctxt
├── HelloWorldJUnitTest.java
├── package.bluej
└── README.TXT
```

## Specification

### Using the Assignment Operator
+ Write a `Java` program in the file `HelloWorld.java` that
uses the assignment operator to assign the message `hello world` to
the `String` variable `greetings`.

+ You will write your solution in a **method** called
`displayMessage()`, right below the place
where it says: `YOUR CODE HERE`. Make sure that
the phrase `hello world` is placed in the variable `greetings`.
Save your code by clicking on the **Project** menu and selecting
**Save**.

### Compiling your `Java` Program
+ Now, you must **compile** your `Java` program. Go to the
BlueJ project window and click on the **Compile** button. I have
indicated it with my cursor in the following screenshot.

![Compile step](/csa/img/pset01Step01.png)

+ If you have made an error in your code, then you must correct it
before your code will successfully compile. For example, in the screenshot
below, this is how BlueJ reacts when I leave off the terminating semicolon.

![Code error](/csa/img/pset01Step02.png)

### Executing your `Java` Program
+ Now, you must **run** your `Java` program. **Right-click**
on the `HelloWorld` module in the BlueJ project window, and a
small menu box will appear. Select the option listed as
`void main(String[] args)`. I have indicated it in the screenshot
below with my cursor.

![Select menu](/csa/img/pset01Step03.png)

+ Then, a **Method Call** dialog box should appear, like in the
following screenshot. Click on the **Ok** button.

![Method call](/csa/img/pset01Step04.png)

+ Next, a **Terminal Window** should appear. You should see the
text `hello world` being displayed in the **Terminal Window**.
This is exactly what we intended this program to do. If your result
is something other than this, then you need to correct your program
before the testing phase.

![Terminal window](/csa/img/pset01Step05.png)

## Testing
+ Now, we are going to verify that we have a correct `Java`
program by using the `JUnit` testing feature of BlueJ.

+ In order to run the `JUnit` test bench, simply click on the
**Run Tests** button. I have indicated it in the following
screenshot with my cursor.

![Run tests](/csa/img/pset01Step06.png)

+ Immediately after clicking on the **Run Tests** button, you should
see a **BlueJ: Test Results** window appear.
Since this in an example of a successful test, you should see a
green bar appear. Also, the specific function that was tested has a
green checkmark in front of it. Click on the **Close** button to exit.

![Test results](/csa/img/pset01Step07.png)

## Submission
+ Upload the file `HelloWorld.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.

