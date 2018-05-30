package kolenko.domain;


import javax.persistence.*;
import java.util.List;

@Entity
public class Thing {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)        //automatic generating Id
    private long id;
    private String name;
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @OneToMany
    private List<ThingInOrder> thingsInOrder;

    public List<ThingInOrder> getThingsInOrder() {
        return thingsInOrder;
    }

    public void setThingsInOrder(List<ThingInOrder> thingsInOrder) {
        this.thingsInOrder = thingsInOrder;
    }

}
