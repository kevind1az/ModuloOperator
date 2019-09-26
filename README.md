# ModuloOperator
Modulo Operator practice


Consider a family with several children and lots of dirty dishes. 
Write a Java program to list which child is assigned to do the dishes each day for a number of days taken from input. 
Assume that the children take turns doing dishes, starting with child # 0 and continuing until the last child has taken a turn, 
then starting again, so that the children will take turns doing the dishes for any number of days.

Use final ints called MINDAYS and MAXDAYS for the minimum and maximum number of days to consider. 
Set their values to 1 and 1000, or to any other values that seem reasonable. 
Your program should work correctly for any number of days that is between these two values.

Ask the user how many days to consider and take input using a Scanner. 
If the user enters a value less than MINDAYS or more than MAXDAYS, print an error message and quit.  
It is OK if the program crashes when the user enters input that cannot be parsed to an int.

Take user input for the number of children in the family and use this as the value of a variable.

You will need to use the modulo (%) operator in a statement inside a loop in order to find the assignments for each day. 
You should be able to do this with only one use of modulo.

If there are four children, the output will begin like this:
Day # 0: Child 0 must do the dishes
Day # 1: Child 1 must do the dishes
Day # 2: Child 2 must do the dishes
Day # 3: Child 3 must do the dishes
Day # 4: Child 0 must do the dishes
Day # 5: Child 1 must do the dishes

 
