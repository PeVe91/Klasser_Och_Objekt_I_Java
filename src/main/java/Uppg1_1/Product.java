package Uppg1_1;

public class Product {

        private String name;
        private double price;
        private int stockQuantity;

        public Product(String name, double price, int stockQuantity) {
            setName(name);
            setPrice(price);
            setStockQuantity(stockQuantity);
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            if (price > 0)
                this.price = price;
            else
                System.out.println("Priset kan inte vara 0");
        }

        public int getStockQuantity() {
            return stockQuantity;
        }
        public void setStockQuantity(int stockQuantity) {
            if (stockQuantity >= 0)
                this.stockQuantity = stockQuantity;
            else
                System.out.println("Lagervärdet kan inte vara negativt");
        }

        public double totalValue() {
            return price * stockQuantity;
        }

}
