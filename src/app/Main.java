package app;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "Alice", "smartphone", 305.99, "Moon Street, 10");
        Order order2 = new Order(2, "Tom", "laptop", 570.95, "Terra Street, 17");

        System.out.println(order1);
        System.out.println(order2);
    }

    static class Order {
        private final int orderNumber;
        private final String client;
        private final String product;
        private final double price;
        private final String address;

        public Order(int orderNumber, String client, String product, double price, String address) {
            this.orderNumber = orderNumber;
            this.client = client;
            this.product = product;
            this.price = price;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Order No " + orderNumber + " Client: " + client + ".\nProduct: " + product +
                    ",\nprice EUR " + price + ".\nAddress: " + address + ".";
        }
    }
}
