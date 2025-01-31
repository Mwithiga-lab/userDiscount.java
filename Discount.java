//Discount class

 class Discount{

    // the Method/Function to get the discount
    public static double get_discount(double amountSpend){
    double discount;
    //to find discount through a boolean expression
    if(amountSpend>5000){
        discount=(10*amountSpend)/100;
    }
    else if (amountSpend>1000 && amountSpend<=50000){
        discount=(5*amountSpend)/100;
    }
    else{
        discount=0;
    }
    return discount;
}
// Prompting user to input amount and display it
    public static void main(String[] args) {
        double amountSpend=11000;
       double discount=get_discount(amountSpend);
       System.out.println("the discount is" + discount);
    }
}
