# Coin Counter

A small Java/Maven project exploring coin math two ways — a loop-based combination finder and an object-oriented total calculator. Built for AP CSA coursework.

## What it does

**QuartersNickelsDimes.java** — checks every combination of quarters, dimes, and nickels using nested while loops, and prints each combination that adds up to 50 cents.

**CoinCounter.java** — an object-oriented version: a `CoinCounter` class holds counts of each coin type and calculates the total dollar value via a `calculateTotal()` method.

## Example output

```text
Combinations that make 50 cents:
0 quarters + 0 dimes + 10 nickels == 50 cents
0 quarters + 1 dimes + 8 nickels == 50 cents
0 quarters + 2 dimes + 6 nickels == 50 cents
0 quarters + 3 dimes + 4 nickels == 50 cents
0 quarters + 4 dimes + 2 nickels == 50 cents
0 quarters + 5 dimes + 0 nickels == 50 cents
1 quarters + 0 dimes + 5 nickels == 50 cents
1 quarters + 1 dimes + 3 nickels == 50 cents
1 quarters + 2 dimes + 1 nickels == 50 cents
2 quarters + 0 dimes + 0 nickels == 50 cents
```

## Requirements

- Java 17+
- Maven

## Run the project

From this folder:

```bash
mvn compile exec:java -Dexec.mainClass=QuartersNickelsDimes
mvn compile exec:java -Dexec.mainClass=CoinCounter
```

## Notes

Good example of:
- Java loops and conditional logic
- Basic class design (constructors, fields, methods)
- Maven project setup
