public class Line1 {
    
    int x1, y1, x2, y2;
    
    void printLength() {
        double length;
        length = Math.sqrt ( ____ ) ;
        System.out.println ("Line length is " + length);
    }
    
    void printAngle() {
        double angleInDegrees = Math.atan2 ( ____ , ____ ) * 180.0 / Math.PI;
        System.out.println ("Angle is " + angleInDegrees + " degrees");
    }

    public static void main(String[] args) {
        System.out.println ("testing Line1");
		/*
		 * Here you should set myLine to contain a reference to a new line
		 * object. Initialize myLine's x1 and y1 to the point (5, 10), and
		 * initialize myLine's x2 and y2 to the point (45, 40). Print the line's
		 * length, which should be 50. Print the line's angle, which should be
		 * around 36.87 degrees.
		 */
    }

}
