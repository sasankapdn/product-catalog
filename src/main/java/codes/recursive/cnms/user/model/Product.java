package codes.recursive.cnms.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "Product")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {


    @Id
    @Column(name = "PRODUCT_ID")
    @NotNull
    @Size(max=500)
    public String PRODUCT_ID;


    @Column(name = "CATEGORY_ID")
    @Size(max=500)
    public  String CATEGORY_ID;

    @Column(name = "LIST_PRICE")

    @Size(max=500)
    public  String LIST_PRICE;

    @Column(name = "ATTRIBUTE3")
    @Size(max=500)
    public  String ATTRIBUTE3;

    @Column(name = "CREATED_BY")

    @Size(max=500)
    public  String CREATED_BY;

    @Column(name = "ATTRIBUTE2")
    @Size(max=500)
    public  String ATTRIBUTE2;

    @Column(name = "LAST_UPDATED_BY")
    @Size(max=500)
    public  String LAST_UPDATED_BY;

    @Column(name = "ATTRIBUTE1")
    @Size(max=500)
    public  String ATTRIBUTE1;

    @Column(name = "OBJECT_VERSION_ID")

    @Size(max=500)
    public  String OBJECT_VERSION_ID;

    @Column(name = "MIN_PRICE")

    @Size(max=500)
    public  String MIN_PRICE;

    @Column(name = "PARENT_CATEGORY_ID")
    @Size(max=500)
    public  String PARENT_CATEGORY_ID;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "CREATION_DATE")
    private Date CREATION_DATE = new Date();







    @Column(name = "PRODUCT_NAME")

    @Size(max=500)
    public  String PRODUCT_NAME;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "LAST_UPDATE_DATE")
    private Date LAST_UPDATE_DATE = new Date();


    @Column(name = "EXTERNAL_URL")
    @Size(max=500)
    public  String EXTERNAL_URL;

    @Column(name = "ATTRIBUTE5")
    @Size(max=500)
    public  String ATTRIBUTE5;

    @Column(name = "ATTRIBUTE4")
    @Size(max=500)
    public  String ATTRIBUTE4;

    @Column(name = "ATTRIBUTE_CATEGORY")
    @Size(max=500)
    public  String ATTRIBUTE_CATEGORY;

    @Column(name = "PRODUCT_STATUS")

    @Size(max=500)
    public  String PRODUCT_STATUS;

    @Column(name = "WARRANTY_PERIOD_MONTHS")
    @Size(max=500)
    public  String WARRANTY_PERIOD_MONTHS;

    @Column(name = "COST_PRICE")
    @Size(max=500)
    public  String COST_PRICE;

    @Column(name = "TWITTER_TAG")
    @Size(max=500)
    public  String TWITTER_TAG;


    public String getCATEGORY_ID() {
        return CATEGORY_ID;
    }

    public String getLIST_PRICE() {
        return LIST_PRICE;
    }

    public String getATTRIBUTE3() {
        return ATTRIBUTE3;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public String getATTRIBUTE2() {
        return ATTRIBUTE2;
    }

    public String getLAST_UPDATED_BY() {
        return LAST_UPDATED_BY;
    }

    public String getATTRIBUTE1() {
        return ATTRIBUTE1;
    }

    public String getOBJECT_VERSION_ID() {
        return OBJECT_VERSION_ID;
    }

    public String getMIN_PRICE() {
        return MIN_PRICE;
    }

    public String getPARENT_CATEGORY_ID() {
        return PARENT_CATEGORY_ID;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE.toString();
    }

    public String getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public String getLAST_UPDATE_DATE() {
        return LAST_UPDATE_DATE.toString();
    }

    public String getEXTERNAL_URL() {
        return EXTERNAL_URL;
    }

    public String getATTRIBUTE5() {
        return ATTRIBUTE5;
    }

    public String getATTRIBUTE4() {
        return ATTRIBUTE4;
    }

    public String getATTRIBUTE_CATEGORY() {
        return ATTRIBUTE_CATEGORY;
    }

    public String getPRODUCT_STATUS() {
        return PRODUCT_STATUS;
    }

    public String getWARRANTY_PERIOD_MONTHS() {
        return WARRANTY_PERIOD_MONTHS;
    }

    public String getCOST_PRICE() {
        return COST_PRICE;
    }

    public String getTWITTER_TAG() {
        return TWITTER_TAG;
    }

    public Product(){

    }
    public Product(String CATEGORY_ID,String LIST_PRICE, String ATTRIBUTE3
            , String CREATED_BY
            , String ATTRIBUTE2
            , String LAST_UPDATED_BY
            , String ATTRIBUTE1
            , String OBJECT_VERSION_ID
            , String MIN_PRICE
            , String PARENT_CATEGORY_ID
            , Date CREATION_DATE
            , String PRODUCT_ID
            , String PRODUCT_NAME
            , Date LAST_UPDATE_DATE
            , String EXTERNAL_URL
            , String ATTRIBUTE5
            , String ATTRIBUTE4
            , String ATTRIBUTE_CATEGORY
            , String PRODUCT_STATUS
            , String WARRANTY_PERIOD_MONTHS
            , String COST_PRICE, String TWITTER_TAG) {

        this.CATEGORY_ID = CATEGORY_ID;
        this.LIST_PRICE =LIST_PRICE;
        this.ATTRIBUTE3 = ATTRIBUTE3;
        this.CREATED_BY = CREATED_BY;
        this.ATTRIBUTE2 = ATTRIBUTE2;
        this.LAST_UPDATED_BY = LAST_UPDATED_BY;
        this.ATTRIBUTE1 = ATTRIBUTE1;
        this.OBJECT_VERSION_ID = OBJECT_VERSION_ID;
        this.MIN_PRICE = MIN_PRICE;
        this.PARENT_CATEGORY_ID = PARENT_CATEGORY_ID;
        this.CREATION_DATE = CREATION_DATE;
        this.PRODUCT_ID = PRODUCT_ID;
        this.PRODUCT_NAME = PRODUCT_NAME;
        this.LAST_UPDATE_DATE = LAST_UPDATE_DATE;
        this.EXTERNAL_URL = EXTERNAL_URL;
        this.ATTRIBUTE5 = ATTRIBUTE5;
        this.ATTRIBUTE4 = ATTRIBUTE4;
        this.ATTRIBUTE_CATEGORY = ATTRIBUTE_CATEGORY;
        this.PRODUCT_STATUS = PRODUCT_STATUS;
        this.WARRANTY_PERIOD_MONTHS = WARRANTY_PERIOD_MONTHS;
        this.COST_PRICE = COST_PRICE;
        this.TWITTER_TAG = TWITTER_TAG;

    }

}