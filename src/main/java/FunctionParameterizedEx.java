public class FunctionParameterizedEx {
}

class TaxCalculator {
    public double calculateTax(double income) {
        double tax = 0;
        tax += lowerBracket(income) * 0.1;
        tax += middleBracket(income) * 0.2;
        tax += upperBracket(income) * 0.3;
        return tax;
    }

    private double lowerBracket(double income) {
        return Math.min(income, 30000);
    }

    private double middleBracket(double income) {
        return income > 30000 ? Math.min(income, 100000) - 30000 : 0;
    }

    private double upperBracket(double income) {
        return income > 100000 ? income - 100000 : 0;
    }
}



