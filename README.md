# Name + Colour Matcher (Java Console App)

## Description

This is a simple Java console application that allows users to input a list of names and a list of colours, and then randomly matches each name with a colour. The application adds variety by providing a fun compliment for each pairing. It also allows users to reshuffle and generate new matchings as many times as they want.

Great for educational purposes, fun team activities, or random pairing exercises.

---

## Features

- Input validation for both names and colours
- Dynamic compliments randomly added to each pairing
- Randomized colour assignment using the built-in `Collections.shuffle()`
- Option to reshuffle pairings as many times as desired
- Simple, clean command-line interface

---

## How to Use

### 1. Compile the Program

Make sure you have Java installed. Then open your terminal/command prompt, navigate to the directory containing the file, and run:

```
javac Colours.java
```
### 2. Run the Program
```
java Colours
```
### 3. Follow the Prompts
The program will ask for:

Number of names and colours (must be equal)

A list of names

A list of colours

Then it will shuffle the colours and display random pairings along with compliments.

You will be asked whether you want to reshuffle and try again.

#### Example Output

Enter the number of names and colours: 3

Enter the names:
Name 1: Alice
Name 2: Bob
Name 3: Charlie

Enter the colours:
Colour 1: Red
Colour 2: Blue
Colour 3: Green

Shuffling colours...

Name and Colour Pairs:

Alice → Blue — owns this vibe now.
Bob → Green — and this colour? A perfect match.
Charlie → Red — is totally rocking that colour.

Do you want to reshuffle and try again? (yes/no):

## Requirements
Java JDK 8 or higher

Terminal or command-line access

## Educational Value
This project is useful for:

Practicing list management and randomization in Java

Understanding user input and validation

Learning clean code structure with modular methods

Making beginner-friendly, fun CLI apps

## Notes
The number of names and colours must be the same.

Compliments are randomly chosen from a predefined list.

No data is saved or stored; this is a runtime-only utility.

## Author
Created by Sahar
Built for fun, learning, and a little creativity in Java.


