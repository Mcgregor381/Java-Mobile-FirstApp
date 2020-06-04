package uk.co.mycoffeeapp.CoffeeContnet;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.RecyclerViewHolder>
{
    private Context mContext;
    private List<Product>Productlist;
    public ProductAdapter(Context context,List<Product>Productlist)
    {
        this.mContext=context;
        this.Productlist=Productlist;
    }

    @NonNull
    @Override
    public ProductAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.RecyclerViewHolder recyclerViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
//some class?
    public class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        public RecyclerViewHolder(@NonNull View itemView)
        {
            super(itemView);
        }
    }
}