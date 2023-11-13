package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String name;
    private String category;
    private Date purchaseDate;
    private Double purchasePrice;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    public Security() {
        // Default constructor
    }

    // Constructor with all instance variables
    public Security(String name, String category, Date purchaseDate, Double purchasePrice, Integer quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    // Getters
    public Long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    // Setters for non-id fields

       public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}