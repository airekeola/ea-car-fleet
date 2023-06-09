package edu.miu.carfleet.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * @author bazz
 * Apr 22 2023
 * 15:55
 */
public class CarDto {

    private String licensePlate;

    private String type;
    private String brand;
    private BigDecimal price;
    private Boolean available;

    public CarDto() {
    }

    public CarDto(String licensePlate, String type, String brand, BigDecimal price, Boolean available) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }


    @Override
    public String toString() {
        String format = "| %-15s | %-10s | %-10s | %10s | %-8s |\n";
        StringBuilder sb = new StringBuilder();
        sb.append("+-----------------+------------+------------+------------+----------+\n");
        sb.append("| License Plate   | Type       | Brand      | Price      | Available|\n");
        sb.append("+-----------------+------------+------------+------------+----------+\n");
        sb.append(String.format(format, licensePlate, type, brand, price, available));
        sb.append("+-----------------+------------+------------+------------+----------+\n");
        return sb.toString();
    }
}

