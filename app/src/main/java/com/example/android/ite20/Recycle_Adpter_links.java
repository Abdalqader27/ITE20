package com.example.android.ite20;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

class RecyclerViewHolder3 extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public TextView Text;
    public ImageView ima;


    private ItemClickListener itemClickListener;


    public RecyclerViewHolder3(View itemView) {
        super(itemView);
        Text = (TextView) itemView.findViewById(R.id.text_id);
        ima =(ImageView)itemView.findViewById(R.id.imge_link) ;
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

class Recycle_Adapter_links extends RecyclerView.Adapter<RecyclerViewHolder3> {
    public Recycle_Adapter_links(List<other_app_item> listdata8, Context context) {
        this.listdata8 = listdata8;
        this.context = context;
    }

    private List<other_app_item> listdata8;
    private Context context;

    @NonNull
    @Override
    public RecyclerViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.resource_link_item, parent, false);
        return new RecyclerViewHolder3(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder3 holder, int position) {

        holder.Text.setText((listdata8.get(position)).getTitle());
        holder.ima.setImageResource(listdata8.get(position).getImg());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (isLongClick) {
                    Toast.makeText(context,"isCliked",Toast.LENGTH_SHORT).show();

                }
                else {
                    if (position == 0) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.facebook.com/groups/ITE.ALEP20/?ref=bookmarks"));
                        view.getContext().startActivity(intent);

                    }


                    if (position == 1) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.facebook.com/groups/382468675506814/"));
                        view.getContext().startActivity(intent);


                    }


                    if (position == 2) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.facebook.com/IEF.AdministrativeBoard/"));
                        view.getContext().startActivity(intent);

                    }


                    if (position == 3) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.facebook.com/BlueBitsTeam/"));
                        view.getContext().startActivity(intent);
                    }

                    if (position == 4) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://t.me/BlueBitsTeam"));
                        view.getContext().startActivity(intent);


                    }

                    if (position == 5) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://t.me/BlueBitsBot"));
                        view.getContext().startActivity(intent);
                    }
                    if (position == 6) {
                        Intent intent=new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.youtube.com/channel/UCjm7UBkOF-4mPn2GCBbMqQw"));
                        view.getContext().startActivity(intent);
                    }


                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return listdata8.size();
    }
}
