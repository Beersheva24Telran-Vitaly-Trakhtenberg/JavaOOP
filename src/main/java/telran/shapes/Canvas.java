package telran.shapes;

import telran.utils.Arrays;

public class Canvas  implements Shape
{
    Shape[] shapes;

    public Canvas()
    {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape)
    {
        this.shapes = Arrays.insert(shapes, shapes.length, shape);
    }

    public Shape[] getShapes()
    {
        return shapes;
    }

    @Override
    public int perimiter()
    {
        int perimeter = 0;
        int length = shapes.length;
        for (int i=0; i<length; i++) {
            perimeter += shapes[i].perimiter();
        }
        return perimeter;
    }

    @Override
    public int square()
    {
        int square = 0;
        int length = shapes.length;
        for (int i=0; i<length; i++) {
            square += shapes[i].square();
        }
        return square;
    }

    /**
     *
     * @return number of all shapes in a canvas object
     */
    public int count()
    {
        int count = 0;
        for (Shape sh : shapes) {
            if (sh instanceof Canvas) {
                count += ((Canvas) sh).count();
            }
            count++;
        }
        return count;
    }
}
