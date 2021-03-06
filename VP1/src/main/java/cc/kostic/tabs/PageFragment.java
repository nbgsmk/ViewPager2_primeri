package cc.kostic.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

/**
 * A placeholder fragment containing a simple view.
 */
public class PageFragment extends Fragment {

	private static final String ARG_SECTION_NUMBER = "section_number";
	private static final String ARG_PATKA = "patka";

	private PageViewModel pageViewModel;

	public static PageFragment newInstance(int index, String patka) {
		PageFragment fragment = new PageFragment();
		Bundle bundle = new Bundle();
		bundle.putInt(ARG_SECTION_NUMBER, index);
		bundle.putString(ARG_PATKA, patka);
		fragment.setArguments(bundle);
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
		int index = 1;
		if ( getArguments() != null ) {
			index = getArguments().getInt(ARG_SECTION_NUMBER);
		}
		pageViewModel.setIndex(index);
		pageViewModel.setujTxt(getArguments().getString(ARG_PATKA));

	}

	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_main, container, false);
		final TextView textView = root.findViewById(R.id.section_label);
		pageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
			@Override
			public void onChanged(@Nullable String s) {
				textView.setText(s);
			}
		});
		return root;
	}
}