# Problem Set 13: Stock Broker

!!! note ""
    [Web-CAT:](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) Submit `Java` programs to this automated grading platform.

## Task Outline
+ **Due Date:** Monday, March 9, 2020
+ **Total Points:** 10
+ Implement a `Java` program that manages the value of an investor's stock portfolio.

## Background Theory
+ Stocks are a type of security that gives stockholders a share of ownership in a company. They are issued by companies in order to raise capital, so that they may grow their business, or undertake new projects.
+ Investors can buy and sell stocks on an open exchange called the stock market. It contains an indexed list of every company that has issued stock. It also provides the price of every company's stock at the current time, which is the stock's market value.
+ The price of a stock can fluctuate dramatically according to market forces, and the concept of supply and demand. If a company is perfoming well, then the price of its stock tends to rise. However, if a company is doing poorly, then its stock price can drop.
+ Investors can make money on the stock market by purchasing stock at a certain price, and then selling it later at a higher price, in which case they have earned a profit. However, if an investor sells a stock for a lower price than they have purchased it, then they shall incur a loss.

## The Problem Scope
+ In order to simplify matters, we will assume that the investor is only purchasing shares in a single company. Also, we will only deal with the purchasing of shares, not the selling of them.
+ Your `StockBroker` class should have the following properties:

### Instance variables:
+ `private ArrayList<Integer> shares;`
This data structure stores the **quantity of shares** that a investor has purchased, and each purchase is recorded as a separate event.
+ `private ArrayList<Double> cost;`
This data structure stores the **price per share** for each transaction that an investor has engaged in.
+ In general, these two `ArrayLists` form a transaction history for the investor, as they store the quantity of shares purchased and the price per share for every purchase event, which occurs at every index.

### Constructor:
+ `public StockBroker()`
This is a default constructor, as it has no parameters. It is responsible for initializing the two `ArrayLists`, `shares` and `cost`.

### Accessor method:
+ `public double getProfit(double currentPrice)`
This method indicates the amount of money that has been gained or lost on the investor's stock holdings. The method has one parameter, which is the current price per share of the stock, which is a `double`.
+ If the investor has earned money on his stock investments(market value is greater than total cost), then the result will be a positive value. However, if the investor has lost money on the stock(market value is smaller than total cost), then the result will be a negative value.
+ The profit is computed in the following manner:
    + Compute the current **market value** of all the shares of the stock(which is the total number of shares purchased so far, times the current price passed to the method).
    + Subtract the **total cost** of all the shares of the stock(the total amount of money that the person has paid for all the shares of stock purchased so far).

### Mutator method:
+ `public void purchase(int amount, double price)`
This method executes a purchase transaction, in which an investor buys some shares of stock at a given price.
+ The method has two parameters: `amount`, which is the **number of shares** as an `int`, and `price`, which is the **price per share** as a `double`.

## Code Distribution
Description | File Size | File Name
----------- | --------- | ---------
`Java` Source Code for Stock Broker | 7.5KB | [pset13.zip](/csa/zip/pset13.zip)

**Contents of `pset13.zip`:**
```bash
PSet13StockBroker/
├── package.bluej
├── README.TXT
├── StockBroker.class
├── StockBroker.ctxt
├── StockBroker.java
├── StockBrokerJUnitTest.class
├── StockBrokerJUnitTest.ctxt
├── StockBrokerJUnitTest.java
├── StockBrokerTest.class
├── StockBrokerTest.ctxt
└── StockBrokerTest.java

```

## Specification
+ Write a `Java` program in the file `StockBroker.java` that keeps track of an investor's purchases of stock in a particular company. The price of a stock changes frequently, so stocks bought at different times are usually purchased at different prices.
+ You will write your solution in a class called `public class StockBroker`, right below the place where it says: `YOUR CODE HERE`.
+ The program `StockBrokerTest` includes method calls to `purchase()` and `getProfit()`. It depicts an investor making a net profit of \$30.00. This is because the investor buys a total of 30 shares(20 + 10) for a total of \$90.00 cost(\$70.00 + \$20.00), but the new current share price is \$4.00, meaning that the shares are now worth \$120.00. The output of the program should be: `Profit earned = 30.0`

## Testing
+ Click on the **Run Tests** button to execute the `JUnit` test bench. `JUnit` indicates a successful test with a **green** bar, and an unsuccessful test with a **red** bar.

## Submission
+ Upload the file `StockBroker.java` to the [Web-CAT](http://ec2-54-65-207-33.ap-northeast-1.compute.amazonaws.com:8080/Web-CAT/WebObjects/Web-CAT.woa) automated grading platform.

