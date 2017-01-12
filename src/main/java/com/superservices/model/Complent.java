package com.superservices.model;

/**
 *
 * @author anil
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "complent")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Complent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "product_code")
    private String productCode;

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    @Column(name = "short_desc")
    private String shortDesc;



    public long getId() {
        return id;
    }

    public String getProductCode() {
        return productCode;
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

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }



}
