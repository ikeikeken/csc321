#Kenny Huynh
#CSC-321
#Lab 9

#Create a Python program with the following requirements.

#Choose a number between 0 and 9. Ask a user to guess the number.
#If the user's guess is lower than the number or higher than the number, let them know by displaying that information after they guess.
#If the user guesses correctly display a win message. If the user's guess is incorrect, display a lose message.
#Create a for loop to print out a statement multiple times. The statement can be any string of text but try to use a saying or a joke.
#Create a while loop to print out a statement multiple times. The statement will be your favorite food.

randomnumber = 3
counter = 0
#print(randomnumber)

print("Please enter a number between 0 - 9: ")
userinput = int(input())
#print("You have entered:",userinput)

while (userinput > 9 or userinput < 0):
    userinput = int(input("You have entered an invalid number!\nPlease enter a valid number: "))

if (userinput > randomnumber):
    print("You have entered:",userinput,"That number is higher than my number:",randomnumber,"\nYou Lose!")
elif (userinput < randomnumber):
    print("You have entered:",userinput,"That number is lower than my number:",randomnumber,"\nYou Lose!")
elif (userinput == randomnumber):
    print("You have entered:",userinput,"\nCongratz!!! YOU WIN!!!")

for i in range(7):
    print("H3Ll0 w0rLd!")

while (counter := 6):
    print("Noodles")
    counter++
