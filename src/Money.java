public class Money {
    private int paise;
    private int rupee;

    public Money(int rupee, int paise) {
        this.paise = paise;
        this.rupee = rupee;
    }

    public Money addPaise(Money that) {
        return new Money(0, this.paise + that.paise);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money that = (Money) o;
//        if (that.paise > 100)
//            return this.rupee * 100 + this.paise == that.paise;
//        if (this.paise > 100)
//            return that.rupee * 100 + that.paise == this.paise;
//        return paise == that.paise;
        if((this.rupee==that.rupee)&&(this.paise==that.paise))
            return true;
        if(this.paise>100)
            if(((this.rupee+(this.paise/100))==that.rupee)&&((this.paise%100==that.paise)))
                return true;
        if(that.paise>100)
            if(((that.rupee+(that.paise/100))==this.rupee)&&((that.paise%100==this.paise)))
                return true;
        return false;

    }

    @Override
    public int hashCode() {
        return paise;
    }

    public Money addRupee(Money that) {
        return new Money(this.rupee + that.rupee, 0);
    }

    public Money addMoney(Money that) {

        return new Money(this.rupee + that.rupee , this.paise + that.paise);
    }

    public Money subtractMoney(Money that) {
        return new Money(Math.abs(this.rupee - that.rupee), Math.abs(this.paise - that.paise));
    }

}
