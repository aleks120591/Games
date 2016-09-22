package kr.aleks.games;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import kr.aleks.games.adapter.dataAdapter;

public class MainActivity extends AppCompatActivity {

    private List<dataConstr> mDataConstrs;
    private RecyclerView mRecyclerView;
    private dataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(llm);
        mRecyclerView.setHasFixedSize(true);

        initData();
        initAdapter();
    }

    private void initData() {
        mDataConstrs = new ArrayList<>();

        mDataConstrs.add(new dataConstr(Constants.TITLES[0], Constants.IMAGES[0]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[1], Constants.IMAGES[1]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[2], Constants.IMAGES[2]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[3], Constants.IMAGES[3]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[4], Constants.IMAGES[4]));

        mDataConstrs.add(new dataConstr(Constants.TITLES[5], Constants.IMAGES[5]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[6], Constants.IMAGES[6]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[7], Constants.IMAGES[7]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[8], Constants.IMAGES[8]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[9], Constants.IMAGES[9]));

        mDataConstrs.add(new dataConstr(Constants.TITLES[10], Constants.IMAGES[10]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[11], Constants.IMAGES[11]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[12], Constants.IMAGES[12]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[13], Constants.IMAGES[13]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[14], Constants.IMAGES[14]));

        mDataConstrs.add(new dataConstr(Constants.TITLES[15], Constants.IMAGES[15]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[16], Constants.IMAGES[16]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[17], Constants.IMAGES[17]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[18], Constants.IMAGES[18]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[19], Constants.IMAGES[19]));

        mDataConstrs.add(new dataConstr(Constants.TITLES[20], Constants.IMAGES[20]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[21], Constants.IMAGES[21]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[22], Constants.IMAGES[22]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[23], Constants.IMAGES[23]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[24], Constants.IMAGES[24]));

        mDataConstrs.add(new dataConstr(Constants.TITLES[25], Constants.IMAGES[25]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[26], Constants.IMAGES[26]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[27], Constants.IMAGES[27]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[28], Constants.IMAGES[28]));
        mDataConstrs.add(new dataConstr(Constants.TITLES[29], Constants.IMAGES[29]));
    }

    private void initAdapter() {
        mAdapter = new dataAdapter(mDataConstrs);
        mRecyclerView.setAdapter(mAdapter);
    }
}
