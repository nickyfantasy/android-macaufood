package com.cycon.macaufood.activities;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;

import com.cycon.macaufood.R;

public class Home extends TabActivity {
	
	private static final String TAG = Home.class.getName();
	
	private TabHost tabHost;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        getWindow().setWindowAnimations(android.R.style.Animation);
        
//        checkLandscape();
        
        Log.e(TAG, "---onCreate");
    	
        tabHost = getTabHost();

        tabHost.addTab(tabHost.newTabSpec("tab1")
                .setIndicator(getResources().getString(R.string.tablabel1), 
                		getResources().getDrawable(R.drawable.tab1))
                .setContent(new Intent(this, Recommend.class)));
        
        tabHost.addTab(tabHost.newTabSpec("tab2")
                .setIndicator(getResources().getString(R.string.tablabel2), 
                		getResources().getDrawable(R.drawable.tab2))
                .setContent(new Intent(this, Coupon.class)));
        
        tabHost.addTab(tabHost.newTabSpec("tab3")
                .setIndicator(getResources().getString(R.string.tablabel3), 
                		getResources().getDrawable(R.drawable.tab3))
                .setContent(new Intent(this, Search.class)));
        
        tabHost.addTab(tabHost.newTabSpec("tab4")
                .setIndicator(getResources().getString(R.string.tablabel4), 
                		getResources().getDrawable(R.drawable.tab4))
                .setContent(new Intent(this, Map.class)));
        
        tabHost.addTab(tabHost.newTabSpec("tab5")
                .setIndicator(getResources().getString(R.string.tablabel5), 
                		getResources().getDrawable(R.drawable.tab5))
                .setContent(new Intent(this, Favorite.class)));
    }
    
    
    @Override
    protected void onStart() {
        Log.e(TAG, "---onStart");
    	super.onStart();
    }
    
    @Override
    protected void onResume() {
        Log.e(TAG, "---onResume");
    	super.onResume();
    }
    
    @Override
    protected void onPause() {
        Log.e(TAG, "---onPause");
    	super.onPause();
    }
    
    @Override
    protected void onStop() {
        Log.e(TAG, "---onStop");
    	super.onStop();
    }
    
    @Override
    protected void onDestroy() {
        Log.e(TAG, "---onDestroy");
    	super.onDestroy();
    }
    
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
    		ContextMenuInfo menuInfo) {
    	// TODO Auto-generated method stub
    	super.onCreateContextMenu(menu, v, menuInfo);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	return super.onOptionsItemSelected(item);
    }
    
    
}