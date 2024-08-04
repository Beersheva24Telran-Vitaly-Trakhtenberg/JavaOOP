package telran.shapes;

import telran.utils.Arrays;

public class Canvas  implements Shape
{
    Shape[] shapes;

    private int perimeter = 0;
    private int square = 0;

    public Canvas()
    {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape)
    {
        this.shapes = Arrays.insert(shapes, shapes.length, shape);
        this.square += shape.square();
        this.perimeter += shape.perimiter();
    }

    public Shape[] getShapes()
    {
        return shapes;
    }

    @Override
    public int perimiter()
    {
        return this.perimeter;
    }

    @Override
    public int square()
    {
        return this.square;
    }
}
