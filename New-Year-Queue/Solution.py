#!/bin/python3

import math
import os
import random
import re
import sys
#Test Case: https://hr-testcases-us-east-1.s3.amazonaws.com/15305/input02.txt?AWSAccessKeyId=AKIAJ4WZFDFQTZRGO3QA&Expires=1545792486&Signature=Z73ZyeQiy2P%2FEfg3LLqX%2F2zB0pg%3D&response-content-type=text%2Fplain
# Complete the minimumBribes function below.
def minimumBribes(q):
    swaps = 0
    
    # check if the queue is too chaotic
    for i, v in enumerate(q):
        if (v - 1) - i > 2:
            print("Too chaotic")
            return 
    # bubble sorting to find the answer
    for i in range(0, len(q) - 1):
        for j in range(0, len(q) - 1):
            if q[j] > q[j+1]:
                 q[j],q[j+1]=q[j+1],q[j]
                 swaps += 1
                
        
        
    print(swaps)

if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        n = int(input())

        q = list(map(int, input().rstrip().split()))

        minimumBribes(q)
