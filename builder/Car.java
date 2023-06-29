package com.green.java.builder;

public class Car {
    private int cc;
    private String brand;
    private String model;
    private int seatCnt;

    // inner class
    public static class Builder{
        private int cc;
        private String brand;
        private String model;
        private int seatCnt;

        public  Builder cc(int cc) {
            this.cc =cc;
            return this;
        }
        public  Builder brand(String brand) {
            this.brand = brand;
            return this;
        }
        public  Builder model(String model) {
            this.model = model;
            return this;
        }
        public  Builder seatCnt(int seatCnt) {
            this.seatCnt = seatCnt;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
    // inner class
    @Override
    public String toString() {
        return String.format("cc : %d\nbrand : %s\nmodel : %s\nseatCnt : %d",
                cc, brand, model, seatCnt);
    }
    public static Builder builder(){
        return new Builder();
    }
    private Car (Builder builder) {
        this.cc = builder.cc;
        this.brand = builder.brand;
        this.model = builder.model;
        this.seatCnt = builder.seatCnt;
    }

    public int getCc() {
        return cc;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeatCnt() {
        return seatCnt;
    }
}
