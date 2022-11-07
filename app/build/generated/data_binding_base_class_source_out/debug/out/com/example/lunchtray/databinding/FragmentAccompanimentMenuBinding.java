// Generated by data binding compiler. Do not edit!
package com.example.lunchtray.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.lunchtray.R;
import com.example.lunchtray.model.OrderViewModel;
import com.example.lunchtray.ui.order.AccompanimentMenuFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAccompanimentMenuBinding extends ViewDataBinding {
  @NonNull
  public final RadioGroup accompanimentOptions;

  @NonNull
  public final CheckBox berries;

  @NonNull
  public final TextView berriesDescription;

  @NonNull
  public final CheckBox bread;

  @NonNull
  public final TextView breadDescription;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final View divider;

  @NonNull
  public final Button nextButton;

  @NonNull
  public final CheckBox pickles;

  @NonNull
  public final TextView picklesDescription;

  @NonNull
  public final TextView subtotal;

  @Bindable
  protected OrderViewModel mViewModel;

  @Bindable
  protected AccompanimentMenuFragment mAccompanimentMenuFragment;

  protected FragmentAccompanimentMenuBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RadioGroup accompanimentOptions, CheckBox berries,
      TextView berriesDescription, CheckBox bread, TextView breadDescription, Button cancelButton,
      View divider, Button nextButton, CheckBox pickles, TextView picklesDescription,
      TextView subtotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accompanimentOptions = accompanimentOptions;
    this.berries = berries;
    this.berriesDescription = berriesDescription;
    this.bread = bread;
    this.breadDescription = breadDescription;
    this.cancelButton = cancelButton;
    this.divider = divider;
    this.nextButton = nextButton;
    this.pickles = pickles;
    this.picklesDescription = picklesDescription;
    this.subtotal = subtotal;
  }

  public abstract void setViewModel(@Nullable OrderViewModel viewModel);

  @Nullable
  public OrderViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setAccompanimentMenuFragment(
      @Nullable AccompanimentMenuFragment accompanimentMenuFragment);

  @Nullable
  public AccompanimentMenuFragment getAccompanimentMenuFragment() {
    return mAccompanimentMenuFragment;
  }

  @NonNull
  public static FragmentAccompanimentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_accompaniment_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccompanimentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAccompanimentMenuBinding>inflateInternal(inflater, R.layout.fragment_accompaniment_menu, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAccompanimentMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_accompaniment_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccompanimentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAccompanimentMenuBinding>inflateInternal(inflater, R.layout.fragment_accompaniment_menu, null, false, component);
  }

  public static FragmentAccompanimentMenuBinding bind(@NonNull View view) {
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
  public static FragmentAccompanimentMenuBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentAccompanimentMenuBinding)bind(component, view, R.layout.fragment_accompaniment_menu);
  }
}
