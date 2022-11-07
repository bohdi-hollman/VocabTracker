package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSideMenuBindingImpl extends FragmentSideMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.side_options, 12);
        sViewsWithIds.put(R.id.textView2, 13);
        sViewsWithIds.put(R.id.divider, 14);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSideMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentSideMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[10]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[14]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[11]
            , (android.widget.RadioGroup) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.cancelButton.setTag(null);
        this.dikaioo.setTag(null);
        this.dikaiooDescription.setTag(null);
        this.hamartia.setTag(null);
        this.hamartiaDescription.setTag(null);
        this.kurios.setTag(null);
        this.kuriosDescription.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.subtotal.setTag(null);
        this.theopneustos.setTag(null);
        this.theopneustosDescription.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback11 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback8 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback12 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback10 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback9 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
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
        if (BR.sideMenuFragment == variableId) {
            setSideMenuFragment((com.example.lunchtray.ui.order.SideMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSideMenuFragment(@Nullable com.example.lunchtray.ui.order.SideMenuFragment SideMenuFragment) {
        this.mSideMenuFragment = SideMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.sideMenuFragment);
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
        java.lang.String viewModelMenuItemsKuriosName = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsTheopneustos = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsKurios = null;
        java.lang.String viewModelMenuItemsHamartiaName = null;
        com.example.lunchtray.ui.order.SideMenuFragment sideMenuFragment = mSideMenuFragment;
        java.lang.String viewModelMenuItemsTheopneustosName = null;
        java.lang.String viewModelMenuItemsDikaiooName = null;
        java.lang.String viewModelMenuItemsHamartiaDescription = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelCount = null;
        java.lang.String viewModelMenuItemsDikaiooDescription = null;
        java.lang.String viewModelMenuItemsKuriosDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsHamartia = null;
        java.lang.String viewModelCountGetValue = null;
        java.lang.String viewModelMenuItemsTheopneustosDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsDikaioo = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelCount = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                    }


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems["theopneustos"]
                        viewModelMenuItemsTheopneustos = viewModelMenuItems.get("theopneustos");
                        // read viewModel.menuItems["kurios"]
                        viewModelMenuItemsKurios = viewModelMenuItems.get("kurios");
                        // read viewModel.menuItems["hamartia"]
                        viewModelMenuItemsHamartia = viewModelMenuItems.get("hamartia");
                        // read viewModel.menuItems["dikaioo"]
                        viewModelMenuItemsDikaioo = viewModelMenuItems.get("dikaioo");
                    }


                    if (viewModelMenuItemsTheopneustos != null) {
                        // read viewModel.menuItems["theopneustos"].name
                        viewModelMenuItemsTheopneustosName = viewModelMenuItemsTheopneustos.getName();
                        // read viewModel.menuItems["theopneustos"].description
                        viewModelMenuItemsTheopneustosDescription = viewModelMenuItemsTheopneustos.getDescription();
                    }
                    if (viewModelMenuItemsKurios != null) {
                        // read viewModel.menuItems["kurios"].name
                        viewModelMenuItemsKuriosName = viewModelMenuItemsKurios.getName();
                        // read viewModel.menuItems["kurios"].description
                        viewModelMenuItemsKuriosDescription = viewModelMenuItemsKurios.getDescription();
                    }
                    if (viewModelMenuItemsHamartia != null) {
                        // read viewModel.menuItems["hamartia"].name
                        viewModelMenuItemsHamartiaName = viewModelMenuItemsHamartia.getName();
                        // read viewModel.menuItems["hamartia"].description
                        viewModelMenuItemsHamartiaDescription = viewModelMenuItemsHamartia.getDescription();
                    }
                    if (viewModelMenuItemsDikaioo != null) {
                        // read viewModel.menuItems["dikaioo"].name
                        viewModelMenuItemsDikaiooName = viewModelMenuItemsDikaioo.getName();
                        // read viewModel.menuItems["dikaioo"].description
                        viewModelMenuItemsDikaiooDescription = viewModelMenuItemsDikaioo.getDescription();
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

            this.cancelButton.setOnClickListener(mCallback12);
            this.dikaioo.setOnClickListener(mCallback10);
            this.hamartia.setOnClickListener(mCallback11);
            this.kurios.setOnClickListener(mCallback8);
            this.nextButton.setOnClickListener(mCallback13);
            this.theopneustos.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dikaioo, viewModelMenuItemsDikaiooName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dikaiooDescription, viewModelMenuItemsDikaiooDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hamartia, viewModelMenuItemsHamartiaName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hamartiaDescription, viewModelMenuItemsHamartiaDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.kurios, viewModelMenuItemsKuriosName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.kuriosDescription, viewModelMenuItemsKuriosDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.theopneustos, viewModelMenuItemsTheopneustosName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.theopneustosDescription, viewModelMenuItemsTheopneustosDescription);
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
            case 6: {
                // localize variables for thread safety
                // sideMenuFragment != null
                boolean sideMenuFragmentJavaLangObjectNull = false;
                // sideMenuFragment
                com.example.lunchtray.ui.order.SideMenuFragment sideMenuFragment = mSideMenuFragment;



                sideMenuFragmentJavaLangObjectNull = (sideMenuFragment) != (null);
                if (sideMenuFragmentJavaLangObjectNull) {


                    sideMenuFragment.goToNextScreen();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setGreek("hamartia");
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



                    viewModel.setGreek("kurios");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // sideMenuFragment != null
                boolean sideMenuFragmentJavaLangObjectNull = false;
                // sideMenuFragment
                com.example.lunchtray.ui.order.SideMenuFragment sideMenuFragment = mSideMenuFragment;



                sideMenuFragmentJavaLangObjectNull = (sideMenuFragment) != (null);
                if (sideMenuFragmentJavaLangObjectNull) {


                    sideMenuFragment.cancelOrder();
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



                    viewModel.setGreek("dikaioo");
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



                    viewModel.setGreek("theopneustos");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.count
        flag 1 (0x2L): sideMenuFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}