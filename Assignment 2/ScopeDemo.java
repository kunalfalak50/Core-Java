public class ScopeDemo {

    public static void main(String[] args) {

        //  Method Scope variable
        int methodVar = 10;
        System.out.println("Method variable: " + methodVar);

        // Loop Scope
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop variable i: " + i);
        }

        // System.out.println(i); 
        //  ERROR: 'i' cannot be resolved (loop scope ends here)

        // Block Scope
        {
            int blockVar = 20;
            System.out.println("Block variable: " + blockVar);
        }

        // System.out.println(blockVar); 
        // ERROR: blockVar not accessible outside block

        // Valid usage of method variable
        int result = methodVar + 5;
        System.out.println("Using methodVar outside block: " + result);
    }
}