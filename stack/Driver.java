public class Driver {
    public static void main(String[] args){

        //declare/initialize a Stack obj
        Stack<Game> stack = new Stack<Game>();//empty stack

        Game game1 = new Game("Mario", 50);
        Game game2 = new Game("Sonic", 60);
        Game game3 = new Game("MK", 70);
        Game game4 = new Game("Apex Legends", 0);
        Game game5 = new Game("Call of Duty: Golden package", 80);
        Game game6 = new Game("Star Wars", 55);
        //Game game7 = new Game("Among US", 5);
       
        print("size: " + stack.size());
        print("Empty stack?: " + stack.isEmpty());
        print("");

        //stack empty w/ size 0
        info(stack);
        //add game to stack
        stack.push(game1);
        info(stack);
        print("peek: " + stack.peek());
        print("stack empty?: " + stack.isEmpty());
        stack.pop();
        print("pop size: "+stack.size());
        print("empty pop: "+stack.isEmpty());
        //another
        stack.push(game2);
        info(stack);
        //another
        stack.push(game3);
        info(stack);
        //
        stack.push(game4);
        info(stack);
        //
        stack.push(game5);
        info(stack);
        //
        stack.push(game6);
        info(stack);
        //
        print("contains: "+stack.contains(game1));
        print("contains: "+stack.contains(game6));

        print("size: "+ stack.size());

        print("pop - "+stack.pop());
        print("");
        print("pop - "+stack.pop());
        print("");
        print("pop - "+stack.pop());
        print("");
        print("pop - "+stack.pop());
        print("");
        print("pop - "+stack.pop());
        print("");
        info(stack);

        print("size: "+ stack.size());

        print("pop - "+stack.pop());
        // COmplete Driver described L5 S16
    }
    public static void info(Stack stack){
        print("Item on top of the stack: " + stack.peek());
        print("       size of stack: " + stack.size());
    }

    public static void print(String s) {
        System.out.println(s);
    }
}
