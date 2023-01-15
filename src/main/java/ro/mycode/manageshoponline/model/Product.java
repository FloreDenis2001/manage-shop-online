package ro.mycode.manageshoponline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Product")
@Table(name="product")
@SuperBuilder

public class Product implements Comparable<Product> {
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Id

    private long id;
    private String name;
    private float price;
    private String descriptions;
    private int stock;


    @Override
    public String toString(){
      String text = "Id"+this.id+"\n";
        text="Name : "+this.name+"\n";
        text+="Price : "+this.price+" /buc \n";
        text+="Description : "+this.descriptions+"\n";
        text+="Stock  : "+this.stock+"\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
       Product x = (Product) o;
        return this.stock == x.getStock();
    }


    @Override
    public int compareTo(Product o) {
        if (this.price > o.getPrice()) {
            return 1;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
