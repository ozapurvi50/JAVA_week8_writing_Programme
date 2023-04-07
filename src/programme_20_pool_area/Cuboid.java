package programme_20_pool_area;
/**
 * 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length
 * both of type double.
 * The class needs to have one constructor with parameters width and length both of type double and
 * it needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 * In case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * Method named getWidth without any parameters, it needs to return the value of the width field.
 * Method named getLength without any parameters, it needs to return the value of the length field.
 * Method named getArea without any parameters, it needs to return the calculated area (width * length).
 */
public class Cuboid extends Rectangle{
    double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return (getArea() * getHeight());
    }

}
