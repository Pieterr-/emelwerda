# Author: David Vonk
#
# 09-2013
# For Emelwerda College, Emmeloord
# Rock, Paper, Scissors

import random
import sys

def getLevel():
    print('Would you like the computer to play with random? (y, n)')
    x = input().lower()
    if x.startswith('n'):
        print('what level of AI would you like the computer to play? (1 or 2)')
        while True: 
            y = input().lower()
            if y == '1':
                return 'ai1'
            elif y == '2':
                return 'ai2'
    else:
        return 'r'
        
    
def roundAmount(number):    
    # Ask the player how many rounds he likes to play
    print('How many rounds would you like to play (1 to 10)? or type quit to quit.')
    
    DIGITS1TO10 = '1 2 3 4 5 6 7 8 9 10'.split()
    
    print('The amount of rounds I would like to play: ', end='')

    # Get input and check whether the input is an integer
    while True:
        number = input()
        if number in DIGITS1TO10:
            number = int(number)
            print('You want to play %s rounds' % (number))
            return number
        elif number.lower().startswith('q') or number == '0':
            quitGame(pScore, cScore)
        else:
            print('Please enter a integer or type quit to quit: ', end='')


def checkRounds(number):
    # Check the amount of rounds the player has passed
    # and make sure that the player likes to keep playing
    if number == 0:
        return playAgain(amount)
    else:
        return number


def playAgain(amount):
    # Ask the player whether he would like to play again
    print('Would you like to keep playing? (y or n)')
    while True:
        x = input().lower()
        if x.startswith('y'):
            return(roundAmount(amount))
        elif x.startswith('n'):
            quitGame(pScore, cScore)
        else:
            print('please enter yes or no:')
    

def quitGame(playerScore, computerScore):
    # Display the final score and exit
    print('Thank you for playing. The final score is: player: %s, computer: %s.' % (playerScore, computerScore))
    if playerScore > computerScore:
        print('You have won!!!')
    elif playerScore < computerScore:
        print('You have lost...')
    else:
        print('The game was a draw.')        
    sys.exit()
    

def getRoundWinner(winner):
    
    def getPlayerMove():
        # Get the players move
        move = ''
        while not move.startswith('r') and not move.startswith('p') and not move.startswith('s') and not move.startswith('q'):
            print('Please enter your move (rock, paper or scissors. type quit to quit)')
            move = input().lower()

        # Give the move a number for easier equation
        if move.startswith('r'):
            return 1
        elif move.startswith('p'):
            return 2
        elif move.startswith('s'):
            return 3
        elif move.startswith('q'):
            quitGame(pScore, cScore)


    # Define a round winner
    C = getComputerMove(level)
    P = int(getPlayerMove())
    
    if C > P:
        if P == C - 2:
            winner = 'player'
        else:
            winner = 'computer'
    elif P > C:
        if C == P - 2:
            winner = 'computer'
        else:
            winner = 'player'
    elif P == C:
        winner = 'draw'

    return (winner, P, C)


def getComputerMove(level):
    # Define the movementway of the computer: random, ai1 or ai2
    if level == 'r':
        return getComputerMove0()
    elif level == 'ai1':
        return getComputerMove1(commonMove)
    elif level == 'ai2':
        return getComputerMove2()


def getComputerMove0():
    return random.randint(1, 3)


def displayGame(playerScore, computerScore, playerChoice, computerChoice, winner):
    # Get moveString for player
    if playerChoice == 1:
        playerString = 'rock'
    elif playerChoice == 2:
        playerString = 'paper'
    else:
        playerString = 'scissors'
        
    # Get moveString for computer
    if computerChoice == 1:
        computerString = 'rock'
    elif computerChoice == 2:
        computerString = 'paper'
    else:
        computerString = 'scissors'

    # Display both moves
    print('You chose: ' + playerString)
    print('The computer chose: ' + computerString)
    print('The winner of this round is: ' + winner + '; ', end='')
    print('The new score is: ' + str(playerScore) + ',' + str(computerScore))

    
# Functions
#===============================================================================
# AI1

def getLibrary1(newPlayerMove, rock, paper, scissors):
    if newPlayerMove == 1:
        rock += 1
    elif newPlayerMove == 2:
        paper += 1
    elif newPlayerMove == 3:
        scissors += 1
    
    return (rock, paper, scissors)

def getCommonMove1(rock, paper, scissors):
    if rock > paper and rock > scissors: return 'rock'
    elif paper > rock and paper > scissors: return 'paper'
    elif scissors > paper and scissors > rock: return 'scissors'
    else:
        choice = random.randint(1,2)

        if rock == paper and rock == scissors and scissors == paper:
            return 'rock'
        elif rock == paper:
            if choice == 1: return 'rock'
            else: return 'paper'
        elif rock == scissors:
            if choice == 1: return 'rock'
            else: return 'scissors'
        elif scissors == paper:
            if choice == 1: return 'scissors'
            else: return 'paper'


def getComputerMove1(pMove):
    #get a computermove depending on the most occuring move
    # rock = 1, paper = 2, scissors = 3
    if pMove == 'rock':
        return 2
    elif pMove == 'paper':
        return 3
    else:
        return 1

# AI1
#===============================================================================
# AI2

def getLibrary2(newPlayerMove, newComputerMove, rr, rp, rs, pr, pp, ps, sr, sp, ss):
    if newPlayerMove == 1:
        rock += 1
    elif newPlayerMove == 2:
        paper += 1
    elif newPlayerMove == 3:
        scissors += 1

# AI2
#===============================================================================
# Main Code


amount = 0
pScore = 0
cScore = 0
globalWinner = ''
AImove = (0, 0, 0)
commonMove = ''

level = getLevel()
amount += roundAmount(amount)

while amount >= 0:
    amount = checkRounds(amount)
    amount -= 1
    globalWinner = getRoundWinner(globalWinner)
    
    if globalWinner[0] == 'player':
        pScore += 1
    elif globalWinner[0] == 'computer':
        cScore += 1
        
    # Get the movelibrary for the player
    AImove = getLibrary1(globalWinner[1], AImove[0], AImove[1], AImove[2])
    commonMove = getCommonMove1(AImove[0], AImove[1], AImove[2])

    P = globalWinner[1]
    C = globalWinner[2]
    displayGame(pScore, cScore, P, C, globalWinner[0])
    
    
# Author: David Vonk
#
# 09-2013
# For Emelwerda College, Emmeloord
# Rock, Paper, Scissors
