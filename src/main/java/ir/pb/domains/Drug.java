package ir.pb.domains;

import ir.pb.base.domians.BaseEntity;
import javax.persistence.*;


@Entity
public class Drug extends BaseEntity<Long> {
    @Column()
    private String name;
    @Column()
    private long code;
    @Column()
    private double price;
    @Column(columnDefinition = "text")
    private String information;

    public Drug() {
    }

    public Drug(String name, long code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}