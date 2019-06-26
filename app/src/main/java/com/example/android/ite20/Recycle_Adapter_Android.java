package com.example.android.ite20;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

class RecyclerViewHolder5 extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public TextView title5;
    public ImageView imag5;

    private ItemClickListener itemClickListener;


    public RecyclerViewHolder5(View itemView) {
        super(itemView);
        title5 = (TextView) itemView.findViewById(R.id.Android_text);
        imag5=(ImageView)itemView.findViewById(R.id.image_apps_Android);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {

        this.itemClickListener = itemClickListener;

    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);

    }

    @Override
    public boolean onLongClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), true);
        return true;
    }
}

public class Recycle_Adapter_Android extends RecyclerView.Adapter<RecyclerViewHolder5> {
    public Recycle_Adapter_Android(List<other_app_item> listdata11, Context context) {
        this.listdata11 = listdata11;
        this.context = context;
    }

    private List<other_app_item> listdata11;
    private Context context;

    @NonNull
    @Override
    public RecyclerViewHolder5 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.res_android, parent, false);
        return new RecyclerViewHolder5(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder5 holder, int position) {

        holder.title5.setText((listdata11.get(position).getTitle()));
        holder.imag5.setImageResource(listdata11.get(position).getImg());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (isLongClick) {
                    Toast.makeText(context,"isCliked",Toast.LENGTH_SHORT).show();

                }
                else {
                    if (position == 0) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://mutaz.net/free-programs/android-apps/download/?432"));
                        view.getContext().startActivity(intent);
                        Toast.makeText(context,"isCliked",Toast.LENGTH_SHORT).show();

                    }


                    if (position == 1) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://mutaz.net/free-programs/android-apps/download/?470"));
                        view.getContext().startActivity(intent);



                    }


                    if (position == 2) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://mutaz.net/free-programs/android-apps/download/?30"));
                        view.getContext().startActivity(intent);


                    }


                    if (position == 3) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://mi-drop.en.uptodown.com/android/download"));
                        view.getContext().startActivity(intent);

                    }

                    if (position == 4) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://apkpure.com/ar/sololearn-learn-to-code-for-free/com.sololearn"));
                        view.getContext().startActivity(intent);



                    }

                    if (position == 5) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://apkpure.co/cppdroid-cc-ide/"));
                        view.getContext().startActivity(intent);

                    }
                    if (position == 6) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://apkpure.co/dcoder-mobile-coding-platform/"));
                        view.getContext().startActivity(intent);

                    }


                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return listdata11.size();
    }
}


