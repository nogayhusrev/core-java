package day30_inheritance.cryptoTask;

public class Crypto {

    private double price;
    private int quantity;
    private long marketCap;
    private long circulatingSupply;
    private boolean isMineable;


    public Crypto(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public void setPrice(double price) {
        //1. price can not be set to zero or negative
        if (price>0){
            this.price = price;
        }else {
            System.err.println("price can not be set to zero or negative");
            System.exit(1);
        }

    }

    public void setQuantity(int quantity) {
        //quantity can nt set to negative
        if (quantity>0){
            this.quantity = quantity;
        }else {
            System.err.println("Quantity can not be set to negative");
            System.exit(1);
        }
    }

    public void setMarketCap(long marketCap) {
        //3. marketCap can not be zero
        if (marketCap>0){
            this.marketCap = marketCap;
        }else {
            System.err.println("Market cap can not be set to negative");
            System.exit(1);
        }
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public double totalPrice(){
        return price*quantity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*
cryptoTask
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can nt set to negative
					3. marketCap can not be zero

			methods:
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset


 */