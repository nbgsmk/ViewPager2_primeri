package cc.kostic.tabs;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

	private MutableLiveData<Integer> mIndex = new MutableLiveData<>();

	private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
		@Override
		public String apply(Integer input) {
			return "Hello world from section: " + input + " " + mt2.getValue();
		}
	});

	private MutableLiveData<String> mt2 = new MutableLiveData<>();

	public void setIndex(int index) {
		mIndex.setValue(index);
	}

	public void setujTxt(String txt){
		mt2.setValue(txt);
	}

	public LiveData<String> getText() {
		return mText;
	}
}