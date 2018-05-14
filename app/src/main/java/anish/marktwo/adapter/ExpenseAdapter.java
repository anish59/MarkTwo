package anish.marktwo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import anish.marktwo.R;

/**
 * Created by anish on 03-07-2017.
 */

public class ExpenseAdapter extends RecyclerView.Adapter<ExpenseAdapter.MyViewHolder> {
    private Context context;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_expense, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView spendOn;
        private TextView amount;

        public MyViewHolder(View itemView) {
            super(itemView);
            amount = (TextView) itemView.findViewById(R.id.amount);
            spendOn = (TextView) itemView.findViewById(R.id.spendOn);
        }
    }
}
