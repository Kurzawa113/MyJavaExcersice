package system.interview.interview1;

public class TryAndCatchBlockExceptionHandling {


    private static void throwss()throws Exception{



    }

    public static void main(String[] args)throws Exception {

      int arr[] = new int []{1,2,3,4,5,6};

        try{
            System.out.println(arr[100]);
        }catch (Exception e){
            System.out.println("OutBoutException happening here");
        }finally {
            System.out.println("Finally will be excuted Regardless of any exception occurs or not ");


            String st = "hallo";
            System.out.println(st);
        }

        throwss();

    String st = "hallo1";
            System.out.println(st);



    }}

