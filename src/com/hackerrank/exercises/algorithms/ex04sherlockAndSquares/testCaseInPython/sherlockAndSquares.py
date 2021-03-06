#!/usr/bin/env python3


def squares(a,b):

    def sqrt(number):
        
        if number == 1: return 1
        
        min = 1
        max = number
        guess = (max + min) // 2
        square = guess * guess
        
        while square != number:
            if (guess == min or guess == max):
                guess *= -1
                break
            if square > number:
                max = guess
            elif square < number:
                min = guess
            guess = (max + min) // 2
            square = guess * guess
        
        return guess

##    # test sqrt() function
##    for i in range(1,100):
##        print("{} -> {}".format(i,sqrt(i)))
##        
        
    sqrtA = sqrt(a)
    sqrtB = sqrt(b)

    if sqrtA < 0:
        sqrtA = (sqrtA * -1) + 1
    if sqrtB < 0:
        sqrtB = (sqrtB * -1)

    result = (sqrtB - sqrtA) + 1
    
    #print("{},{} -> {},{} -> {}".format(a,b,sqrtA,sqrtB,result))
    
    return result


####################################
    
outfile = open("./outfile.txt","w")

outfile.write("testing--")    

##########################

testIn = open("./input02.txt","r")
testOut = open("./output02.txt","r")

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
    #for item in line:
    #    outfile.write(item + ",")
    #outfile.write("\n")
    
    begins.append(int(line[0]))
    ends.append((int(line[1])))
    
    counter += 1
    # if counter > 5:
        # break
    
for line in testOut:
    #outfile.write(line)
    solutions.append(int(line))
    #outfile.write("\n")
 
testIn.close()
testOut.close()

### check everything has the same length
##print(len(begins))
##print(len(ends))
##print(len(solutions))

#testCaseNum = 20
testCaseNum = len(solutions)

for i in range(testCaseNum):
    currBegin = begins[i]
    currEnd = ends[i]
    currSol = solutions[i]
    currOwnSol = squares(currBegin,currEnd)
    #outfile.write("{},{} -> {}:{}\n".format(currBegin,currEnd,currSol,currOwnSol))
    if currSol != currOwnSol:
        outfile.write("WARNING: {} doesn't fit {}".format(currSol,currOwnSol))

###############################
# test the function

# for i in range(12):
    # j = sqrtRange(i)
    # outfile.write("{} -> {}\n".format(i,j))
##for upper in range(1,10):
##    for lower in range(upper):
##        #print("{}-{}".format(lower+1,upper))
##        k = squares(lower+1,upper)
##        #print(k)
##        #print("{},{} -> {}".format(lower+1,upper,k))
##        outfile.write("range from {} to {}: {} squares\n".format(lower+1,upper,k))

# for i in range(5):
    # outfile.write("{},{} -> {} -> {}\n".format(begins[i],ends[i],solutions[i],squares(begins[i],ends[i])))


outfile.close()
