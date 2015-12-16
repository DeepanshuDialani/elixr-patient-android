package com.android.elixr.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by akshit on 16/12/15.
 */
public class ReportData implements Serializable {

    private String patientName;
    private String gender;
    private String patientId;
    private ArrayList<FieldItem> fieldList;

    public String getPatientName() {
        return patientName;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<FieldItem> getFieldList() {
        return fieldList;
    }
}
