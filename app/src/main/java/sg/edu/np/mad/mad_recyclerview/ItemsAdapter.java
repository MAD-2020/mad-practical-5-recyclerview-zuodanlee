package sg.edu.np.mad.mad_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemsAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private ArrayList<Item> toDoList;
    private ItemViewHolder.OnItemListener mOnItemListener;

    public ItemsAdapter(ArrayList<Item> item, ItemViewHolder.OnItemListener onItemListener) {
        this.toDoList = item;
        this.mOnItemListener = onItemListener;
    }

    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new ItemViewHolder(view, mOnItemListener);
    }

    public void onBindViewHolder(ItemViewHolder holder, int position) {
        final Item listItem = toDoList.get(position);
        holder.txt.setText(listItem.getItemString());
        holder.checkBox.setChecked(listItem.isChecked());
    }

    public int getItemCount() {
        return toDoList.size();
    }
}