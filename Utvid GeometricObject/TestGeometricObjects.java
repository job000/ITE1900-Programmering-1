public class TestGeometricObjects {
    public static void main(String[] args) {

    	System.out.println();
    	/**Compare Circle*/
        GeometricObject c1 = new Circle(4,"Yellow", true);
        GeometricObject c2 = new Circle(5.3,"Blue", true);
        GeometricObject biggestCircle = (Circle) GeometricObject.max(c1, c2);
        System.out.println("The biggest Circle is: " +biggestCircle.toString());


        System.out.println();
        /**Compare Rectangle*/
        GeometricObject r1 = new Rectangle(2,3);
        GeometricObject r2 = new Rectangle(4,6);
        GeometricObject biggestRect = (Rectangle) GeometricObject.max(r1,r2);
        System.out.println("The biggest Rectangle is : "+biggestRect.toString());

        try{
        System.out.println();
        /**Compare Triangle*/
        GeometricObject t1 = new Triangle(2,1,1,"Blue",true);
        GeometricObject t2 = new Triangle(3,3,3,"Blue",true);
        GeometricObject biggestTriangle = (Triangle) GeometricObject.max(t1, t2);

        System.out.println("The biggest Triangle is: " +biggestTriangle.toString());

    	}catch(IllegalTriangleException ex){
    		System.out.println(ex);
    	}

        
    }
}
