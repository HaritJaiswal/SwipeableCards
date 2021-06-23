package com.swipeable;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ListItem extends RecyclerView.ViewHolder {
  TextView textView;

  public ListItem(View itemView) {
    super(itemView);
    textView = itemView.findViewById(R.id.text);
  }

  public void bind(int i) {
    textView.setText(String.valueOf(i));
  }
}
