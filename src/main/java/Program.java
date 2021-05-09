
public class Program {
    public static double calculateEdge(Object object1, Object object2) {
        double x = Math.abs(object1.getX() - object2.getX());
        double y = Math.abs(object1.getY() - object2.getY());
        double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return length;
    }

    public static boolean isPytago(double AB, double BC, double CA) {
        if ((AB * AB + BC * BC - CA * CA < 0x1p-32) ||
                (AB * AB + CA * CA - BC * BC < 0x1p-32) ||
                (BC*BC + CA * CA - AB * AB < 0x1p-32)) {
            return true;
        }
        return false;
    }

    public static String checkTriangle(Object A, Object B, Object C) {
        double AB = calculateEdge(A, B);
        double BC = calculateEdge(B, C);
        double CA = calculateEdge(C, A);
//        System.out.println(AB + " " + BC + " " + CA);
        if (Math.abs(AB - BC) < 0.001 && Math.abs(AB - CA ) < 0.001) {
            return Util.EQUILATERAL_TRIANGLE;
        }
        if (AB == BC || AB == CA || BC == CA) {
            if (isPytago(AB, BC, CA)) {
                return Util.RIGHT_ISOSCELES_TRIANGLE;
            }
            return Util.ISOSCELES_TRIANGLE;
        }
        if (isPytago(AB, BC, CA)) {
            System.out.println("vao");
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

    public static boolean isConcide(Object A, Object B, Object C) {
        if ((A.getX() == B.getX() && A.getX() == C.getX())
                && (A.getY() == B.getY() && A.getY() == C.getY())) {
            return true;
        }
        return false;
    }

    /**
     * Kiem tra xem cac doi tuong nhap vao co dung chuan input khong
     *
     * @param A toa do diem A
     * @param B toa do diem B
     * @param C toa do diem C
     * @return boolean isInvalid
     */
    public static boolean isInvalid(Object A, Object B, Object C) {
        if (Math.abs(A.getX()) > Util.MAX_VALUE || Math.abs(B.getX()) > Util.MAX_VALUE || Math.abs(C.getX()) > Util.MAX_VALUE
                || Math.abs(A.getY()) > Util.MAX_VALUE || Math.abs(B.getY()) > Util.MAX_VALUE || Math.abs(C.getY()) > Util.MAX_VALUE) {
            return true;
        }
        return true;
    }

    public static String getCenterObject(double x, double y, double z) {
        if ((x < y && x > z) || (x > y && x < z)) {
            return "A";
        }
        if ((y < x && y > z) || (y > x && y < z)) {
            return "B";
        }
        return "C";
    }

    public static boolean isTwoOfThreeObjectConcided(Object A, Object B, Object C) {
        return (A.getX() == B.getX() && A.getY() == B.getY()) || (A.getX() == C.getX() && A.getY() == C.getY()) ||
                (B.getX() == C.getX() && B.getY() == C.getY());
    }

    public static String getCenterOfThreeObject(Object A, Object B, Object C ) {
        String str = "";
        if (A.getX() == B.getX()) {
            String result = getCenterObject(A.getY(), B.getY(), C.getY());
            if (result == "A") {
                str = Util.getStringCenter(A, B, C);
            } else if (result == "B") {
                str = Util.getStringCenter(B, A, C);
            } else {
                str = Util.getStringCenter(C, A, B);
            }
        } else if (A.getY() == B.getY()) {
            String result = getCenterObject(A.getX(), B.getX(), C.getX());
            if (result == "A") {
                str = Util.getStringCenter(A, B, C);
            } else if (result == "B") {
                str = Util.getStringCenter(B, A, C);
            } else {
                str = Util.getStringCenter(C, A, B);
            }
        }
        return str;
    }

    public static String myProgram(Object A, Object B, Object C) {
        if (!isInvalid(A, B, C)) {
            return Util.ERROR_INPUT;
        }

        if (isConcide(A, B, C)) {
            return Util.CONCIDE;
        }

        if (isTwoOfThreeObjectConcided(A, B, C)) {
            return Util.STRAIGHT;
        }

        if (isStraight(A, B, C)) {
            String getStringcenter = getCenterObject(A, B, C);
            return getStringcenter;
        }

        String checkTriangle = checkTriangle(A, B, C);
        return checkTriangle;
    }

}
