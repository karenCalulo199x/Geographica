package com.kcals.geographica.model

data class Country(
    val name: Name,
    val tld: List<String>,
    val cca2: String,
    val ccn3: String,
    val cca3: String,
    val independent: Boolean,
    val status: String,
    val unMember: Boolean,
    val currencies: Map<String, Currency>,
    val idd: Idd,
    val capital: List<String>,
    val altSpellings: List<String>,
    val region: String,
    val subregion: String?,
    val languages: Map<String, String>,
    val translations: Map<String, Translation>,
    val latlng: List<Double>,
    val landlocked: Boolean,
    val area: Double,
    val demonyms: Demonyms,
    val flag: String,
    val maps: Maps,
    val population: Int,
    val car: Car,
    val timezones: List<String>,
    val continents: List<String>,
    val flags: FlagUrls,
    val coatOfArms: CoatOfArms?,
    val startOfWeek: String,
    val capitalInfo: CapitalInfo
)

data class Name(
    val common: String,
    val official: String,
    val nativeName: Map<String, NativeName>
)

data class NativeName(
    val official: String,
    val common: String
)

data class Currency(
    val name: String,
    val symbol: String
)

data class Idd(
    val root: String,
    val suffixes: List<String>
)

data class Translation(
    val official: String,
    val common: String
)

data class Demonyms(
    val eng: Demonym
)

data class Demonym(
    val f: String,
    val m: String
)

data class Maps(
    val googleMaps: String,
    val openStreetMaps: String
)

data class Car(
    val signs: List<String>,
    val side: String
)

data class FlagUrls(
    val png: String,
    val svg: String
)

data class CoatOfArms(
    val png: String?,
    val svg: String?
)

data class CapitalInfo(
    val latlng: List<Double>
)
