Here is what you should record in your notes:

-   Record at least one time when your program\'s behavior differed from what you wanted it to do.

Drawings were not all on screen. Extra lines when moving the turtle.

    -   What are the differences between the actual and desired behavior?

Some of the drawing would be off screen, even though the strating coordinates were on screen. The length of the edges 
would make the drawing go off screen. When I was moving the turtle to another starting point, it drew a line from the 
end point of the previous shape to the start point of the new shape.

    -   What is your process for figuring out the problem with your code?

Running it multiple times with different coordinate points and looking at the shapes. For the extra line problem, I
went through the Turtle website to find if there was something that would make the turtle not draw, but still change
positions.

    -   What is the solution to this bug? That is, what do you need to fix about your code to make it have the desired behavior?

Testing out different starting coordinate points and shape edge lengths, also changing the turn direction
to find which work best to keep all of the drawings on screen. For the extra line problem, I used t.up(); and t.down();
to lift the turtle up and down so it wouldn't draw an extra line on the screen when chanigng positions to draw another
shape.


-   Record at least one time when your program didn\'t compile.

I used turn() instead of right().

    -   What compilation errors did you get?
    
 Shapes.java:7: error: cannot find symbol
             t.turn(90);
              ^
      symbol:   method turn(int)
      location: variable t of type Turtle

    -   What is your process for figuring out the problem with your code? Describe the resources or strategies you used in this process.

I went through the Turtle website with all the turtle methods and realized it needed to be left/right and not
just turn.

    -   What is the solution to the bug? That is, what do you need to fix about your code to make it compile?
    
I had to change t.turn(); to t.right(); to give the turtle a direction to turn.
