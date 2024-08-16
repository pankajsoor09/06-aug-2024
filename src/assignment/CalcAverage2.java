package assignment;

public class CalcAverage2 {

    public static void main(String[] args) {
        double num = Double.parseDouble(args[0]);
        System.out.println("Entered num is : " + num);
        
        CalcAverage2 calc = new CalcAverage2();
        double average = calc.avgFirstN(num);
        
        if (num > 0) {
            System.out.println("Average of the first " + (int)num + " natural numbers is: " + average);
        }
    }

    public double avgFirstN(double num) {
        double sum = 0;

        if (num <= 0) {
            try {
                throw new IllegalArgumentException("Enter natural numbers only.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            // Calculate the sum of the first num natural numbers
            sum = num * (num + 1) / 2;
            System.out.println("Sum of the first " + (int)num + " natural numbers is: " + sum);
            
            // Calculate the average
            double average = sum / num;
            return average;
        }

        return 0; // Return 0 if num is not a valid natural number
    }
}

