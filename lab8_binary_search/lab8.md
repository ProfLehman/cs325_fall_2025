## CS 325 Data Structures - Lab 8 – Guessing Game Binary Search - 25 Points
## Due Monday, November 3, 5:00 pm.

# Requirements
Create an AI bot that will play the “guess my number” game. The game works by having the bot first ask
for the largest number (ie. an upper limit). The user is then asked to pick a random number. The bot must
reply they it can guess the number in X guesses. The bot proceeds to make guesses with the user replying
“too high”, “too low”, or “yes, that is my number”. The bot must keep track of the number of guesses and
display the guess number each time it makes a guess. The bot must also determine if the user has entered an
incorrect response ie. if the user is not truthful (or just makes a mistake), the bot must stop making guesses.

Add your first and last name to code comments.

Save your code as `lab8.java`

Feel free to be creative and modify the script as long as you meet the following requirements
- Must use a binary search approach
- Must predict and display the maximum number of guesses (i.e. log2 n)
- Must display the current guess number
- Must stop if it determines that the user has entered an incorrect response

## Pseudocode
```
// *** sample pseudocode for lab 8 ***
get MAX

set low = 1
set high = MAX
set found = false
set guess count = 0

while not found

   guess = (low + high) / 2
   add 1 to guess count

   Ask if number this is your number?
   if yes, then set found = true and print guess count
   if no, then ask if your number is higher or lower
      if your number is higher, then set low to guess + 1
      if your number is lower, then set high to guess – 1

end loop

display found number in guess count guesses
```

## Sample Run
```
CS325 AI Bot Guessing Game …

Enter the largest number: 1000

Pick a number between 1 and 1000 but don’t tell me

I can guess your number in 10 guesses

Guess #1: Is you number 500? (y,n): n

 Is you number higher or lower than 500? (h,l): l

Guess #2: Is you number 250? (y,n): n

 Is you number higher or lower than 500? (h,l): h

Guess #3: Is you number 375? (y,n): n

 Is you number higher or lower than 500? (h,l): h

Guess #4: Is you number 437? (y,n): y

 I was able to guess your number in 4 guesses
 ```

## Post `lab8.java` on GitHub and submit link to code

-- end --
