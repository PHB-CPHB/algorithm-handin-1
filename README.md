# Algorithm First Handin

School Handin in Algorithm consist of 3 assignments

First Assignment
**Assignment - Birthday problem.**
`Write a program that takes an integer N from the commandline and uses StdRandom.uniform() to generate a random sequence of integers between 0 and N – 1. Run experiments to validate the hypothesis that the number of integers generated before the first repeated value is found is ~√N/2.`

Second Assignment
**Assignment - Coupon collector problem.**
`Generating random integers as in the previous exercise, run experiments to validate the hypothesis that the number of integers generated before all possible values are generated is ~N HN.`

Thrid Assignment
**Assignment - Deck sort.**
`Explain how you would put a deck of cards in order by suit (in the order spades, hearts, clubs, diamonds) and by rank within each suit, with the restriction that the cards must be laid out face down in a row, and the only allowed operations are to check the values of two cards and to exchange two cards (keeping them face down).`

## Prerequisites

You need to have Java 1.8 installed
## How to use

### As a commandline tool
1. Clone the project
2. Go to the folder
3. Run `javac folder/*.java` - Example `javac algorithmsexerciseone/*.java`
  - There are 3 different types of commands
    - **Birthday takes 2 argumenst Times and days (How many time to run and the amount of days) it returns avg.**
    1. Run `java folder/main args[0] args[1] args[2]` - Example `java algorithmsexerciseone/main Birthday 10000 365`
    - **Cupon takes 2 argumenst Times and days (How many time to run and the amount of cupons) it returns avg.**
    1. Run `java folder/main args[0] args[1] args[2]` - Example `java algorithmsexerciseone/main Cupon 10000 365`
    - **Deck it does not take any arguments**
    1. Run `java folder/main args[0]` - Example `java algorithmsexerciseone/main Cupon`

### Usage in IDE
I have used Netbeans
1. Clone the project
2. Open IDE
3. Import project in IDE
4. Go to main
5. Outcomment Commandline Usage and incommet Netbeans Usage
