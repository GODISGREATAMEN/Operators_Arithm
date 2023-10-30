package operatorsPractice;

public class Main {
    public static void main(String[] args) {
        int productNum = 1;
        int daysQuantity = 5;
        int productQuantity = 45;
        double productPrice = 120.5;
        String productName = "Iphone 6";
        double totalPrice = productQuantity * productPrice;
        double pricePerDay = productQuantity * productPrice / daysQuantity;


        System.out.printf("Product No %d: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f."
                , productNum, productName,
                daysQuantity, totalPrice, pricePerDay);

        productNum = 2;
        daysQuantity = 7;
        productQuantity = 32;
        productPrice = 205.70;
        productName = "Iphone 13";
        totalPrice = productQuantity * productPrice;
        pricePerDay = productQuantity * productPrice / daysQuantity;

        System.out.printf("%n%nAProduct No %d: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f."
                , productNum, productName,
                daysQuantity, totalPrice, pricePerDay);


    }
}