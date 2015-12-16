package com.android.elixr.models;

import java.io.Serializable;

/**
 * Created by akshit on 16/12/15.
 */
public class FieldItem implements Serializable {

    private boolean normal;
    private String fieldName;
    private String normalValue;
    private String value;

    public boolean isNormal() {
        return normal;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getNormalValue() {
        return normalValue;
    }

    public String getValue() {
        return value;
    }
}
