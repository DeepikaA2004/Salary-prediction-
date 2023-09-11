public class SalaryCalculator {
    public static void main(String[] args) {
        // Constants
        double basicSalary = 20000;
        double dearnessAllowancePercentage = 0.15;
        double houseRentAllowancePercentage = 0.20;
        double yearlyBonus = 24000;
        double providentFundPercentage = 0.10;
        double esiPercentage = 0.20;
        double incomeTaxPercentage = 0.25;
        double netSlabRateX = 30000; // Example value for category X

        // Calculate Dearness Allowance (DA)
        double dearnessAllowance = basicSalary * dearnessAllowancePercentage;

        // Calculate House Rent Allowance (HRA)
        double houseRentAllowance = basicSalary * houseRentAllowancePercentage;

        // Calculate gross salary
        double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance + yearlyBonus;

        // Calculate Provident Fund (PF)
        double providentFund = grossSalary * providentFundPercentage;

        // Calculate Employee State Insurance (ESI)
        double employeeStateInsurance = grossSalary * esiPercentage;

        // Calculate Income Tax Deductions
        double incomeTaxDeductions = grossSalary * incomeTaxPercentage;

        // Calculate net salary
        double netSalary = grossSalary - providentFund - employeeStateInsurance - incomeTaxDeductions;

        // Determine the category based on net salary
        String category = (netSalary > netSlabRateX) ? "X" : "Y";

        // Print the results
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Dearness Allowance: " + dearnessAllowance);
        System.out.println("House Rent Allowance: " + houseRentAllowance);
        System.out.println("Yearly Bonus: " + yearlyBonus);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Provident Fund: " + providentFund);
        System.out.println("Employee State Insurance: " + employeeStateInsurance);
        System.out.println("Income Tax Deductions: " + incomeTaxDeductions);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Category: " + category);
    }
}
