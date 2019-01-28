package com.a29moon.momentofinertia;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public class CalcItemAdapter extends RecyclerView.Adapter<CalcItemAdapter.CalcItemViewHolder> {

    private CalcItem[] mDataSet;

    public static class CalcItemViewHolder extends RecyclerView.ViewHolder {

    }

    public CalcItemAdapter(CalcItem[] dataSet) {
        mDataSet = dataSet;
    }

    @Override
    public CalcItemAdapter.CalcItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

}
