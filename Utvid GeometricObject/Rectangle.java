// Rectangle.java: The Rectangle class that extends GeometricObject
public class Rectangle extends GeometricObject{
  private double width;
  private double height;

  /** Default constructor */
  public Rectangle() {
    this(1.0, 1.0);
  }

  /** Construct a rectangle with width and height */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle(double width, double height, String color, boolean filled){
  	super(color, filled);
  	this.width = width;
  	this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  /** Implement the getArea method in GeometricObject */
  public double getArea() {
    return width*height;
  }

  /** Implement the getPerimeter method in GeometricObject */
  public double getPerimeter() {
    return 2*(width + height);
  }

  @Override
  public String toString() {
    return "[Rectangle] width = " + width +
      " and height = " + height +  super.toString();
  }

  public boolean equals(Object obj) {
    return this.getArea() == ((Rectangle)obj).getArea();
  }
}
