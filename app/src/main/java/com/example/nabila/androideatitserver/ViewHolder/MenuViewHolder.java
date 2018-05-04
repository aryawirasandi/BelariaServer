package com.example.nabila.androideatitserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nabila.androideatitserver.Common.Common;
import com.example.nabila.androideatitserver.R;
import com.example.nabila.androideatitserver.Interface.ItemClickListener;
public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnCreateContextMenuListener{

    public TextView txtMenuName;
    public ImageView imageView;

    private ItemClickListener ItemClickListener;


    public MenuViewHolder(View itemView) {
        super(itemView);

        txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
        imageView = (ImageView)itemView.findViewById(R.id.menu_image);

        itemView.setOnCreateContextMenuListener(this);
        itemView.setOnClickListener(this);


    }

    public void setItemClickListener(ItemClickListener ItemClickListener) {
        this.ItemClickListener = ItemClickListener;
    }

    @Override
    public void onClick(View view) {
        ItemClickListener.onClick(view,getAdapterPosition(),false);

    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Select the action");
        contextMenu.add(0,0,getAdapterPosition(), Common.UPDATE);
        contextMenu.add(0,0,getAdapterPosition(), Common.DELETE);
    }
}
