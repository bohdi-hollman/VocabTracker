/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.lunchtray.data.DataSource
import java.text.NumberFormat

class OrderViewModel : ViewModel() {

    // Map of menu items
    val menuItems = DataSource.menuItems

    // Default values for item prices
    private var previousHebrewNum = 0.0
    private var previousGreekNum = 0.0
    private var previousLatinNum = 0.0

    // Default totcountact
    private val totcountact = 10.00

    // hebrew for the order
    private val _hebrew = MutableLiveData<MenuItem?>()
    val hebrew: LiveData<MenuItem?> = _hebrew

    // greek for the order
    private val _greek = MutableLiveData<MenuItem?>()
    val greek: LiveData<MenuItem?> = _greek

    // latin for the order.
    private val _latin = MutableLiveData<MenuItem?>()
    val latin: LiveData<MenuItem?> = _latin

    // count for the order
    private val _count = MutableLiveData(0.0)
    val count: LiveData<String> = Transformations.map(_count) {
        NumberFormat.getNumberInstance().format(it)
    }

    // percent cost of the order
    private val _percent = MutableLiveData(0.0)
    val percent: LiveData<String> = Transformations.map(_percent) {
        NumberFormat.getPercentInstance().format(it)
    }

    // totcount for the order
    private val _totcount = MutableLiveData(0.0)
    val totcount: LiveData<String> = Transformations.map(_totcount) {
        NumberFormat.getNumberInstance().format(it)
    }

    /**
     * Set the hebrew for the order.
     */
    fun setHebrew(hebrew: String) {

        if(_hebrew.value != null) {
            previousHebrewNum= _hebrew.value!!.num

        }

        _hebrew.value = menuItems.get(hebrew)
        updateCount(_hebrew.value!!.num
        )
    }

    /**
     * Set the greek for the order.
     */
    fun setGreek(greek: String) {


        if (_greek.value != null){
            previousGreekNum= _greek.value!!.num

        }

        _greek.value = menuItems.get(greek)
        updateCount(_greek.value!!.num
        )
    }

    /**
     * Set the latin for the order.
     */
    fun setLatin(latin: String) {


        if (_latin.value != null){
            previousLatinNum = _latin.value!!.num

        }

        _latin.value = menuItems.get(latin)
        updateCount(_latin.value!!.num
        )
    }

    /**
     * Update count value.
     */
    private fun updateCount(itemNum: Double) {

        if (_count.value != null){
            _count.value = (_count.value)?.plus(itemNum)
        }else{
            _count.value = itemNum
        }
        calculatePercent()
    }

    /**
     * Calculate totcount and update percent.
     */
    fun calculatePercent() {
        _percent.value = (_count.value)?.div(totcountact!!)
    }

    /**
     * Reset all values pertaining to the order.
     */
    fun resetOrder() {

        previousHebrewNum= 0.0
        previousGreekNum= 0.0
        previousLatinNum = 0.0
        _hebrew.value = null
        _greek.value = null
        _latin.value = null
        _count.value = 0.0
        _percent.value = 0.0
        _totcount.value = 0.0
    }
}
