package com.example.android.ite20;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static android.view.View.*;

class RecyclerViewHolder2 extends ViewHolder implements OnClickListener, OnLongClickListener {
    public TextView title;
    public ImageView imag;

    private ItemClickListener itemClickListener;


    public RecyclerViewHolder2(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.Text_other_app);
        imag=(ImageView)itemView.findViewById(R.id.image_other_app);
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

public class Recycle_Adapter_other_app extends RecyclerView.Adapter<RecyclerViewHolder2> {
    public Recycle_Adapter_other_app(List<other_app_item> listdata, Context context) {
        this.listdata = listdata;
        this.context = context;
    }

    private List<other_app_item> listdata;
    private Context context;

    @NonNull
    @Override
    public RecyclerViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.other_app_resourse, parent, false);
        return new RecyclerViewHolder2(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder2 holder, int position) {

        holder.title.setText((listdata.get(position).getTitle()));
        holder.imag.setImageResource(listdata.get(position).getImg());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (isLongClick) {
                    Toast.makeText(context,"isCliked",Toast.LENGTH_SHORT).show();

                }
                else {
                    if (position == 0) {
                       Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PLJLG79A3JzbIg6Oe8LU_ymHel9ioD3VgR"));
                        view.getContext().startActivity(intent);

                    }


                    if (position == 1) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PLJLG79A3JzbItly_4DNg6Cm4lcGwjWeze"));
                        view.getContext().startActivity(intent);



                    }


                    if (position == 2) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://youtu.be/xkUYnFkAPxw"));
                        view.getContext().startActivity(intent);


                    }


                    if (position == 3) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PLF8OvnCBlEY1lalnvdYmz4O_x7wII8NiI"));
                        view.getContext().startActivity(intent);

                    }

                    if (position == 4) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PLCInYL3l2Aaiq1oLvi9TlWtArJyAuCVow"));
                        view.getContext().startActivity(intent);



                    }

                    if (position == 5) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PLF8OvnCBlEY0UEgX-PDJduL5Tyv4Estam"));
                        view.getContext().startActivity(intent);

                    }
                    if (position == 6) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PLF8OvnCBlEY3e0Yg990aAXreEru72_xWN"));
                        view.getContext().startActivity(intent);

                    }  if (position == 7) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.youtube.com/playlist?list=PLF8OvnCBlEY2w-zdVPozupapiKzLzpyUZ"));
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
