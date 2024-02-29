package com.gunay.androidtestintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestTax {

    private lateinit var tax : Tax

    //activity'deki OnCreate gibi düşünülebilir test başlamadan önce yapılacak işlemler için kullanılır lateinit yapılan şeylerin initialize edilmesi gibi
    //her test oluşturulmadan öncece yapılacak işlemler yazılır
    //genelde bu fonksiyonun adı setup olur

    @Before
    fun setup(){
        tax = Tax()
    }

    //test bittikten sonra çalıştırılacak şey OnDestroy gibi düşünülebilir
    @After
    fun tearDown(){

    }

    //test yapılacak işlemler buraya yazılır
    @Test
    fun calculateTaxTest(){
        //val tax = Tax() // setupta tanımı ayarlanıyor
        val netTax = tax.calculateTax(100.0,0.1)
        //bu şu koşulu sağlıyomu bak yoksa hata ver ve benzeri işlemler için kullanılır
        //mesela burada 10'a eşitmi değilse hata ver kullanılıyor
        assertThat(netTax).isEqualTo(10)
    }

    //test yapılacak işlemler buraya yazılır
    @Test
    fun calculateIncomeTest(){
        //val tax = Tax() // setupta tanımı ayarlanıy
        val netTax = tax.calculateIncome(100.0,0.1)
        assertThat(netTax).isEqualTo(90)
    }

}