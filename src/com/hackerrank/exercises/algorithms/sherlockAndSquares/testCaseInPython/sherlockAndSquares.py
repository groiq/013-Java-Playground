#!/usr/bin/env python3







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




for i in range(5):
    outfile.write("{},{} -> {}\n".format(begins[i],ends[i],solutions[i]))


outfile.close()
