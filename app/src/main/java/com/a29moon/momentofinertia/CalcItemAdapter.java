package com.a29moon.momentofinertia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CalcItemAdapter extends RecyclerView.Adapter<CalcItemAdapter.CalcItemViewHolder> {

    private CalcItem[] mDataSet;

    @Override
    public void onBindViewHolder(CalcItemViewHolder viewHolder, int position) {
        viewHolder.mTitleTextView.setText(mDataSet[position].getNameOfCalculator());
        viewHolder.mDescriptionTextView.setText(mDataSet[position].getDescriptionOfCalculator());
    }

    public static class CalcItemViewHolder extends RecyclerView.ViewHolder {

        // This is the template you created for a single list item
        public LinearLayout mLinearLayout;

        // The individual views inside the linear layout
        public ImageView mThumbnailView;
        public TextView mTitleTextView;
        public TextView mDescriptionTextView;

        public CalcItemViewHolder(LinearLayout ll) {
            super(ll);
            mLinearLayout = ll; // not sure if this is needed
            mThumbnailView = (ImageView) ll.findViewById(R.id.calc_item_thumbnail_view);
            mTitleTextView = (TextView) ll.findViewById(R.id.calc_item_title_text_view);
            mDescriptionTextView = (TextView) ll.findViewById(R.id.calc_item_description_text_view);
        }
    }

    public CalcItemAdapter(CalcItem[] dataSet) {
        mDataSet = dataSet;
    }

    @Override
    public CalcItemAdapter.CalcItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.calc_item_layout, parent, false); // Create the  linear layout view
        CalcItemViewHolder vh = new CalcItemViewHolder(v); // pass it into the view holder
        return vh;
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

}
