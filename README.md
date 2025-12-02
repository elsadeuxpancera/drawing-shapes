Here is what you should record in your notes:

-   Record at least one time when your program\'s behavior differed from what you wanted it to do.
Drawings were not all on screen
    -   What are the differences between the actual and desired behavior?
Some of the drawing would be off screen, even though the strating coordinates were on screen. The length of the edges 
would make the drawing go off screen.
    -   What is your process for figuring out the problem with your code?
Running it multiple times with different coordinate points and looking at the shapes.
    -   What is the solution to this bug? That is, what do you need to fix about your code to make it have the desired behavior?
Testing out different starting coordinate points and shape edge lengths, also changing the turn direction
to find which wokr best to keep all of the drawings on screen.
-   Record at least one time when your program didn\'t compile.
I used turn() instead of right()
    -   What compilation errors did you get?
 Shapes.java:7: error: cannot find symbol
             t.turn(90);
              ^
      symbol:   method turn(int)
      location: variable t of type Turtle

    -   What is your process for figuring out the problem with your code? Describe the resources or strategies you used in this process.
I went through the Turtle website with all the turtke methods and realized it needed to be left/right and not
just turn.
    -   What is the solution to the bug? That is, what do you need to fix about your code to make it compile?
I had to change t.turn(); to t.right(); to give the turtle a direction to turn.
