package cc.kostic.tabs.ui.main;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import cc.kostic.tabs.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentStateAdapter {

	@StringRes
	private static final int[] TAB_TITLES = new int[] {R.string.tab_text_1, R.string.tab_text_2};

	public SectionsPagerAdapter(FragmentActivity fm) {
		super(fm);
	}


	@NonNull
	@Override
	public Fragment createFragment(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a PlaceholderFragment (defined as a static inner class below).
		return PlaceholderFragment.newInstance(position + 1);
	}

/*

	@Nullable
	@Override
	public CharSequence getPageTitle(int position) {
		return mContext.getResources().getString(TAB_TITLES[position]);
	}

*/

	@Override
	public int getItemCount() {
		// Show 2 total pages.
		return 2;
	}
}