package sg.edu.np.mad.mad_recyclerview;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView txt;
    CheckBox checkBox;
    OnItemListener onItemListener;

    public ItemViewHolder(View itemView, OnItemListener onItemListener) {
        super(itemView);
        txt = itemView.findViewById(R.id.textView1);
        checkBox = itemView.findViewById(R.id.checkBox);
        this.onItemListener = onItemListener;

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onItemListener.deleteItem(getAdapterPosition());
    }

    public interface OnItemListener{
        void deleteItem(int position);
    }
}