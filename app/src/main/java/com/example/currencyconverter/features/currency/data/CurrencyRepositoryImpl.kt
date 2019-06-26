package com.example.currencyconverter.features.currency.data

import com.example.currencyconverter.features.currency.data.api.CurrencyApi
import com.example.currencyconverter.features.currency.domain.model.Currency
import com.example.currencyconverter.features.currency.domain.repository.CurrencyRepository
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class CurrencyRepositoryImpl(private val api: CurrencyApi?) : CurrencyRepository {
    override fun getCurrenciesFromNetwork(): Observable<List<Currency>> {
        return api!!.getCurrencies()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}