package code.tasks;

import java.util.ArrayList;
import java.util.List;

class ProductType{
    String name;
    int price;
    String category;
    String grade;

    ProductType(String name,int price,String cat,String grade)
    {
        this.name=name;
        this.price=price;
        this.category=cat;
        this.grade=grade;
    }
}

public class HomeTasks_Streams {
    public static void main(String[] arg) {

        List<Product> listProduct = new ArrayList<Product>();
        listProduct.add(new Product("Product 1", 800, "Non-Electronic", "Grade 1"));
        listProduct.add(new Product("Product 2", 2000, "Electronic", "Grade 2"));
        listProduct.add(new Product("Product 3", 3000, "Non-Electronic", "Grade 3"));
        listProduct.add(new Product("Product 4", 700, "Electronic", "Grade 4"));
        listProduct.add(new Product("Product 5", 5000, "Electronic", "Grade 5"));
        listProduct.add(new Product("Product 6", 300, "Non-Electronic", "Grade 6"));


        int totalSum = listProduct.stream().filter(product -> product.price > 1000).mapToInt(i -> i.price)
                .sum();
        System.out.println("cost of all products whose prices is > 1000: " + totalSum);

        totalSum = listProduct.stream().filter(product -> product.category.equals("Electronic"))
                .mapToInt(i -> i.price)
                .sum();
        System.out.println("cost of all electronic products : " + totalSum);


        totalSum = listProduct.stream().filter(product -> product.category.equals("Electronic")
                && product.price > 1000)
                .mapToInt(i -> i.price)
                .sum();
        System.out.println("products whose price is is > 1000/- and belongs to electronic category: " + totalSum);

        long count = listProduct.stream().filter(product -> product.category.equals("Electronic"))
                .count();
        System.out.println("count of all electronic products in the given list of products: " + count);


    }
}