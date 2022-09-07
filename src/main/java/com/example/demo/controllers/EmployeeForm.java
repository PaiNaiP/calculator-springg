package com.example.demo.controllers;

import java.util.Objects;

public class EmployeeForm {
    private int var1;
    private int var2;
    private String plus;

    public EmployeeForm() {
        super();
    }

    public EmployeeForm(int var1, int var2, String plus) {
        super();
        this.var1 = var1;
        this.var2 = var2;
        this.plus = plus;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    @Override
    public String toString() {
        int c = 0;
        if (Objects.equals(plus, "+"))
        {
            c=var1+var2;
        }
        if (Objects.equals(plus, "-"))
        {
            c=var1-var2;
        }
        if (Objects.equals(plus, "*"))
        {
            c=var1*var2;
        }
        if (Objects.equals(plus, "/"))
        {
            c=var1/var2;
        }
        String t = String.valueOf(c);
        return t;
    }
}
