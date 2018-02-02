# Something

Our Algorithm
1) First, compare the target with the bottom left value.
2) While the index < n, if the target is greater, move to the right. If it is smaller, move up.
   If it finds the target, return the coordinates.
   This repeated until we are out of bounds.
3) Return (-1, -1) if no coordinates were previously returned.
