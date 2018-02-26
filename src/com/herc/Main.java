package com.herc;

public class Main {

    public static void main(String[] args) {
	Hamburger burger1 = new Hamburger("Pão bola","Carne de Gado",10);

	burger1.setName("Hamburger do Bill");
	burger1.addItens(false,true,false,true);
	burger1.showBurger();




    }
}
