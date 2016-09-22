package kr.aleks.games.adapter;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import kr.aleks.games.R;
import kr.aleks.games.dataConstr;

public class dataHolder extends ViewHolder implements OnClickListener {

    private List<dataConstr> mConstr;
    private ItemClickListener itemClickListener;
    TextView title;
    ImageView image;

    public dataHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        title = (TextView) itemView.findViewById(R.id.struct_title);
        image = (ImageView) itemView.findViewById(R.id.struct_image);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(view, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener clickListener){
        this.itemClickListener = clickListener;
    }
}
