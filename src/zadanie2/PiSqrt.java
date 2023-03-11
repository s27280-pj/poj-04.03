package zadanie2;

import java.text.DecimalFormat;

public class PiSqrt {
    public static void main(String[] args) {

        double result = Math.sqrt(Math.PI);

        DecimalFormat df1 = new DecimalFormat("#.##");
        String sqrtFormat = df1.format(result);

        System.out.println(sqrtFormat);
    }
}
