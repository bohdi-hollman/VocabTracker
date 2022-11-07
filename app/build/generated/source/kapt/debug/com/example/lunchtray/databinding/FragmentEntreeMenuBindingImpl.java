package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEntreeMenuBindingImpl extends FragmentEntreeMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.entree_options, 12);
        sViewsWithIds.put(R.id.divider, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEntreeMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentEntreeMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[10]
            , (android.view.View) bindings[13]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.RadioGroup) bindings[12]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.TextView) bindings[6]
            );
        this.cancelButton.setTag(null);
        this.elohim.setTag(null);
        this.elohimDescription.setTag(null);
        this.kabad.setTag(null);
        this.kabadDescription.setTag(null);
        this.khesed.setTag(null);
        this.khesedDescription.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.subtotal.setTag(null);
        this.tsedeq.setTag(null);
        this.tsedeqDescription.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback15 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback19 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback16 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback14 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback18 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
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
        if (BR.entreeMenuFragment == variableId) {
            setEntreeMenuFragment((com.example.lunchtray.ui.order.EntreeMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEntreeMenuFragment(@Nullable com.example.lunchtray.ui.order.EntreeMenuFragment EntreeMenuFragment) {
        this.mEntreeMenuFragment = EntreeMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.entreeMenuFragment);
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
        java.lang.String viewModelMenuItemsKhesedDescription = null;
        java.lang.String viewModelMenuItemsElohimName = null;
        java.lang.String viewModelMenuItemsElohimDescription = null;
        java.lang.String viewModelMenuItemsTsedeqDescription = null;
        java.lang.String viewModelMenuItemsKabadDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsKabad = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsTsedeq = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelCount = null;
        java.lang.String viewModelMenuItemsKhesedName = null;
        java.lang.String viewModelCountGetValue = null;
        java.lang.String viewModelMenuItemsKabadName = null;
        com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsElohim = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelCount = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsKhesed = null;
        java.lang.String viewModelMenuItemsTsedeqName = null;

        if ((dirtyFlags & 0xdL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                    }


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems["kabad"]
                        viewModelMenuItemsKabad = viewModelMenuItems.get("kabad");
                        // read viewModel.menuItems["tsedeq"]
                        viewModelMenuItemsTsedeq = viewModelMenuItems.get("tsedeq");
                        // read viewModel.menuItems["elohim"]
                        viewModelMenuItemsElohim = viewModelMenuItems.get("elohim");
                        // read viewModel.menuItems["khesed"]
                        viewModelMenuItemsKhesed = viewModelMenuItems.get("khesed");
                    }


                    if (viewModelMenuItemsKabad != null) {
                        // read viewModel.menuItems["kabad"].description
                        viewModelMenuItemsKabadDescription = viewModelMenuItemsKabad.getDescription();
                        // read viewModel.menuItems["kabad"].name
                        viewModelMenuItemsKabadName = viewModelMenuItemsKabad.getName();
                    }
                    if (viewModelMenuItemsTsedeq != null) {
                        // read viewModel.menuItems["tsedeq"].description
                        viewModelMenuItemsTsedeqDescription = viewModelMenuItemsTsedeq.getDescription();
                        // read viewModel.menuItems["tsedeq"].name
                        viewModelMenuItemsTsedeqName = viewModelMenuItemsTsedeq.getName();
                    }
                    if (viewModelMenuItemsElohim != null) {
                        // read viewModel.menuItems["elohim"].name
                        viewModelMenuItemsElohimName = viewModelMenuItemsElohim.getName();
                        // read viewModel.menuItems["elohim"].description
                        viewModelMenuItemsElohimDescription = viewModelMenuItemsElohim.getDescription();
                    }
                    if (viewModelMenuItemsKhesed != null) {
                        // read viewModel.menuItems["khesed"].description
                        viewModelMenuItemsKhesedDescription = viewModelMenuItemsKhesed.getDescription();
                        // read viewModel.menuItems["khesed"].name
                        viewModelMenuItemsKhesedName = viewModelMenuItemsKhesed.getName();
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

            this.cancelButton.setOnClickListener(mCallback18);
            this.elohim.setOnClickListener(mCallback15);
            this.kabad.setOnClickListener(mCallback17);
            this.khesed.setOnClickListener(mCallback14);
            this.nextButton.setOnClickListener(mCallback19);
            this.tsedeq.setOnClickListener(mCallback16);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.elohim, viewModelMenuItemsElohimName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.elohimDescription, viewModelMenuItemsElohimDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.kabad, viewModelMenuItemsKabadName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.kabadDescription, viewModelMenuItemsKabadDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.khesed, viewModelMenuItemsKhesedName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.khesedDescription, viewModelMenuItemsKhesedDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tsedeq, viewModelMenuItemsTsedeqName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tsedeqDescription, viewModelMenuItemsTsedeqDescription);
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
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setHebrew("kabad");
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



                    viewModel.setHebrew("elohim");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // entreeMenuFragment
                com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // entreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.goToNextScreen();
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



                    viewModel.setHebrew("tsedeq");
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



                    viewModel.setHebrew("khesed");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // entreeMenuFragment
                com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // entreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.cancelOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.count
        flag 1 (0x2L): entreeMenuFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}