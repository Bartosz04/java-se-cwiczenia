package Exception;

import ExDziedziczenie.TriangleWithout;


public class ExceptionTest {

    public static void main(String[] aargs) throws InvalidSideExeption {

        try {
            TriangleWithout triangle = new TriangleWithout(10, 20);
            System.out.println(triangle.getE());
        }finally { System.out.println("udalo sie");
            /*catch(InvalidSideExeption ex) {
            System.out.println(ex.getMessage()
            );
        }*/
        }
    }

}
