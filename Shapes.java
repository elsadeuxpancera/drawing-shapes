public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
         Turtle t = new Turtle(-200, -130);
         for (int i = 0; i < 4; i++) {
            t.forward(90);
            t.right(90);
         }
         t.up();

        // Task 2: Draw a regular shape many times
         t.setPosition(-100, 100);
         t.down();
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
               t.forward(90);
               t.right(90);
            }
            t.right(36);
         }
         t.up();

        // Task 3: How many times does Turtle turn!
         t.setPosition(100, -75);
         t.down();
         int numTurns = 0;
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
               t.forward(90);
               t.right(90);
               numTurns += 1;
            }
            t.right(36);
         }
         t.up();
         System.out.println(numTurns);


        // Extension 1:


        // Extension 2:

    }
}
