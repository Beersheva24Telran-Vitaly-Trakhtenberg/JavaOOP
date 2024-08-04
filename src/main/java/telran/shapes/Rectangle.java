package telran.shapes;

public class Rectangle implements Shape
{
    private int width;
    private int height;

    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public int perimiter()
    {
        return 2 * (this.width + this.height);
    }

    @Override
    public int square()
    {
        return this.width * this.height;
    }
}
