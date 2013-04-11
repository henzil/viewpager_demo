package com.easymorse.viewpager_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;

public class MainActivity extends Activity {

	private ViewPager viewPager;
	
	private PagerTabStrip pagetab;
	
	private List<Map<?, ?>> list = new ArrayList<Map<?, ?>>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initData();
		initView();
	}
	
	private void initView(){
		viewPager = (ViewPager) findViewById(R.id.viewpager);
		pagetab = (PagerTabStrip) findViewById(R.id.pagetab);
		
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
		map.put("name", "我是史蒂夫vsdfdfssd曹磊");
		list.add(map);

		map = new HashMap<Object,Object>();
		map.put("drawableId", R.drawable.d);
		map.put("name", "我是曹磊我是曹磊我是曹磊");
		list.add(map);

		map = new HashMap<Object,Object>();
		map.put("drawableId", R.drawable.e);
		map.put("name", "我是曹磊我是曹磊我是曹磊");
		list.add(map);
	}

}
