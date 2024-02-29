public class ArrayObject2DMain {
    
    public static void main(String[] args) {
        
        ArrayObject2D[][] array2D = new ArrayObject2D[3][3];

        array2D[0][0] = new ArrayObject2D();

        array2D[0][0].message = "changed message";
        System.out.println(array2D[0][0].message);

        array2D[0][0] = new ArrayObject2D();
        array2D[0][0] = new ArrayObject2D();
        array2D[0][0] = new ArrayObject2D();

        System.out.println(array2D[0][0].message);

    }

}
