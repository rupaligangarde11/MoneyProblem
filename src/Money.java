public class Money {
    private int paise;
    private int rupee;

    public Money(int rupee, int paise) {
        this.rupee = rupee;
        this.paise = paise;
    }

    public Money addMoney(Money that) {
        if (this.paise+that.paise>100){
            return new Money(this.rupee + that.rupee+1, (this.paise+that.paise)%100);
        }
        return new Money(this.rupee + that.rupee, this.paise + that.paise);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (paise != money.paise) return false;
        return rupee == money.rupee;

    }

    @Override
    public int hashCode() {
        int result = paise;
        result = 31 * result + rupee;
        return result;
    }
}
