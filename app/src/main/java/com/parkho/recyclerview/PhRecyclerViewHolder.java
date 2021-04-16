package com.parkho.recyclerview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.parkho.recyclerview.PhRecyclerViewAdapter.OnItemLongClickEventListener;

public class PhRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {

    TextView tvName;
    ImageView ivIcon;

    public PhRecyclerViewHolder(View a_itemView, final OnItemLongClickEventListener a_itemLongClickListener) {
        super(a_itemView);

        a_itemView.setOnCreateContextMenuListener(this);

        // long Click event
        a_itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View a_view) {
                final int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    a_itemLongClickListener.onItemLongClick(position);
                }

                return false;
            }
        });

        tvName = a_itemView.findViewById(R.id.tv_name);
        ivIcon = a_itemView.findViewById(R.id.iv_icon);
    }

    @Override
    public void onCreateContextMenu(ContextMenu a_menu, View a_view, ContextMenuInfo a_menuInfo) {
        ((Activity) a_view.getContext()).getMenuInflater().inflate(R.menu.main_list_menu, a_menu);
    }
}