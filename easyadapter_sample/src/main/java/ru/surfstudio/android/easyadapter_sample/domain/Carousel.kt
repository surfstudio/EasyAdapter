package ru.surfstudio.android.easyadapter_sample.domain


data class Carousel(
        val id: String,
        val name: String,
        val elements: List<Element> = emptyList()
)