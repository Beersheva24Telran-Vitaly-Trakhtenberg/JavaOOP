package telran.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest
{
    @Test
    void canvasTest()
    {
        Canvas canvas = new Canvas();
        assertEquals(0, canvas.getShapes().length);

        Shape square1 = new Square(10);
        assertEquals(40, square1.perimiter());
        assertEquals(100, square1.square());
        Rectangle rect1 = new Rectangle(8, 12);
        assertEquals(40, rect1.perimiter());
        assertEquals(96, rect1.square());
        System.out.printf("Square1 - perimeter: %d, square: %d%n", square1.perimiter(), square1.square());
        System.out.printf("Rect1 - perimeter: %d, square: %d%n", rect1.perimiter(), rect1.square());

        canvas.addShape(square1);
        assertEquals(1, canvas.getShapes().length);
        System.out.printf("Canvas - number of shapes after adding square1: %d, perimeter: %d, square: %d%n", canvas.getShapes().length, canvas.perimiter(), canvas.square());
        canvas.addShape(rect1);
        assertEquals(2, canvas.getShapes().length);
        System.out.printf("Canvas - number of shapes after adding rect1: %d, perimeter: %d, square: %d%n", canvas.getShapes().length, canvas.perimiter(), canvas.square());
        assertEquals(80, canvas.perimiter());
        assertEquals(196, canvas.square());
    }

    @Test
    void canvasCountTest()
    {
        Canvas canvas = new Canvas();
        Canvas canv1 = new Canvas();
        Canvas canv11 = new Canvas();
        Shape square1 = new Square(10);
        Rectangle rect1 = new Rectangle(8, 12);
        canvas.addShape(square1);
        canvas.addShape(rect1);
        assertEquals(2, canvas.count());
        canvas.addShape(canv1);
        assertEquals(3, canvas.count());
        canv1.addShape(square1);
        assertEquals(4, canvas.count());
        canv1.addShape(canv11);
        canv11.addShape(square1);
        canv11.addShape(rect1);
        assertEquals(7, canvas.count());
    }
}
