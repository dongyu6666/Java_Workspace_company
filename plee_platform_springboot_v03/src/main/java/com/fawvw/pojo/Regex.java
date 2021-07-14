package com.fawvw.pojo;

public class Regex {
    private String IB1_filename;
    private String IB1_VERSION_real;


    public Regex() {
    }

    public Regex(String IB1_filename, String IB1_VERSION_real) {
        this.IB1_filename = IB1_filename;
        this.IB1_VERSION_real = IB1_VERSION_real;
    }

    public String getIB1_filename() {
        return IB1_filename;
    }

    public void setIB1_filename(String IB1_filename) {
        this.IB1_filename = IB1_filename;
    }

    public String getIB1_VERSION_real() {
        return IB1_VERSION_real;
    }

    public void setIB1_VERSION_real(String IB1_VERSION_real) {
        this.IB1_VERSION_real = IB1_VERSION_real;
    }

    @Override
    public String toString() {
        return "Regex{" +
                "IB1_filename='" + IB1_filename + '\'' +
                ", IB1_VERSION_real='" + IB1_VERSION_real + '\'' +
                '}';
    }
}
