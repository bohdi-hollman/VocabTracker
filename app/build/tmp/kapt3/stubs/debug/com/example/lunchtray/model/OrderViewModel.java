package com.example.lunchtray.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u000e\u0010\'\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010(\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010)\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u000fJ\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0005H\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R\u000e\u0010#\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/lunchtray/model/OrderViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_count", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_greek", "Lcom/example/lunchtray/model/MenuItem;", "_hebrew", "_latin", "_percent", "_totcount", "count", "Landroidx/lifecycle/LiveData;", "", "getCount", "()Landroidx/lifecycle/LiveData;", "greek", "getGreek", "hebrew", "getHebrew", "latin", "getLatin", "menuItems", "", "getMenuItems", "()Ljava/util/Map;", "percent", "getPercent", "previousGreekNum", "previousHebrewNum", "previousLatinNum", "totcount", "getTotcount", "totcountact", "calculatePercent", "", "resetOrder", "setGreek", "setHebrew", "setLatin", "updateCount", "itemNum", "app_debug"})
public final class OrderViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.example.lunchtray.model.MenuItem> menuItems = null;
    private double previousHebrewNum = 0.0;
    private double previousGreekNum = 0.0;
    private double previousLatinNum = 0.0;
    private final double totcountact = 10.0;
    private final androidx.lifecycle.MutableLiveData<com.example.lunchtray.model.MenuItem> _hebrew = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> hebrew = null;
    private final androidx.lifecycle.MutableLiveData<com.example.lunchtray.model.MenuItem> _greek = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> greek = null;
    private final androidx.lifecycle.MutableLiveData<com.example.lunchtray.model.MenuItem> _latin = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> latin = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _count = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> count = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _percent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> percent = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _totcount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> totcount = null;
    
    public OrderViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.example.lunchtray.model.MenuItem> getMenuItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> getHebrew() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> getGreek() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> getLatin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPercent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTotcount() {
        return null;
    }
    
    /**
     * Set the hebrew for the order.
     */
    public final void setHebrew(@org.jetbrains.annotations.NotNull()
    java.lang.String hebrew) {
    }
    
    /**
     * Set the greek for the order.
     */
    public final void setGreek(@org.jetbrains.annotations.NotNull()
    java.lang.String greek) {
    }
    
    /**
     * Set the latin for the order.
     */
    public final void setLatin(@org.jetbrains.annotations.NotNull()
    java.lang.String latin) {
    }
    
    /**
     * Update count value.
     */
    private final void updateCount(double itemNum) {
    }
    
    /**
     * Calculate totcount and update percent.
     */
    public final void calculatePercent() {
    }
    
    /**
     * Reset all values pertaining to the order.
     */
    public final void resetOrder() {
    }
}