// Just rename this immutable class :)
public class WonderfulNumber extends Number {

    private final double value;

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return Double.valueOf(value).floatValue();
    }

    @Override
    public int intValue() {
        return Double.valueOf(value).intValue();
    }

    @Override
    public long longValue() {
        return Double.valueOf(value).longValue();
    }

    public IpacNumber add(IpacNumber ipacNumber) {
        return new IpacNumber(value + ipacNumber.value);
    }

    public IpacNumber add(int value) {
        return new IpacNumber(this.value + value);
    }

    public IpacNumber add(double value) {
        return new IpacNumber(this.value + value);
    }

    public IpacNumber sub(IpacNumber ipacNumber) {
        return new IpacNumber(value - ipacNumber.value);
    }

    public IpacNumber sub(int value) {
        return new IpacNumber(this.value - value);
    }

    public IpacNumber sub(double value) {
        return new IpacNumber(this.value - value);
    }

    public IpacNumber multiply(IpacNumber ipacNumber) {
        return new IpacNumber(value * ipacNumber.value);
    }

    public IpacNumber multiply(int value) {
        return new IpacNumber(this.value * value);
    }

    public IpacNumber multiply(double value) {
        return new IpacNumber(this.value * value);
    }

    public IpacNumber divide(IpacNumber ipacNumber) {
        return new IpacNumber(value / ipacNumber.value);
    }

    public IpacNumber divide(int value) {
        return new IpacNumber(this.value / value);
    }

    public IpacNumber divide(double value) {
        return new IpacNumber(this.value / value);
    }

    public IpacNumber(int value) {
        this.value = value;
    }

    public IpacNumber(double value) {
        this.value = Double.valueOf(value).floatValue();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
