package com.herc;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private boolean lettuce = false;
    private double priceLettuce = 0.2;
    private boolean tomato = false;
    private double priceTomato = 0.3;
    private boolean carrot = false;
    private double priceCarrot = 0.5;
    private double priceBurger;
    private boolean onion = false;
    private double priceOnion =0.05;

    public Hamburger(String rollType, String meat, double priceBurger) {
        this.rollType = rollType;
        this.meat = meat;
        this.priceBurger = priceBurger;
    }

//    public Hamburger(String name, double priceBurger) {
//        this.name = name;
//        this.priceBurger = priceBurger;
//
//    }



    public void addItens(boolean lettuce, boolean tomato, boolean carrot, boolean onion) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.onion = onion;

        if (lettuce) {this.priceBurger += this.priceLettuce;}
        if (tomato) {this.priceBurger += this.priceTomato;}
        if (carrot) {this.priceBurger += this.priceCarrot;}
        if (onion) { this.priceBurger+= this.priceOnion; }


    }

    public void showBurger() {
        System.out.println("Nome: " + getName());
        System.out.println("Tipo de pão: " + getRollType());
        System.out.println("Tipo de carne: " + getMeat());


        if (this.lettuce) {
            System.out.println("Com alface");
        } else {
            System.out.println("Sem alface");
        }

        if (this.tomato) {
            System.out.println("Com tomate");
        } else {
            System.out.println("Sem tomate");
        }

        if (this.carrot) {
            System.out.println("Com cenoura");
        } else {
            System.out.println("Sem cenoura");
        }

        if (this.onion) {
            System.out.println("Com cebola");
        } else {
            System.out.println("Sem cebola");
        }

        System.out.println("Preço: R$" + getPriceBurger());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollType() {
        return rollType;
    }

    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public double getPriceLettuce() {
        return priceLettuce;
    }

    public void setPriceLettuce(double priceLettuce) {
        this.priceLettuce = priceLettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public double getPriceTomato() {
        return priceTomato;
    }

    public void setPriceTomato(double priceTomato) {
        this.priceTomato = priceTomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public double getPriceCarrot() {
        return priceCarrot;
    }

    public void setPriceCarrot(double priceCarrot) {
        this.priceCarrot = priceCarrot;
    }

    public double getPriceBurger() {
        return priceBurger;
    }

    public void setPriceBurger(double priceBurger) {
        this.priceBurger = priceBurger;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public double getPriceOnion() {
        return priceOnion;
    }

    public void setPriceOnion(double priceOnion) {
        this.priceOnion = priceOnion;
    }
}

