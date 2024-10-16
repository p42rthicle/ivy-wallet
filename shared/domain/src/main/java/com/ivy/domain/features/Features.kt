package com.ivy.domain.features

interface Features {
    val compactTransactionsMode: BoolFeature
    val sortCategoriesAscending: BoolFeature
    val compactAccountsMode: BoolFeature
    val compactCategoriesMode: BoolFeature
    val showTitleSuggestions: BoolFeature
    val showCategorySearchBar: BoolFeature
    val hideTotalBalance: BoolFeature
    val showDecimalNumber: BoolFeature
    val standardKeypadLayout: BoolFeature

    val allFeatures: List<BoolFeature>
}
