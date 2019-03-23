#!/usr/bin/env python3


def squares(a,b):

    sqrtA = sqrtRange(a)
    sqrtB = sqrtRange(b)
    
    return 0

def sqrtRange(num):
    
    min = 0
    max = num
    currGuess = int(num / 2)
    currSquare = currGuess * currGuess
    
    while currSquare != num:
        outfile.write("currGuess: {}, currSquare: {}\n".format(currGuess,currSquare))
        if currSquare > num:
            outfile.write("guess to big\n")
            max = currGuess
        else:
            outfile.write("guess too small\n")
            min = currGuess
        currGuess = int((max+min)/2)
        currSquare = currGuess * currGuess
        if (max-min) <= 1:
        
            break

        if currGuess == num:
            return {currGuess,currGuess}
        else:
            return {min,max}
            
    

##########################

testIn = open("./input02.txt","r")
testOut = open("./output02.txt","r")

outfile = open("./outfile.txt","w")

# bigList = list()
begins = list()
ends = list()
solutions = list()

counter = 0

for line in testIn:


    line = line.strip()
        
    line = line.split(" ")
    # outfile.write("{}\n".format(line))
    # print(line)
    # for item in line:
        # outfile.write(item + ",")
    # outfile.write("\n")
    
    begins.append(int(line[0]))
    ends.append((int(line[1])))
    
    counter += 1
    # if counter > 5:
        # break
    
for line in testOut:
    # outfile.write(line)
    solutions.append(int(line))
    # outfile.write("\n")
 
testIn.close()
testOut.close()

for i in range(12):
    j = sqrtRange(i)
    outfile.write("{} -> {}\n".format(i,j))


# for i in range(5):
    # outfile.write("{},{} -> {} -> {}\n".format(begins[i],ends[i],solutions[i],squares(begins[i],ends[i])))


outfile.close()
