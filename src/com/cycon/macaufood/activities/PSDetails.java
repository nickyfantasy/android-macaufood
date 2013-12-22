package com.cycon.macaufood.activities;

import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import android.os.Bundle;

import com.cycon.macaufood.R;
import com.cycon.macaufood.adapters.PSFriendsActivityAdapter;
import com.cycon.macaufood.bean.ParsedPSHolder;
import com.cycon.macaufood.utilities.MFConfig;

public class PSDetails extends BaseActivity {
	
	private StickyListHeadersListView mFriendsActivityListView;
	private PSFriendsActivityAdapter mFriendsActivityAdapter;
	private List<String> mFriendsActivityInfo = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ps_detail);
		
		int pos = getIntent().getIntExtra("ps_hot_position", 0);
		String psHotId = MFConfig.getInstance().getPsHotList().get(pos);
		ParsedPSHolder psHotInfo =  MFConfig.getInstance().getPsInfoMap().get(psHotId);
		String title = psHotInfo.getCaption();
		if (title.trim().length() == 0 || title.equals("(null)")) title = getString(R.string.psHot);
		setTitle(title);
		
		mFriendsActivityInfo.add(psHotId);
		mFriendsActivityListView = (StickyListHeadersListView) findViewById(R.id.friendsActivityListView);
		mFriendsActivityAdapter = new PSFriendsActivityAdapter(this, mFriendsActivityInfo);
		mFriendsActivityListView.setAdapter(mFriendsActivityAdapter);
	}
	
}