
public class Program {
    public static double calculateEdge(Object object1, Object object2) {
        int x = Math.abs(object1.getX() - object2.getX());
        int y = Math.abs(object1.getY() - object2.getY());
        double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return Double.valueOf(Util.DF_2.format(length));
    }

    public static boolean isPytago(double AB, double BC, double CA) {
        if ((Math.pow(AB, 2) + Math.pow(BC, 2) == Math.pow(CA, 2)) ||
                Math.pow(AB, 2) + Math.pow(CA, 2) == Math.pow(BC, 2) ||
                Math.pow(CA, 2) + Math.pow(BC, 2) == Math.pow(AB, 2)) {
            return true;
        }
        return false;
    }

    public static String checkTriangle(Object A, Object B, Object C) {
        double AB = calculateEdge(A, B);
        double BC = calculateEdge(B, C);
        double CA = calculateEdge(C, A);
        if (AB == BC && AB == CA) {
            return Util.EQUILATERAL_TRIANGLE;
        }
        if (AB == BC || AB == CA || BC == CA) {
            if (isPytago(AB, BC, CA)) {
                return Util.RIGHT_ISOSCELES_TRIANGLE;
            }
            return Util.ISOSCELES_TRIANGLE;
        }

        if (isPytago(AB, BC, CA)) {
            return Util.RIGHT_TRIANGLE;
        }

        return Util.TRIANGLE;
    }

    public static boolean isStraight(Object A, Object B, Object C) {
        if ((A.getX() == B.getX() && A.getX() == C.getX())
                || (A.getY() == B.getY() && A.getY() == C.getY())) {
            return true;
        }
        return false;
    }

    public static boolean isInvalid(Object A, Object B, Object C) {
        if (Math.abs(A.getX()) > Util.MAX_VALUE || Math.abs(B.getX()) > Util.MAX_VALUE || Math.abs(C.getX()) > Util.MAX_VALUE
                || Math.abs(A.getY()) > Util.MAX_VALUE || Math.abs(B.getY()) > Util.MAX_VALUE || Math.abs(C.getY()) > Util.MAX_VALUE) {
            return false;
        }
        if (A.getX() == B.getX() && A.getX() == C.getX()
                && A.getY() == B.getY() && A.getY() == C.getY()) {
            return false;
        }
        return true;
    }

    public static String myProgram(Object A, Object B, Object C) {
        if (!isInvalid(A, B, C)) {
            return Util.ERROR_INPUT;
        }

        if (isStraight(A, B, C)) {
            return Util.STRAIGHT;
        }

        String checkTriangle = checkTriangle(A, B, C);

        return checkTriangle;
    }

}
