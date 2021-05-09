import java.text.DecimalFormat;

public class Util {
    public static int MAX_VALUE = 10000;
    public static DecimalFormat DF_2 = new DecimalFormat("#.##");
    public static String ERROR_INPUT = "Du lieu sai";
    public static String CONCIDE = "A, B, C trung nhau";
    public static String STRAIGHT = "A, B, C tao thanh mot duong thang";
    public static String TRIANGLE = "A, B, C tao thanh mot tam giac";
    public static String EQUILATERAL_TRIANGLE = "A, B, C tao thanh mot tam giac deu";
    public static String ISOSCELES_TRIANGLE = "A, B, C tao thanh mot tam giac can";
    public static String RIGHT_TRIANGLE = "A, B, C tao thanh mot tam giac vuong";
    public static String RIGHT_ISOSCELES_TRIANGLE = "A, B, C tao thanh mot tam giac vuong can";

    public static String getStringCenter(Object A, Object B, Object C) {
        String result = A.getName() + " nam giua "  + B.getName() + " va " + C.getName();
        return result;
    }
}
