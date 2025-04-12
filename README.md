# Java Programs

## Overview

This repository contains Java programs demonstrating various concepts such as monetary conversion, mortgage payment calculation, and other utilities.

- **MonetaryConversion.java**: A program that converts a given monetary amount into different denominations (dollars, quarters, dimes, nickels, and pennies).
- **MortgagePayment.java**: A program that calculates the monthly mortgage payment, total payment, total interest paid, and the interest percentage for a given mortgage, based on the annual interest rate, number of years, and mortgage amount.
- **BodyMassIndex.java**: This Java program calculates the Body Mass Index (BMI) by prompting the user to enter their weight in pounds and height in inches. It then converts the input values to metric units—kilograms for weight and meters for height—using standard conversion factors. After performing the conversion, it computes the BMI using the formula BMI = weight / (height * height) and displays the result rounded to two decimal places. Based on the calculated BMI, the program provides a corresponding health classification such as Underweight, Normal, Overweight, or Obese.
- **DivisibilityCheck.java**: This Java program checks if one positive integer is divisible by another after validating that both inputs are positive and the first is not smaller than the second. It then displays whether or not the first number is divisible by the second.
- **ShapeArea.java**: This Java program calculates the area of a circle, rectangle, or triangle based on the user's menu choice and input dimensions. It uses conditional logic to determine the shape and computes the corresponding area accordingly.
- **AverageGrade.java**: This Java program allows the user to enter multiple valid grades (0–100), calculates their average, and displays it. It uses a loop with input validation and continues prompting until the user chooses to stop.
- **Palindrome.java**: This Java program checks whether a user-entered string (of at least 3 characters) is a palindrome, ignoring case. It prompts repeatedly for valid input and uses a two-pointer approach to compare characters from both ends.
- **Triangles.java**: This Java program calculates the area of a triangle using Heron’s formula after validating if the given sides can form a triangle. It repeats based on user input and ends with a message when the user types anything other than "yes".
- **TwinPrimes.java**: This Java program finds and prints all twin prime pairs between 2 and 100 by checking each number and its neighbor plus two for primality using the isPrime method.
- **ArrayDemo.java**: This program generates an array of 20 random integers, calculates the smallest number, the average, and the count of numbers above the average, then displays the array in both normal and reverse order. It uses basic array operations and loops to perform the calculations and display results.
- **MultiDimensionalArrayDemo.java**: This program creates and manipulates a 6x6 two-dimensional array, generating random numbers and performing various operations such as displaying the array, calculating column sums, identifying the column with the largest sum, calculating the average of all elements, and finding the smallest element with its location. It uses nested loops to process the array and generate the required outputs.
- **FileManipulation.java**: This program reads a file named names.txt, removes all occurrences of a specified name, and updates the file. It also counts and displays the total number of words in the file before and after removing the occurrences of the name.
- **BinarySearch.java**: This program implements binary search for both integer and character arrays, returning the index of a found value or a negative index where it should be inserted. It demonstrates this search functionality using sample arrays of integers and characters.
- **BubbleSort.java**: This program demonstrates bubble sort on both double and character arrays. It sorts the arrays in ascending order and prints the original and sorted arrays for each type.
- **SelectionSort.java**: This program demonstrates the selection sort algorithm on both integer and character arrays. It sorts the arrays in ascending order and prints both the original and sorted arrays for each type.
- **Recursion.java**: This Java program demonstrates the use of recursion for various operations. It allows the user to reverse an integer or string by calling the reverseDisplay method, which uses recursion to break down the problem into smaller parts. 
- **StockSale.java**: This Java program calculates the net proceeds from a stock sale by taking input for the stock price, the number of shares, and the commission rate. The program then computes the total value of the shares, the commission fee (calculated as a percentage of the total value), and finally, the net proceeds after deducting the commission.
- **WindChillIndex.java**: This program calculates the wind-chill index using temperature in Celsius and wind speed in km/h. It checks if the input values are within valid ranges. The wind chill is calculated using a formula and displayed as an integer. The program terminates if the inputs are invalid.
- **DayOfWeek.java**: This program calculates the day of the week for a given date using Zeller's congruence. The user inputs a year, month, and day. The formula adjusts for months less than March, then calculates a day of the week code. The program outputs the corresponding day name based on the code.
- **MajorStatus.java**: This program takes two characters as input: the first character represents a major, and the second character represents a student's status. It validates the input, checking if the major is one of "M" for Mathematics, "C" for Computer Science, or "I" for Information Technology, and if the status is between '1' and '4'. It then prints the corresponding major and status based on the input.
- **SimpleCalculator.java**: This program implements a simple calculator that performs various mathematical operations based on user input. It prompts the user to enter two numbers and an operation (addition, subtraction, multiplication, division, remainder, or exponentiation). The program then performs the selected operation and displays the result, ensuring that division by zero and remainder operations with zero are properly handled. If the operation is invalid, the program exits with an error message.
- **StringManipulation.java**: This Java program provides various string manipulation functionalities based on user input. It allows users to perform operations such as counting the number of words, counting vowels, finding the longest word, identifying the word with the most vowels, entering a new sentence, or terminating the program. The program loops and prompts the user for selections until the user opts to terminate. It handles multiple string-related operations using helper methods.
- **ClassifyScores.java**: This Java program is designed to classify scores entered by the user into specific ranges and display the frequency of scores in each range. 
- **ClassList.java**: This Java program is designed to perform several operations related to student records stored in a text file, such as displaying student records, calculating averages, and copying records to another file.

Each program is designed to help with specific real-world calculations.

## Usage

### Prerequisites:
- Java 8 or higher is required to run these programs.

### Running the Programs:

1. Clone this repository to your local machine:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the folder containing the program file you wish to run.
3. Compile and run the programs using the following commands:
     ```
     javac <ProgramName>.java
     java <ProgramName>
     ```
