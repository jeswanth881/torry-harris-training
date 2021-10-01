package com.torryharris.model;

public class Insurance {
    String ins_name;
    int ins_id;
    long sum;
    String ins_type;

    public Insurance() {
    }

    public Insurance(String ins_name, int ins_id, long sum, String ins_type) {
        this.ins_name = ins_name;
        this.ins_id = ins_id;
        this.sum = sum;
        this.ins_type = ins_type;
    }

    public String getIns_name() {
        return ins_name;
    }

    public void setIns_name(String ins_name) {
        this.ins_name = ins_name;
    }

    public int getIns_id() {
        return ins_id;
    }

    public void setIns_id(int ins_id) {
        this.ins_id = ins_id;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public String getIns_type() {
        return ins_type;
    }

    public void setIns_type(String ins_type) {
        this.ins_type = ins_type;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "ins_name='" + ins_name + '\'' +
                ", ins_id=" + ins_id +
                ", sum=" + sum +
                ", ins_type='" + ins_type + '\'' +
                '}';
    }
}
