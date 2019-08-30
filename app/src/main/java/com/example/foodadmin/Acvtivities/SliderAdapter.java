package com.example.foodadmin.Acvtivities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodadmin.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterVH> {

    private Context context;
    private int count;

    public SliderAdapter(Context context, int count) {
        this.context = context;
        this.count=count;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.slideritem,parent, false);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {


        switch (position) {
            case 0:

                viewHolder.sliderimageview.setImageResource(R.drawable.popcorn);
                viewHolder.slidertextview.setText("I get way too much happiness from good food" );

                break;
            case 1:
                viewHolder.sliderimageview.setImageResource(R.drawable.diet);
                viewHolder.slidertextview.setText("Good food is good mood" );
                break;
            case 2:
                viewHolder.sliderimageview.setImageResource(R.drawable.fried);
                viewHolder.slidertextview.setText("Happiness is homemade" );
                break;
            default:
                viewHolder.sliderimageview.setImageResource(R.drawable.cheers);
                viewHolder.slidertextview.setText("There is no sincere love than the love of food" );

                break;

        }


    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 4;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        ImageView sliderimageview;
        TextView slidertextview;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            sliderimageview = itemView.findViewById(R.id.sliderimageview);
            slidertextview = itemView.findViewById(R.id.slidertextview);
        }
    }
}