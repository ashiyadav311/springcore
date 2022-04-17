package com.springcore.ref;

public class Reference1 {
    private int x;
    private Reference2 ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Reference2 getOb() {
        return ob;
    }

    public void setOb(Reference2 ob) {
        this.ob = ob;
    }
    public Reference1()
    {
        super();
    }

    @Override
    public String toString() {
        return "Reference1{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}
