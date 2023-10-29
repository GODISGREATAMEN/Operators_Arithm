public class Main {
    public static void main(String[] args) {
        int productNum = 1, daysQuantity = 5, productQuantity = 45;
        double productPrice = 120.5;
        String productName = "Iphone 6";

        System.out.printf("Product No %d: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f."
                , productNum, productName,
                daysQuantity, productQuantity * productPrice, productQuantity * productPrice / daysQuantity);

        productNum = 2;
        daysQuantity = 7;
        productQuantity = 32;
        productPrice = 205.70;
        productName = "Iphone 13";

        System.out.printf("%n%nAProduct No %d: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f."
                , productNum, productName,
                daysQuantity, productQuantity * productPrice, productQuantity * productPrice / daysQuantity);


    }
}