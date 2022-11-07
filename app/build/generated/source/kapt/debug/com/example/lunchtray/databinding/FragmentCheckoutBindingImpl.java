package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 6);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.submitButton.setTag(null);
        this.subtotal.setTag(null);
        this.tax.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.checkoutFragment == variableId) {
            setCheckoutFragment((com.example.lunchtray.ui.order.CheckoutFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckoutFragment(@Nullable com.example.lunchtray.ui.order.CheckoutFragment CheckoutFragment) {
        this.mCheckoutFragment = CheckoutFragment;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.checkoutFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCount((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelTotcount((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPercent((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
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
    private boolean onChangeViewModelTotcount(androidx.lifecycle.LiveData<java.lang.String> ViewModelTotcount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPercent(androidx.lifecycle.LiveData<java.lang.String> ViewModelPercent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.lifecycle.LiveData<java.lang.String> viewModelCount = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotcount = null;
        java.lang.String taxAndroidStringTaxViewModelTotcount = null;
        com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
        java.lang.String viewModelCountGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelPercent = null;
        java.lang.String viewModelPercentGetValue = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelCount = null;
        java.lang.String totalAndroidStringTotalViewModelPercent = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelTotcountGetValue = null;

        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

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
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.totcount
                        viewModelTotcount = viewModel.getTotcount();
                    }
                    updateLiveDataRegistration(1, viewModelTotcount);


                    if (viewModelTotcount != null) {
                        // read viewModel.totcount.getValue()
                        viewModelTotcountGetValue = viewModelTotcount.getValue();
                    }


                    // read @android:string/tax
                    taxAndroidStringTaxViewModelTotcount = tax.getResources().getString(R.string.tax, viewModelTotcountGetValue);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.percent
                        viewModelPercent = viewModel.getPercent();
                    }
                    updateLiveDataRegistration(2, viewModelPercent);


                    if (viewModelPercent != null) {
                        // read viewModel.percent.getValue()
                        viewModelPercentGetValue = viewModelPercent.getValue();
                    }


                    // read @android:string/total
                    totalAndroidStringTotalViewModelPercent = total.getResources().getString(R.string.total, viewModelPercentGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback7);
            this.submitButton.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelCount);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tax, taxAndroidStringTaxViewModelTotcount);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalViewModelPercent);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // checkoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;
                // checkoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.cancelOrder();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // checkoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;
                // checkoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.submitOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.count
        flag 1 (0x2L): viewModel.totcount
        flag 2 (0x3L): viewModel.percent
        flag 3 (0x4L): checkoutFragment
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}