package kr.aleks.games.adapter;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kr.aleks.games.R;
import kr.aleks.games.dataConstr;

public class dataAdapter extends Adapter<dataHolder> {

    private List<dataConstr> mDataConstrs;

    public dataAdapter(List<dataConstr> dataConstrs) {
        this.mDataConstrs = dataConstrs;
    }

    @Override
    public dataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new dataHolder(v);
    }

    @Override
    public void onBindViewHolder(dataHolder holder, int position) {
        holder.image.setImageResource(mDataConstrs.get(position).getImage());
        holder.title.setText(mDataConstrs.get(position).getTitle());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                Fragment fragment=new Fragment();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataConstrs.size();
    }
}
