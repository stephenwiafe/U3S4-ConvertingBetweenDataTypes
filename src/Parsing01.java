public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        
        //Parse shirtPrice and taxRate, and print the total tax

        int price = Integer.parseInt(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        double totalTax = price * tax;
        System.out.println("Total Tax: " + totalTax);
        
        //Try to parse taxRate as an int
        try {
            int taxRateAsInt = Integer.parseInt(taxRate); // Attempt to parse taxRate as int
            System.out.println("TaxRate: " + taxRateAsInt);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Try to parse gibberish as an int
        try {
            int gibberishAsInt = Integer.parseInt(gibberish); // Attempt to parse gibberish as int
            System.out.println("Gibberish: " + gibberishAsInt);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
