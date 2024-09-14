public class quiz2 
{
    public class TaxCalculation 
    {
        public static void main(String[] args) 
        {
            final double[] discounts = {0.15, 0.10}; // Los porcentajes de los descuentos
            final double[] productPrices = {100, 200}; // Precios de los productos papaya, sandia
            
            // Llorar y sufrir
            double discountPapaya = productPrices[0] * discounts[0];
            double finalDiscountPapaya = productPrices[0] - discountPapaya;
            
            double discountSandia = productPrices[1] * discounts[1];
            double finalDiscountSandia = productPrices[1] - discountSandia;

            double totalTax = finalDiscountPapaya + finalDiscountSandia;
    
            if (totalTax > 50) {
                System.out.println("High total tax: " + totalTax);
            } else {
                System.out.println("Low tax");
            }
        }
    }
}
