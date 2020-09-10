package cc.kostic.tabs;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager2.widget.ViewPager2;

public class Main1 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main1);
		ViewPager2 viewPager = findViewById(R.id.view_pager);
//		viewPager.setAdapter(sectionsPagerAdapter);

		TabLayout tabs = findViewById(R.id.tabs);
//		tabs.setupWithViewPager(viewPager);

		VpAdapter adapter = new VpAdapter(this, "patka");
		viewPager.setAdapter(adapter);

		new TabLayoutMediator(tabs, viewPager,
				new TabLayoutMediator.TabConfigurationStrategy() {
					@Override public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
						tab.setText("Tab " + (position + 1));
					}
				}).attach();
	}



}