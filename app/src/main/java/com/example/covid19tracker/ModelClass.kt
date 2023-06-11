package com.example.covid19tracker

class ModelClass(
    var cases: String,
    var todayCases: String,
    var deaths: String,
    var recovered: String,
    var active: String,
    var country: String,
    var todayRecovered: String
) {

    // Getters
    fun getCases(): String {
        return cases
    }

    fun getTodayCases(): String {
        return todayCases
    }

    fun getDeaths(): String {
        return deaths
    }

    fun getRecovered(): String {
        return recovered
    }

    fun getActive(): String {
        return active
    }

    fun getCountry(): String {
        return country
    }

    fun getTodayRecovered(): String {
        return todayRecovered
    }

    // Setters
    fun setCases(cases: String) {
        this.cases = cases
    }

    fun setTodayCases(todayCases: String) {
        this.todayCases = todayCases
    }

    fun setDeaths(deaths: String) {
        this.deaths = deaths
    }

    fun setRecovered(recovered: String) {
        this.recovered = recovered
    }

    fun setActive(active: String) {
        this.active = active
    }

    fun setCountry(country: String) {
        this.country = country
    }

    fun setTodayRecovered(todayRecovered: String) {
        this.todayRecovered = todayRecovered
    }

}