package com.example.currencyconverter.features.currency.presentation.presenter

import com.example.currencyconverter.features.BasePresenter
import com.example.currencyconverter.features.BaseView
import com.example.currencyconverter.features.currency.domain.model.Currency

interface CurrencyPresenter : BasePresenter {

    interface View: BaseView {
        fun showCurrentCurrencies(currencies: List<Currency>)
    }
}