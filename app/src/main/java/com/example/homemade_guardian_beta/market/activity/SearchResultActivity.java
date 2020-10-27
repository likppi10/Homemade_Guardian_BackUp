package com.example.homemade_guardian_beta.market.activity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.homemade_guardian_beta.Main.activity.BasicActivity;
import com.example.homemade_guardian_beta.R;
import com.example.homemade_guardian_beta.market.fragment.SearchResultFragment;

//SearchActivity에서 버튼을 눌러 넘어 온 액티비티이다.
//      Ex) SearchResultFragment에서 Fragment를 이용하여 결과물을 출력한다. <-> SearchResultAdapter와 연결된다.

public class SearchResultActivity extends BasicActivity {
    private SearchResultFragment SearchResultFragment;  //SearchResultFragment를 통해 Fragment를 씀

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchresult);
        setToolbarTitle("검색 결과");
        String Search = getIntent().getStringExtra("search");

        // chatting area
        SearchResultFragment = SearchResultFragment.getInstance(Search);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.MyInfo_Post_Fragment, SearchResultFragment)
                .commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}