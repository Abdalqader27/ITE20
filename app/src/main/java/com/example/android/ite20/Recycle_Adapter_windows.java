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

class RecyclerViewHolder4 extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public TextView title4;
    public ImageView imag4;

    private ItemClickListener itemClickListener;


    public RecyclerViewHolder4(View itemView) {
        super(itemView);
        title4 = (TextView) itemView.findViewById(R.id.windows_text);
        imag4=(ImageView)itemView.findViewById(R.id.image_apps_windows);
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

public class Recycle_Adapter_windows extends RecyclerView.Adapter<RecyclerViewHolder4> {
    public Recycle_Adapter_windows(List<other_app_item> listdata, Context context) {
        this.listdata = listdata;
        this.context = context;
    }

    private List<other_app_item> listdata;
    private Context context;

    @NonNull
    @Override
    public RecyclerViewHolder4 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.res_windows, parent, false);
        return new RecyclerViewHolder4(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder4 holder, int position) {

        holder.title4.setText((listdata.get(position).getTitle()));
        holder.imag4.setImageResource(listdata.get(position).getImg());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (isLongClick) {
                    Toast.makeText(context,"isCliked",Toast.LENGTH_SHORT).show();

                }
                else {
                    if (position == 0) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.mutaz.net/free-programs/download/?93"));
                        view.getContext().startActivity(intent);
                        Toast.makeText(context,"isCliked",Toast.LENGTH_SHORT).show();

                    }


                    if (position == 1) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://storekom.com/app/WCircuitDesignSuite"));
                        view.getContext().startActivity(intent);



                    }


                    if (position == 2) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://storekom.com/app/WJavaJDK64"));
                        view.getContext().startActivity(intent);


                    }


                    if (position == 3) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://storekom.com/app/WNetBeansIDE"));
                        view.getContext().startActivity(intent);

                    }

                    if (position == 4) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://storekom.com/app/WCodeBlocks"));
                        view.getContext().startActivity(intent);



                    }

                    if (position == 5) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://storekom.com/app.php?applink=WAndroidStudio"));
                        view.getContext().startActivity(intent);

                    }
                    if (position == 6) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.mutaz.net/free-programs/download/?987"));
                        view.getContext().startActivity(intent);

                    }


                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }
}

