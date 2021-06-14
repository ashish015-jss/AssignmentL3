package code.tasks;

import java.util.ArrayList;
import java.util.List;

class Product{
    String name;
    int price;
    String category;
    String grade;

    Product(String name,int price,String cat,String grade)
    {
        this.name=name;
        this.price=price;
        this.category=cat;
        this.grade=grade;
    }
}

public class HomeTasks_FunctionInterfaces {
    public static void main(String[] arg)
    {
        Product p1=new Product("Product 1",800,"Non-Electronic","Grade 1");
        Product p2=new Product("Product 2",2000,"Electronic","Grade 2");
        Product p3=new Product("Product 3",3000,"Non-Electronic","Grade 3");
        Product p4=new Product("Product 4",700,"Electronic","Grade 4");
        Product p5=new Product("Product 5",5000,"Electronic","Grade 5");
        Product p6=new Product("Product 6",300,"Non-Electronic","Grade 6");

        List<Product> listProduct=new ArrayList<Product>();
        listProduct.add(p1);
        listProduct.add(p2);
        listProduct.add(p3);
        listProduct.add(p4);
        listProduct.add(p5);
        listProduct.add(p6);

        int totalSum = listProduct.stream().mapToInt(product -> product.price).sum();
        System.out.println("cost of all products in a given list of products: "+totalSum);


        totalSum = listProduct.stream().filter(product -> product.price>1000).mapToInt(i -> i.price)
                .sum();
        System.out.println("cost of all products whose prices is > 1000: "+totalSum);

        totalSum = listProduct.stream().filter(product -> product.category.equals("Electronic"))
                .mapToInt(i -> i.price)
                .sum();
        System.out.println("cost of all electronic products : "+totalSum);

        totalSum = listProduct.stream().filter(product -> product.category.equals("Electronic")
                && product.price>1000)
                .mapToInt(i -> i.price)
                .sum();
        System.out.println("products whose price is is > 1000/- and belongs to electronic category: "+totalSum);
    }
}
