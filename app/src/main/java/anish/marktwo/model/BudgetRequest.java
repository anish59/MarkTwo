package anish.marktwo.model;

import android.support.annotation.Nullable;

import anish.marktwo.Budget;

/**
 * Created by anish on 03-07-2017.
 */

public class BudgetRequest extends Budget {

    private long bid;
    private Long month;
    private Long amount;


    @Override
    public long bid() {
        return bid;
    }

    @Nullable
    @Override
    public Long month() {
        return month;
    }

    @Nullable
    @Override
    public Long amount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Budget{"
                + "bid=" + bid + ", "
                + "month=" + month + ", "
                + "amount=" + amount
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Budget) {
            Budget that = (Budget) o;
            return (this.bid == that.bid())
                    && ((this.month == null) ? (that.month() == null) : this.month.equals(that.month()))
                    && ((this.amount == null) ? (that.amount() == null) : this.amount.equals(that.amount()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= (this.bid >>> 32) ^ this.bid;
        h *= 1000003;
        h ^= (month == null) ? 0 : this.month.hashCode();
        h *= 1000003;
        h ^= (amount == null) ? 0 : this.amount.hashCode();
        return h;
    }

}
