package lab12_oop_exceptions.restaurantTask;

public class NoSuchJobException extends RuntimeException {

    public NoSuchJobException(String exceptionMsg){
        super(exceptionMsg); //displays the specified message as an exception message
        //  System.out.println(exceptionMsg);
    }

    /*
    public static void main(String[] args) {

       // throw new RuntimeException("Something went wrong!");
      //  throw new NoSuchJobException("Invalid Job");

    }

     */

}
