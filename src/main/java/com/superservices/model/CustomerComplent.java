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
@Table(name = "customer_complent")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerComplent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "marchand_id")
    private String marchandId;

    @Column(name = "product_id")
    private String productId;
    
    @Column(name = "customer_id")
    private String customerId;
    
    @Column(name = "complent_text")
    private String complentText;
    
    @Column(name = "extra_info")
    private String extraInfo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarchandId() {
        return marchandId;
    }

    public void setMarchandId(String marchandId) {
        this.marchandId = marchandId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getComplentText() {
        return complentText;
    }

    public void setComplentText(String complentText) {
        this.complentText = complentText;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }




}
