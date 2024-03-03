package Code.Module.Comparison_and_Sorting;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class ProductOutput {
    public static void main(String[] args) {
        Set<Product> products = new TreeSet<>(new NameComparator());
        products.add(new Product("СуперБренд", "Колбаса", 1L, LocalDateTime.now()));
        products.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));

        Set<Product> products1 = new TreeSet<>(new SerialNumberComparator().reversed()); // Notice the reversed order.
        products1.add(new Product("СуперБренд", "Колбаса", 1L, LocalDateTime.now()));
        products1.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));

        for (Product product : products) {
            System.out.println(product.getName());
        }

        for (Product product : products1) {
            System.out.println(product.getSerialNumber());
        }
    }
}
