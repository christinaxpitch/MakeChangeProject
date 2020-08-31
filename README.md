## Make Change Project
### Overview
  This week one project explores the different functions and methods we learned. The object of this program is to create a working cash register with user input and functioning computer output for the correct amount of change.

#### How to Run - Instructions
  1. The user is prompted to enter the price of an item (as a double. Ex: 10.00), and then is further prompted to enter the amount they are paying with.
  2. Depending on what the user inputs, the program has several different outputs:
  * If the user entered exact change, the program notifies the user and ends the program.
  * If the user does not enter enough cash, the program will notify them and then return the prompt for the user to insert money.
  * If the user enters cash and is in need of change, the cash register will calculate change and print out the results of the change for every bill and coin denomination and how much of each is returned.
  3. The program runs one time after reaching either exact change and printing the notification, or by printing the change returned to the user and saying goodbye.

#### The Method to the Madness
  For this program, I had multiple different ideas on how to construct my code. I'm not sure if I wrote the most concise, cleanest code- but I wrote the code with the theories I learned that made the most sense to me.

  1. Setting up Variables
  I created integer variables for the number of each type of bill/coin that was needed to be returned. The item price and cash inserted are both given by the user as a double value.
  2. A scanner is created to obtain user inputs. The first two user prompts are simple system out prints to the user, which also stores their inputs.
  3. A while loop is created for the scenario that the user does not enter enough money. This is so that it loops back to the prompt to ask the user to insert an amount of money, and will continue when either exact change is given or a value over the item price is given.
  4. If the user inserted exact change, the program notifies the user and ends the program. This is done by an if statement which is executed when the block of code itemPrice == cashInserted is true based on user input.
  5. The last if statement is put at the end of my code, and is for the last scenario that states the user needs change back. The if statement executes when the certain number of bills/coins > 0, which will be printed to the user.
  6. The last part was the part that had my brain trying to think of many different ways to create code to do the same thing. I decided to convert the change into pennies so that I was working with a common denominator throughout the math calculations, and decided to go with the floor method in java which returns the closest double value less than or equal to the value. This is to return the largest bill/coin less than or equal to what is changeExpected, before moving onto the next lower bill and repeating.
  Ex: If i was owed 1.5 twenty dollar bills, it would floor it to just 1 twenty dollar bill and go to the next bill. I created a few different variables and equations as I moved down using floor for each bill, starting with the highest and ending with the lowest.
  7. I used SystemOutPrint to print a few statements in my code while I was working on it, like to include the amount of change expected in pennies and then after I floored just to make sure I could see if the program was computing what I wanted it to. I commented out these lines in the actual program, because I do not want them printed and they were just to gauge my progress and understanding of the program.
  8. Lastly, I converted the change from all pennies back into the number of each corresponding coin/bill. I printed the number of each coin/bill expected, which would only print if the user was expecting that specific bill/coin. Therefore, I can avoid printing that the user gets "zero" of a certain bill or coin, and just prints the ones that they are going to receive.
  9. I formatted the cash register with a few simple methods at the bottom. This was just some added fun I used to practice creating different methods and then printing them in the program.

  ENJOY!
