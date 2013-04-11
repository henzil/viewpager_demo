package com.easymorse.viewpager_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;

public class MainActivity extends Activity {

	private ViewPager viewPager;
	
	private PagerTabStrip pagetab;
	
	private List<Map<?, ?>> list = new ArrayList<Map<?, ?>>();
	
	private MyViewPagerAdapter adapter;
	
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
		adapter = new MyViewPagerAdapter(this);
		viewPager.setAdapter(adapter);
		adapter.setData(list);
		pagetab.setTabIndicatorColor(Color.BLUE);  // title下横线颜色值。
		pagetab.setDrawFullUnderline(false); //不显示整条横线。
		pagetab.setBackgroundColor(Color.RED); //背景
//		pagetab.setTextSpacing(10); //
		pagetab.setTextColor(Color.YELLOW);
		pagetab.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 24);//设置字体大小。
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
