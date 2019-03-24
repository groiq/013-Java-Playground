#!/usr/bin/env python3


def squares(a,b):

    def sqrt(number):
        
        if number == 1: return 1
        
        min = 0
        max = number
        guess = (max + min) // 2
        square = guess * guess
        
        while square != number:
            if (guess == min | guess == max):
                guess *= -1
                break
            if square > number:
                max = guess
            elif square < number:
                min = guess
        
        return guess
        
    sqrtA = sqrt(a)
    sqrtB = sqrt(b)
    
    result = sqrtB - sqrtA
    
    return result


####################################
    
outfile = open("./outfile.txt","w")

    

##########################
##
##testIn = open("./input02.txt","r")
##testOut = open("./output02.txt","r")
##
### bigList = list()
##begins = list()
##ends = list()
##solutions = list()
##
##counter = 0
##
##for line in testIn:
##
##
##    line = line.strip()
##        
##    line = line.split(" ")
##    # outfile.write("{}\n".format(line))
##    # print(line)
##    # for item in line:
##        # outfile.write(item + ",")
##    # outfile.write("\n")
##    
##    begins.append(int(line[0]))
##    ends.append((int(line[1])))
##    
##    counter += 1
##    # if counter > 5:
##        # break
##    
##for line in testOut:
##    # outfile.write(line)
##    solutions.append(int(line))
##    # outfile.write("\n")
## 
##testIn.close()
##testOut.close()

###############################
# test the function

# for i in range(12):
    # j = sqrtRange(i)
    # outfile.write("{} -> {}\n".format(i,j))
for upper in range(1,5):
    for lower in range(upper):
        j = lower + 1
        k = upper - (j)
        #k = squares(lower+1,upper)
        #outfile.write("range from {} to {}: {} squares\n".format(lower,upper,k))

# for i in range(5):
    # outfile.write("{},{} -> {} -> {}\n".format(begins[i],ends[i],solutions[i],squares(begins[i],ends[i])))


outfile.close()
