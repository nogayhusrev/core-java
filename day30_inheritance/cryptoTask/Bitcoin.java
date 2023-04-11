package day30_inheritance.cryptoTask;

public class Bitcoin extends Crypto{
    public Bitcoin(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
