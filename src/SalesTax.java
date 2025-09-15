//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SalesTax
{
    public static void main(String[] args)
    {
    double purchasePrice = 50.00;
    double salesTax = 0.05;
    double purchaseTax = 0;
    double totalPrice = 0;
    purchaseTax = purchasePrice * salesTax;
    totalPrice = purchaseTax + purchasePrice;
    System.out.println("The sales tax on your purchase of " + purchasePrice + " is " + purchaseTax + " making your total " + totalPrice);
    }
}