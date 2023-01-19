package LetCode;


import java.util.Stack;

public class test {
    public static void main(String[] args) {

     Stack<Integer>stack = new Stack<Integer>();
     stack_push(stack);

     stack_pop(stack);
        System.out.println(",.....");
     stack_push(stack);
        System.out.println(",.....");
     stack_peek(stack);
     stack_search(stack,2);
     stack_search(stack,5);

    }
    public static void stack_push(Stack<Integer> stack){
        for(int i=0;i<=5;i++){
            stack.push(i);
        }
    }
    public static void stack_pop(Stack<Integer>stack){
        for(int i=0;i<5;i++){
            Integer y= (Integer) stack.pop();
            System.out.println(y);
        }
    }
public static void stack_peek(Stack<Integer>stack){
        Integer element = (Integer) stack.peek();
    System.out.println("Element on stack top"+ element);
}
static void stack_search(Stack<Integer> stack, int element){
        Integer pos= (Integer) stack.search(element);
    if(pos== -1){
        System.out.println("element not found");
    }else {
        System.out.println("Element is found at position"+ pos);
    }
}

}
