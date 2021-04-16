package com.parkho.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PhMainActivity extends AppCompatActivity {

    // List item 생성
    private List<PhRecyclerItem> mItemList = new ArrayList<>();

    // Recycler view adapter
    private PhRecyclerViewAdapter mRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // List 설정
        bindList();
    }

    @Override
    public boolean onContextItemSelected(MenuItem a_item) {
        final int position = mRecyclerAdapter.getPosition();
        final PhRecyclerItem item = (PhRecyclerItem) mItemList.get(position);

        switch (a_item.getItemId()) {
            case R.id.action_insert:
                Toast.makeText(this, item.getName() + " " + getString(R.string.insert), Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_delete:
                Toast.makeText(this, item.getName() + " " + getString(R.string.delete), Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_modify:
                Toast.makeText(this, item.getName() + " " + getString(R.string.modify), Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_info:
                Toast.makeText(this, item.getName() + " " + getString(R.string.info), Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }

        return true;
    }

    /**
     * List 설정
     */
    private void bindList() {
        // List item 생성
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f600, "emoji_u1f600"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f601, "emoji_u1f601"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f602, "emoji_u1f602"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f603, "emoji_u1f603"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f604, "emoji_u1f604"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f605, "emoji_u1f605"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f606, "emoji_u1f606"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f607, "emoji_u1f607"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f608, "emoji_u1f608"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f609, "emoji_u1f609"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f610, "emoji_u1f610"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f611, "emoji_u1f611"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f612, "emoji_u1f612"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f613, "emoji_u1f613"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f614, "emoji_u1f614"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f615, "emoji_u1f615"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f616, "emoji_u1f616"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f617, "emoji_u1f617"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f618, "emoji_u1f618"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f619, "emoji_u1f619"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f620, "emoji_u1f620"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f621, "emoji_u1f621"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f622, "emoji_u1f622"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f623, "emoji_u1f623"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f624, "emoji_u1f624"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f625, "emoji_u1f625"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f626, "emoji_u1f626"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f627, "emoji_u1f627"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f628, "emoji_u1f628"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f629, "emoji_u1f629"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f630, "emoji_u1f630"));
        mItemList.add(new PhRecyclerItem(R.drawable.emoji_u1f631, "emoji_u1f631"));

        // Recycler view
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        // Recycler view adapter
        mRecyclerAdapter = new PhRecyclerViewAdapter(mItemList);
        recyclerView.setAdapter(mRecyclerAdapter);

        // Layout manager 추가
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}