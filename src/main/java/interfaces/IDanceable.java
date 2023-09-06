package interfaces;

public interface IDanceable {
   final String STR = "I DANCE";

    void dancingTango();
    default void dancingSalsa(){
        System.out.println("dancingSalsa");
    }

}
