
package com.kafkaexample.kafkaproducerconsumer;

import java.io.Serializable;

public class SimpleModel implements Serializable {
    private String field1;

    public SimpleModel() {
    }

    public SimpleModel(String field1) {
        this.field1 = field1;
    }

    public String getField1() {
        return this.field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public SimpleModel field1(String field1) {
        setField1(field1);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " field1='" + getField1() + "'" + "}";
    }

}