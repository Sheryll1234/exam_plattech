import java.util.Scanner;

public class salaryExam{
    public static void main(String[] args) {  
        
        Scanner k = new Scanner(System.in);
        System.out.print("Your Annual Salary : ");
        float grossSalary = k.nextFloat();

        if(grossSalary < 250000){
            
        }
        else if(grossSalary >= 250000 && grossSalary < 400000){
            Double tax_deduction = 1 - 250000 * .20;

            //variables to compute values
            float Monthly_Rate = grossSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }
        else if(grossSalary >= 400000 && grossSalary < 800000){
            float tax_excess = grossSalary - 400000;
            Double tax_deduction = 0.25 * tax_excess + 30000;

            //variables to compute values
            float Monthly_Rate = grossSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }
        else if(grossSalary >= 800000 && grossSalary < 2000000){
            float tax_excess = grossSalary - 800000;
            Double tax_deduction = 0.25 * tax_excess + 130000;

            //variables to compute values
            float Monthly_Rate = grossSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }
        else if(grossSalary >= 2000000 && grossSalary < 8000000){
            float tax_excess = grossSalary - 2000000;
            Double tax_deduction = 0.25 * tax_excess + 490000;

            //variables to compute values
            float Monthly_Rate = grossSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }
        else if(grossSalary >= 8000000){
            float tax_excess = grossSalary - 8000000;
            Double tax_deduction = 0.25 * tax_excess + 2410000;

            //variables to compute values
            float Monthly_Rate = grossSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rat: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }


    } 
}
