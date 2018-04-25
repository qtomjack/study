package com.company.regular.study_application;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.SQLTransactionRollbackException;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Data mData;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;
        public TextView mText;
        public ImageView mImage;

        public ViewHolder(View v) {
            super(v);
            mTitle = v.findViewById(R.id.title);
            mText = v.findViewById(R.id.description);
            mImage = v.findViewById(R.id.image);
        }
    }

    public Adapter(Data data) {
        mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.mTitle.setText(mData.getTitle(position));

        /*
        * If you want cropped description in MainActivity just uncomment code block below
        * */

        //region BLOCK OF CODE
//        final int START_POSITION = 0;
//        final int TEXT_LENGTH = 100;
//        String text = mData.getText(position).substring(START_POSITION, START_POSITION + TEXT_LENGTH) + "...";
//        holder.mText.setText(text);
        //endregion

        int image = mData.getPicture(position);
        final Context context = holder.itemView.getContext();
        Drawable drawableImage = context.getDrawable(image);
        holder.mImage.setImageDrawable(drawableImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailedActivity.start(context,
                        mData.getTitle(position),
                        mData.getText(position),
                        mData.getPicture(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.getLength();
    }
}
