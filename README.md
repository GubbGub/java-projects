# Quarters, Nickels, and Dimes

A simple Java/Maven project that finds every valid combination of quarters, dimes, and nickels that totals 50 cents.

## What it does

The program checks all possible values of:
- quarters
- dimes
- nickels

and prints each combination where:

`25 * quarters + 10 * dimes + 5 * nickels == 50`

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

From the project root:

```bash
mvn compile exec:java -Dexec.mainClass=QuartersNickelsDimes
```

## Project structure

```text
Java-Projects/
├── pom.xml
├── README.md
├── src/
│   └── main/
│       └── java/
│           └── QuartersNickelsDimes.java
└── target/
```

## Notes

This project is a good example of:
- Java loops
- conditional logic
- simple arithmetic checks
- Maven project setup

