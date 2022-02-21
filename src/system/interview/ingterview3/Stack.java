package system.interview.ingterview3;

public class Stack {

/*
    int array[] = new int[5];
    int top =0;
    private boolean push(int x){
        top++;
        array[top]=x;
        System.out.println("Element pushed in to the stack= "+x);
        return true;
    }


    private int pop(){
        int x= array[top--];
        System.out.println("Element popped from stack= "+x);
        return x;
    }


    private int peek(){

        return array[top];

    }

    public static void main(String[] args) {

        Stack stack =new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();


        System.out.println(  "Printing top most value= " +stack.peek());




*/
    int arr[] = new int[5];
    int top =0;


    private boolean push(int x){
        top++;

      arr[top] =x ;

        System.out.println("element pushed to stack : "+x);
        return true;
    }

     private int pop(){
    int  x=arr[top--];
         System.out.println("element pop from stack: "+x);
        return x;
     }
    private int  peek()
    {
       return arr[top];
    }

    public static void main(String[] args) {


        Stack stack =new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

          stack.pop();

          stack.peek();
        System.out.println("element peeked from stack: "+stack.peek());


    }

}
