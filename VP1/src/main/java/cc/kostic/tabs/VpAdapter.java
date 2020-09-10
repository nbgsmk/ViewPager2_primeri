package cc.kostic.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class VpAdapter extends FragmentStateAdapter {

	@StringRes
	private static final int[] TAB_TITLES = new int[] {R.string.tab_text_1, R.string.tab_text_2};
	private String patka;

	public VpAdapter(FragmentActivity fa, String patka) {
		super(fa);
		this.patka = patka;
	}


	@NonNull
	@Override
	public Fragment createFragment(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a PageFragment (defined as a static inner class below).
		return PageFragment.newInstance(position + 1, patka);
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