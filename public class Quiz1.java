
public class Store 
{
    public static void main(String[] args) 
    {
        final int[] pricesFruits {15, 10, 5}; // Precio de las papas, bananas, kiwis
    
        final int[] quantitiesFruits {2, 3, 4}; // Cantidades de papas, bananas, kiwis
            
        // Aqui calculo elprecio por la cantidad de frutas.
        int totalSales = 0;
        for (int i = 0; i < pricesFruits.length; i++);
        {
            totalSales += pricesFruits[i] * quantitiesFruits [i];
        }
    
        // Aqui ps te celebra o te regaña por la cantidad de ventas.
        if (totalSales > 50) 
        {
            System.out.println("Good sales performance");
        } else 
        {
            System.out.println("Low sales performance");
        }
    }
}
