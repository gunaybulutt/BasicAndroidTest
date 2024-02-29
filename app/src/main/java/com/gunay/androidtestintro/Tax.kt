package com.gunay.androidtestintro

class Tax {

    //TDD : Test Driven Development -> Test'e dayalı geliştirme
    //bütün programı yazdıktan sonra test yapmak tdd olmaz adım adım testleri yapmalısın yani geliştirme yaptıkça testler yapılmalı ve iki süreç iç içe gitmeli
    //hatta test'i önce yazarsan daha bile iyi olur Test - Development - Test - Development gidişatıyla
    //her @Test fun içinde bir tane assertThat() yapmaya özen göster daha fazla yapmamaya çalış daha fazlası yapılacaksa testleri böl başka @Test fun'ler içine oluştur

    fun calculateTax(grossIncome: Double, taxRate: Double): Double{
        return grossIncome * taxRate
    }

    fun calculateIncome(grossIncome: Double, taxRate: Double): Double{
        return grossIncome - (grossIncome * taxRate)
    }

}