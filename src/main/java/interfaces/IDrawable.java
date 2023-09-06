package interfaces;

public interface IDrawable {
     void drawing();
     default void drawingRed(){

         System.out.println("drawingRed");
     }
}
