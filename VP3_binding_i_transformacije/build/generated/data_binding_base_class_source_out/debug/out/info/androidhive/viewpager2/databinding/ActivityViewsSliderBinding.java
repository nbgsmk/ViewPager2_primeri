// Generated by data binding compiler. Do not edit!
package info.androidhive.viewpager2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import info.androidhive.viewpager2.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityViewsSliderBinding extends ViewDataBinding {
  @NonNull
  public final Button btnNext;

  @NonNull
  public final Button btnSkip;

  @NonNull
  public final ImageView iconMore;

  @NonNull
  public final LinearLayout layoutDots;

  @NonNull
  public final ViewPager2 viewPager;

  protected ActivityViewsSliderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnNext, Button btnSkip, ImageView iconMore, LinearLayout layoutDots,
      ViewPager2 viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNext = btnNext;
    this.btnSkip = btnSkip;
    this.iconMore = iconMore;
    this.layoutDots = layoutDots;
    this.viewPager = viewPager;
  }

  @NonNull
  public static ActivityViewsSliderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_views_slider, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityViewsSliderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityViewsSliderBinding>inflateInternal(inflater, R.layout.activity_views_slider, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityViewsSliderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_views_slider, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityViewsSliderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityViewsSliderBinding>inflateInternal(inflater, R.layout.activity_views_slider, null, false, component);
  }

  public static ActivityViewsSliderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityViewsSliderBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityViewsSliderBinding)bind(component, view, R.layout.activity_views_slider);
  }
}
