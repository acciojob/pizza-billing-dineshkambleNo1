package com.driver;

public class Pizza {

    private int price; // final bill price
    private Boolean isVeg;
    private String bill;

    private  int cheese_price;

    private int toppings_price;

    private int paperBag_price;

    //for check

    boolean isCheeseAdded;
    boolean isToppingAdded;

    boolean isBagPriceAdded;


    boolean isbillgenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        this.cheese_price = 80;
        this.paperBag_price = 20;

        if(isVeg == true) {

            this.price = 300;
            this.toppings_price = 70;

            this.bill = "Base Price Of The Pizza:"+this.price + "\n";
        }
        else{
            this.price = 400;
            this.toppings_price = 120;

            this.bill = "Base Price Of The Pizza:"+this.price + "\n";
        }

        isCheeseAdded = false;
        isToppingAdded = false;
        isBagPriceAdded = false;



    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(isCheeseAdded == false)
        {
            this.price = this.price + this.cheese_price;

            // or fir cheese ko add kardo

            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here

        if(isToppingAdded == false)
        {
            this.price = this.price + this.toppings_price;

            // or fir cheese ko add kardo

            isToppingAdded  = true;
        }

    }

    public void addTakeaway(){
        // your code goes here



        if(isBagPriceAdded == false)
        {
            this.price = this.price + this.paperBag_price;

            // or fir cheese ko add kardo

            isBagPriceAdded  = true;
        }
    }

    //
//         80
//         70
//         20
//         470

    public String getBill(){
        // your code goes here
        if(isbillgenerated == false){

            if(isCheeseAdded == true)
            {
                this.bill = this.bill +  "Extra Cheese Added: "+ this.cheese_price + "\n";
            }

            if(isToppingAdded == true){
                this.bill = this.bill +"Extra Toppings Added: "+ this.toppings_price + "\n";
            }

            if(isBagPriceAdded == true){
                this.bill = this.bill +"Paperbag Added: "+  this.paperBag_price + "\n";
            }

            this.bill = this.bill + "Total Price: "+ this.price;

            isbillgenerated = true; // bhai don't generate bill again and again

        }
        return this.bill;
    }
}
