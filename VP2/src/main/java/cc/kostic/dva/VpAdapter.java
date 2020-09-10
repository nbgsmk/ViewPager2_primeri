package cc.kostic.dva;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VpAdapter extends FragmentStateAdapter {
	private static final int CARD_ITEM_SIZE = 5;

	public VpAdapter(@NonNull FragmentActivity fragmentActivity) {
		super(fragmentActivity);
	}

	@NonNull @Override public Fragment createFragment(int position) {
		return NekakavFragment.newInstance(position);
	}

	@Override public int getItemCount() {
		return CARD_ITEM_SIZE;
	}
}