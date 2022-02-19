/* Problem1 [40 pts]
 *
 * introduction:
 * 
 * Vectors are commonly used in mathematics and physics. A 3D vector is
 * represented as three components: x, y and z. It is signified by a
 * direction and a length(magnitude).
 *
 * Some operations on vectors include:
 *
 * 1. Magnitude: for a vector v, this is denoted as
 * |v| = Math.sqrt(x^2 + y^2 + z^2)
 * 
 * 2. Dot product: The dot product of two vectors v = (x1 , y1 , z1) and
 * w = (x2, y2, z2) is defined as a number v * w = x1 * x2 + y1 * y2 + z1 * z2
 * 
 * 3. Angle between two vectors: This is defined as cos(θ) = v * w / (|v| * |w|)
 * 
 * Technically given two vectors, there are two angles between them. This
 * returns the smaller of the two angles. For example, if the two vectors align
 * with the clock hands at 3pm, this would return 90 degrees (not 270 degrees).
 * 
 * 
 * Implementation:
 * 
 * Write a class Vector3D that represents a 3D vector. This class should contain
 * the following:
 * 1. A constructor that takes in x, y, z components of the vector.
 * 2. Methods to get the values of individual components (e.g. getX ,etc.).
 * 3. A toString method that returns a string that describes this vector. This
 * string should be of the form “(x,y,z)” replacing the letters with their values.
 * Each component should be formatted to round to exactly two decimal places.
 * 4. A method getMagnitude that returns its magnitude.
 * 5. A method dotProduct that returns the dot product of this vector and
 * another vector. It should not change the two vectors.
 * 6. A method angleBetween that returns the angle between two vectors in
 * degrees. It should not change the two vectors. It should throw an IllegalStateException
 * if this operation cannot be completed.
 * 
 * You may find some useful method in the Math class for this assignment.
 */
import java.lang.IllegalAccessException;

public class Problemone
{
    public static class Vector3D
    {
        private double x;
        private double y;
        private double z;
        
        public Vector3D(double x, double y, double z)
        {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        
        public String toString()
        {
            return "(" + x + "; " + y + "; " + z + ")";
        }
        
        public double getMagnitude()
        {
            return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
        }
        
        public double dotProduct(Vector3D obj)
        {
            return x * obj.x + y * obj.y + z * obj.z;
        }
        
        public double angleBetween(Vector3D obj) throws IllegalAccessException
        {
            if (getMagnitude() * obj.getMagnitude() == 0)
            {
                throw new IllegalAccessException("This angle cannot be computed, please enter the x, y, z value again");
            }

            return Math.acos((dotProduct(obj)) / (getMagnitude() * obj.getMagnitude()));
        }
        
    }
    
    public static void main(String[] args)
    {
        Vector3D a1 = new Vector3D(1, 2, 3);
        Vector3D a2 = new Vector3D(4, 5, 6);
        Vector3D a3 = new Vector3D(0, 0, 0);
        
        System.out.println(a1.dotProduct(a2));
        System.out.println(a2.dotProduct(a1));
        
        try
        {
            System.out.println(a1.angleBetween(a3));
        } catch (IllegalAccessException e)
        {
           System.out.println("Caught in main function, computing result");
        }
        
        System.out.println(a1.toString());
    
    }
}

 
