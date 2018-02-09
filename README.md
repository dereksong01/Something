# Something
Team Something -- Shruthi Venkata, Sean Roudnitsky, Derek Song
APCS2 pd08
L #00 -- But What Does the Data Say?
2018-02-08 

# Hypothesis
Given an nxn 2D array of ints, with the numbers ascending left to right by row and column, then our algorithm will find the position of any desired integer in O(n) runtime.

# Background
We need to design an algorithm that can find the position of an integer in O(n) runtime, given a 2D array of size n x n, where the integers increase from left to right by row, and increase from top to bottom by column.

Our Algorithm: 
Step 1) First, compare the target with the bottom left value.
Step 2) While the index < n, if the target is greater, move to the right. If it is smaller, move up. 
        If it finds the target, return the coordinates. 
        This repeated until we are out of bounds. 
Step 3) Return (-1, -1) if no coordinates were previously returned.
