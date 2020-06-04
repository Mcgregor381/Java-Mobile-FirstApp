package uk.co.mycoffeeapp.CoffeeContnet;

import android.content.Context;
import android.icu.util.ULocale;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import uk.co.mycoffeeapp.R;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.RecyclerViewHolder> {

    private Context mContext;
    private List<ULocale.Category> categoryList;


    public CategoryAdapter(Context mContext, List<ULocale.Category> categoryList){
        this.mContext = mContext;
        this.categoryList = categoryList;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
    {
        View itemView= LayoutInflater.from(ViewGroup.getContext()).inflate(R.layout.catagoty_card,viewGroup,)
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        public ImageView thumbnail;
        public TextView Title;

        public RecyclerViewHolder(View itemView)
        {
            super(itemView);
            thumbnail=(ImageView) itemView.findViewById(R.id.thumbnail);
            Title=(TextView) itemView.findViewById(R.id.Title);
        }
    }
}