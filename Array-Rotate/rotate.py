#!/bin/python3

import math
import os
import random
import re
import sys
#import numpy

# Complete the rotLeft function below.
def rotLeft(l, d):
    # temp=0
    # for j in range(0,d):
    #   i=0
    #   temp=a[0]  
    #   while i < len(a)-1:
    #     a[i]=a[i+1]
    #     i += 1
    #   a[i]=temp
    
    d = d % len(l)
    head = l[:d]
    l[:d] = []
    l.extend(head)
    return l
    
    return a
    #numpy.roll(a,d)
    #return a

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nd = input().split()

    n = int(nd[0])

    d = int(nd[1])

    a = list(map(int, input().rstrip().split()))

    result = rotLeft(a, d)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
