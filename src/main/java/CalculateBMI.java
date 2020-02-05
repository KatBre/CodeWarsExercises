public class CalculateBMI {

    public static String bmi(double weight, double height) {
        double bmi = (weight / (height * height));
        String result = "";
        if (bmi <= 18.5) {
            return result = "Underweight";
        } else if (bmi > 18.5 && bmi <= 25.0) {
            return result = "Normal";
        } else if (bmi > 25.0 && bmi <= 30.0){
            return result ="Overweight";
        } else if (bmi > 30.0) {
            return result = "Obese";
        }
        return result;
    }
}
