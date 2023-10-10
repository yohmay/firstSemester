// Interface

package objectOrientation.constructorsOverloadingInheritance;

public class Interface {

    public interface Printable {
        final char nlin = '\n';

        public String toString();

        public void toSystemOut();
    }

    public class Product implements Printable {

        private String description;
        private int amount;

        public Product(String d, int q) {
            description = d;
            amount = q;
        }

        public String toString() {
            String response = "Descrição: " + description;
            response += nlin + "Qtde: " + amount;
            return response;
        }

        public void toSystemOut() {
            String response = "Descrição: " + description;
            response += nlin + "Qtde: " + amount;
            System.out.print(response);
        }
    }
}