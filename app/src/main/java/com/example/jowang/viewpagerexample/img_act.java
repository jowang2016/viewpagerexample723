package com.example.jowang.viewpagerexample;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by jowang on 16/7/23.
 */
public class img_act extends PagerAdapter{
    private int[] img_count=new int[]{R.drawable.tu2,R.drawable.tu3,R.drawable.tu4};
    private Context context;
    private LayoutInflater layoutInflater;
    private TextView textView;
    private ImageView imageView;

    public img_act(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return img_count.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view=layoutInflater.inflate(R.layout.img_layout,container,false);
        imageView=(ImageView)item_view.findViewById(R.id.image);
        textView=(TextView)item_view.findViewById(R.id.text);
        imageView.setImageResource(img_count[position]);
        textView.setText("image: "+position);
        container.addView(item_view);


        return item_view;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((LinearLayout)object);
    }
}
