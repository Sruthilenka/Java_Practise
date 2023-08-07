package org.example.Keywords;

public class FInallyConcept {
    public static void main(String[] args){
              //test1();
                div();
        }
      /*   public static void test1(){
        try{
            System.out.println("Inside try block");
            throw new RuntimeException(); //deliberately throwing an exception
        }catch(Exception e){
            System.out.println("Inside catch block");
        }
        finally{
            System.out.println("Inside finally block");
        }

    }*/

    public static void div(){
            int i=10;
            try{
                System.out.println("inside try block");
                int k = i/0;
            }
            catch(ArithmeticException e){   // say instead of arithmetic exception we gave null pointer exception, then exception will not be catch. so o/p will be try block statement and then exception thrown and then finally block statement
                System.out.println("Inside catch block");
                System.out.println("");
            }
            finally{
                System.out.println("Inside finally block of div method");
            }
    }
    }


