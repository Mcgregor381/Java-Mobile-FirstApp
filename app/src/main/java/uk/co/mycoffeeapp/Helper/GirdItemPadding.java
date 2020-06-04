package uk.co.mycoffeeapp.Helper;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class GirdItemPadding extends RecyclerView.ItemDecoration
{
    //layout for content
    private int spanCount, spacing;
    private boolean IncludeEdges;



    //getters and setters


    public GirdItemPadding(int spanCount, int spacing, boolean IncludeEdges)
    {
       this.spanCount =spanCount;
       this.spacing =spacing;
       this.IncludeEdges=IncludeEdges;

    }

    //layout
    public void getItemOffSets(Rect outRect, View view,RecyclerView parent,RecyclerView.State state)
    {
        int pos = parent.getChildAdapterPosition(view);
        int col = pos % spanCount; //item collum

        if (IncludeEdges)
        {
            outRect.left = spacing - col*(1f/spanCount);
            outRect.right = (col+1) *((1f/spanCount)*spacing);

            if(pos<spanCount)//top edge
            {
                outRect.top =spacing;
            }
            outRect.bottom=spacing;//bottom edge
        }
            else
            {
                outRect.left =col *spacing/spanCount;
                outRect.right =  col*spacing-col+1 *spacing/spacing;
                if (pos >= spanCount)
                {
                    outRect.top = spacing;
                }

            }
    }


}
