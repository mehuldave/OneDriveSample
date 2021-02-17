package com.example.onedrivesample.adapters;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.onedrivesample.R;
import com.example.onedrivesample.model.AdminRecord;
import java.util.ArrayList;

public class AdminAdapter extends RecyclerView.Adapter<AdminAdapter.MyViewHolder> {

    private ArrayList<AdminRecord> arrList;
    ItemClick itemClick;

    public interface ItemClick {
        public void onItemClick(int intpos);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtName;
        public LinearLayout lnitemclick;

        public MyViewHolder(View view) {
            super(view);

            txtName = view.findViewById(R.id.txtName);
            lnitemclick = view.findViewById(R.id.lnitemclick);
        }
    }

    public AdminAdapter(ArrayList<AdminRecord> arrListt,ItemClick itemClick) {
        this.arrList = arrListt;
        this.itemClick = itemClick;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.admin_row_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {
        AdminRecord trips = arrList.get(position);
        holder.txtName.setText(trips.getName());
        holder.lnitemclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClick.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrList.size();
    }
}
