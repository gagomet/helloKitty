package com.hellokitty.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

/**
 * Created by KAKolesnikov on 2015-04-29.
 */
public class Kitty {
    private String name;
    private String color;
    private Date birthday;
    private double weight;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Kitty rhs = (Kitty) obj;
        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(this.name, rhs.name)
                .append(this.color, rhs.color)
                .append(this.birthday, rhs.birthday)
                .append(this.weight, rhs.weight)
                .append(this.height, rhs.height)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder()
                .append(name)
                .append(color)
                .append(birthday)
                .append(weight)
                .append(height)
                .toHashCode();
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("color", color)
                .append("birthday", birthday)
                .append("weight", weight)
                .append("height", height)
                .toString();
    }
}
