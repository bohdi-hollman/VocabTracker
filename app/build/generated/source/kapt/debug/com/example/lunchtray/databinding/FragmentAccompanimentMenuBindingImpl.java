package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccompanimentMenuBindingImpl extends FragmentAccompanimentMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.accompaniment_options, 10);
        sViewsWithIds.put(R.id.textView, 11);
        sViewsWithIds.put(R.id.divider, 12);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccompanimentMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentAccompanimentMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RadioGroup) bindings[10]
            , (android.widget.Button) bindings[8]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[12]
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Button) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            );
        this.cancelButton.setTag(null);
        this.deus.setTag(null);
        this.deusDescription.setTag(null);
        this.fide.setTag(null);
        this.fideDescription.setTag(null);
        this.gratia.setTag(null);
        this.gratiaDescription.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.accompanimentMenuFragment == variableId) {
            setAccompanimentMenuFragment((com.example.lunchtray.ui.order.AccompanimentMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAccompanimentMenuFragment(@Nullable com.example.lunchtray.ui.order.AccompanimentMenuFragment AccompanimentMenuFragment) {
        this.mAccompanimentMenuFragment = AccompanimentMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.accompanimentMenuFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCount((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCount(androidx.lifecycle.LiveData<java.lang.String> ViewModelCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelMenuItemsDeusDescription = null;
        com.example.lunchtray.ui.order.AccompanimentMenuFragment accompanimentMenuFragment = mAccompanimentMenuFragment;
        java.lang.String viewModelMenuItemsGratiaName = null;
        java.lang.String viewModelMenuItemsFideName = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsGratia = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelCount = null;
        java.lang.String viewModelMenuItemsDeusName = null;
        java.lang.String viewModelMenuItemsGratiaDescription = null;
        java.lang.String viewModelCountGetValue = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsDeus = null;
        java.lang.String viewModelMenuItemsFideDescription = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelCount = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsFide = null;

        if ((dirtyFlags & 0xdL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                    }


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems["gratia"]
                        viewModelMenuItemsGratia = viewModelMenuItems.get("gratia");
                        // read viewModel.menuItems["deus"]
                        viewModelMenuItemsDeus = viewModelMenuItems.get("deus");
                        // read viewModel.menuItems["fide"]
                        viewModelMenuItemsFide = viewModelMenuItems.get("fide");
                    }


                    if (viewModelMenuItemsGratia != null) {
                        // read viewModel.menuItems["gratia"].name
                        viewModelMenuItemsGratiaName = viewModelMenuItemsGratia.getName();
                        // read viewModel.menuItems["gratia"].description
                        viewModelMenuItemsGratiaDescription = viewModelMenuItemsGratia.getDescription();
                    }
                    if (viewModelMenuItemsDeus != null) {
                        // read viewModel.menuItems["deus"].description
                        viewModelMenuItemsDeusDescription = viewModelMenuItemsDeus.getDescription();
                        // read viewModel.menuItems["deus"].name
                        viewModelMenuItemsDeusName = viewModelMenuItemsDeus.getName();
                    }
                    if (viewModelMenuItemsFide != null) {
                        // read viewModel.menuItems["fide"].name
                        viewModelMenuItemsFideName = viewModelMenuItemsFide.getName();
                        // read viewModel.menuItems["fide"].description
                        viewModelMenuItemsFideDescription = viewModelMenuItemsFide.getDescription();
                    }
            }

                if (viewModel != null) {
                    // read viewModel.count
                    viewModelCount = viewModel.getCount();
                }
                updateLiveDataRegistration(0, viewModelCount);


                if (viewModelCount != null) {
                    // read viewModel.count.getValue()
                    viewModelCountGetValue = viewModelCount.getValue();
                }


                // read @android:string/subtotal
                subtotalAndroidStringSubtotalViewModelCount = subtotal.getResources().getString(R.string.subtotal, viewModelCountGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback4);
            this.deus.setOnClickListener(mCallback3);
            this.fide.setOnClickListener(mCallback1);
            this.gratia.setOnClickListener(mCallback2);
            this.nextButton.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deus, viewModelMenuItemsDeusName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deusDescription, viewModelMenuItemsDeusDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fide, viewModelMenuItemsFideName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fideDescription, viewModelMenuItemsFideDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gratia, viewModelMenuItemsGratiaName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gratiaDescription, viewModelMenuItemsGratiaDescription);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelCount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // accompanimentMenuFragment != null
                boolean accompanimentMenuFragmentJavaLangObjectNull = false;
                // accompanimentMenuFragment
                com.example.lunchtray.ui.order.AccompanimentMenuFragment accompanimentMenuFragment = mAccompanimentMenuFragment;



                accompanimentMenuFragmentJavaLangObjectNull = (accompanimentMenuFragment) != (null);
                if (accompanimentMenuFragmentJavaLangObjectNull) {


                    accompanimentMenuFragment.cancelOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setLatin("gratia");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // accompanimentMenuFragment != null
                boolean accompanimentMenuFragmentJavaLangObjectNull = false;
                // accompanimentMenuFragment
                com.example.lunchtray.ui.order.AccompanimentMenuFragment accompanimentMenuFragment = mAccompanimentMenuFragment;



                accompanimentMenuFragmentJavaLangObjectNull = (accompanimentMenuFragment) != (null);
                if (accompanimentMenuFragmentJavaLangObjectNull) {


                    accompanimentMenuFragment.goToNextScreen();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setLatin("gratia");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setLatin("fide");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.count
        flag 1 (0x2L): accompanimentMenuFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}