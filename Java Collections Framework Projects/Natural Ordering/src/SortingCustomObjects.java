import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop implements Comparable<Laptop>{
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String toString() {
        return String.format("Laptop [brand='%s', ram=%d, price=%d]", brand, ram, price);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int compareTo(Laptop other_laptop) {
        // comparison based on ram size
        if (this.ram > other_laptop.ram) return 1;
        else if (this.ram < other_laptop.ram) return -1;
        else return 0;
    }
}

public class SortingCustomObjects {
    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>();

        laptopList.add(new Laptop("dell", 8, 70000));
        laptopList.add(new Laptop("apple", 16, 123000));
        laptopList.add(new Laptop("acer", 12, 55000));

        System.out.println("Sorted based on to RAM size...");
        Collections.sort(laptopList);
        display(laptopList);

        Comparator<Laptop> priceComparator = new Comparator<>() {
            @Override
            public int compare(Laptop l1, Laptop l2) {
                // Comparison based on price
                int price1 = l1.getPrice();
                int price2 = l2.getPrice();

                if (price1 > price2) return 1;
                else if (price1 < price2) return -1;
                else return 0;
            }
        };

        System.out.println("Sorted based on price...");
        Collections.sort(laptopList, priceComparator);
        display(laptopList);
    }

    public static <T> void display(List<T> list) {
        for (T item: list) {
            System.out.println(item);
        }
    }
}

// See Explanation.txt
