package com.easymorse.viewpager_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class MainActivity extends Activity {

	private ViewPager viewPager;
	
	private List<Map<?, ?>> list = new ArrayList<Map<?, ?>>();
	
	private MyViewPagerAdapter adapter;

	
	private MyHorizontalScrollView scrollView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initData();
		initView();
	}
	
	private void initView(){
		scrollView = (MyHorizontalScrollView) findViewById(R.id.scrollView);
		viewPager = (ViewPager) findViewById(R.id.viewpager);
		adapter = new MyViewPagerAdapter(this);
		viewPager.setAdapter(adapter);
		adapter.setData(list);
		
		viewPager.setCurrentItem(0);
		
		scrollView.setViewPager(viewPager);
		scrollView.setAnim(true);
		List<String> tits = new ArrayList<String>();
		for(Map<?, ?> map : list){
			tits.add(map.get("name").toString());
		}
		scrollView.setAllTitle(tits);
		
	}
	
	private void initData() {
		Map<Object,Object> map = new HashMap<Object,Object>();
		map.put("drawableId", R.drawable.a);
		map.put("name", "我是第一个");
		list.add(map);

		map = new HashMap<Object,Object>();
		map.put("drawableId", R.drawable.b);
		map.put("name", "我是第二个，我很长很长很长哼唱很长很长很长哼唱很长很长很长哼唱");
		list.add(map);

		map = new HashMap<Object,Object>();
		map.put("drawableId", R.drawable.c);
		map.put("name", "我是史蒂夫vsdfdfssd");
		list.add(map);

		map = new HashMap<Object,Object>();
		map.put("drawableId", R.drawable.d);
		map.put("name", "4");
		list.add(map);

		map = new HashMap<Object,Object>();
		map.put("drawableId", R.drawable.e);
		map.put("name", "5");
		list.add(map);
	}
	
	
	

}
