import java.util.*;

public abstract class GeometricObject implements Comparable<GeometricObject>{
	
	private String color;
	private boolean filled;
	private java.util.GregorianCalendar dateCreated;
	private java.util.Calendar calendar;

	/* Construct a default geometric object*/
	protected GeometricObject(){
		this("White", false);
	}


	/* Construct a geometric object with the specified color and filled value*/
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.GregorianCalendar();
		this.color = color;
		this.filled = filled;
	}

	public int compareTo(GeometricObject obj){
		if(this.getArea() > obj.getArea()){
			return 1;
		}else if(this.getArea() < obj.getArea()){
			return -1;
		}else{
			return 0;
		}
	}

	/* Return color*/
	public String getColor() {
		return color;
	}

	/* Set a new color*/
	public void setColor(String color) {
		this.color = color;
	}

	/* Return filled. Since filled is boolean, its getter method is named isFilled*/
	public boolean isFilled() {
		return filled;
	}

	/* Set a new value for filled*/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/* Get dateCreated*/
	public java.util.GregorianCalendar getDateCreated() {
		return dateCreated;
	}

	/* Return a string representation of this object*/
	public String toString() {
		return String.format("%nCreated on: %tF %1$tT %nColor: %s %nIs filled: %s", dateCreated, color, filled ? "Yes": "No");
	}

	public static GeometricObject max(GeometricObject obj1, GeometricObject obj2){
		int compare = obj1.compareTo(obj2);
		if(compare == 1){
			return obj1;
		}else if(compare == -1){
			return obj2;
		}else{
			return obj1;
		}

	}

	/**Abstract method getArea*/
	public abstract double getArea();

	/**Abstract method get Perimeter**/
	public abstract double getPerimeter();	

}





