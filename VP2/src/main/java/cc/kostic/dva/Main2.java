package cc.kostic.dva;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import androidx.viewpager2.widget.ViewPager2;

public class Main2 extends AppCompatActivity {

	TabLayout tabLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		if ( savedInstanceState == null ) {

		}


		ViewPager2 viewPager = findViewById(R.id.view_pager);
		tabLayout = findViewById(R.id.tabs);


		viewPager.setAdapter(createCardAdapter());
		new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
			@Override public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
				tab.setText("Tab " + (position + 1));
			}
		}).attach();
	}
	private ViewPagerAdapter createCardAdapter() {
		ViewPagerAdapter adapter = new ViewPagerAdapter(this);
		return adapter;
	}
}
