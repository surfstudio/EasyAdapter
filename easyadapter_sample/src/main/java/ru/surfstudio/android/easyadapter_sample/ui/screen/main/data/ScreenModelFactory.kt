package ru.surfstudio.android.easyadapter_sample.ui.screen.main.data

import ru.surfstudio.android.easyadapter_sample.domain.Carousel
import ru.surfstudio.android.easyadapter_sample.interactor.element.Elements


class ScreenModelFactory {
    private val CAROUSELS = arrayListOf(
            Carousel("aaa", "Sed condimentum"),
            Carousel("bbb", "Etiam mollis"),
            Carousel("ccc", "Blandit dolor"),
            Carousel("ddd", "Morbi ipsum"))

    private val ELEMENTS = Elements.all

    private val models: List<MainScreenModel>
    private var current = 0

    init {
        models = arrayListOf(firstModel(), secondModel(), thirdModel(), fourthModel(), fifthModel(), sixthModel())
    }

    fun next(): MainScreenModel {
        current++
        return models[current % models.size]
    }

    private fun firstModel(): MainScreenModel {
        return MainScreenModel(
                carousels = arrayListOf(
                        CAROUSELS[0].copy(elements = arrayListOf(
                                ELEMENTS[0],
                                ELEMENTS[1],
                                ELEMENTS[2],
                                ELEMENTS[3],
                                ELEMENTS[4],
                                ELEMENTS[5],
                                ELEMENTS[6],
                                ELEMENTS[7],
                                ELEMENTS[8])),
                        CAROUSELS[1].copy(elements = arrayListOf(
                                ELEMENTS[12],
                                ELEMENTS[22],
                                ELEMENTS[3],
                                ELEMENTS[7],
                                ELEMENTS[11],
                                ELEMENTS[12],
                                ELEMENTS[6],
                                ELEMENTS[1],
                                ELEMENTS[15]))),
                hasCommercial = false,
                elements = arrayListOf(
                        ELEMENTS[21],
                        ELEMENTS[23],
                        ELEMENTS[19],
                        ELEMENTS[14],
                        ELEMENTS[10]),
                bottomCarousel = null)
    }

    private fun secondModel(): MainScreenModel {
        return MainScreenModel(
                carousels = arrayListOf(
                        CAROUSELS[1].copy(elements = arrayListOf(
                                ELEMENTS[10],
                                ELEMENTS[3],
                                ELEMENTS[22],
                                ELEMENTS[7],
                                ELEMENTS[11],
                                ELEMENTS[12],
                                ELEMENTS[6],
                                ELEMENTS[1],
                                ELEMENTS[15]))),
                hasCommercial = true,
                elements = arrayListOf(
                        ELEMENTS[21],
                        ELEMENTS[23],
                        ELEMENTS[19],
                        ELEMENTS[14],
                        ELEMENTS[10]),
                bottomCarousel = null)
    }

    private fun thirdModel(): MainScreenModel {
        return MainScreenModel(
                carousels = arrayListOf(
                        CAROUSELS[1].copy(elements = arrayListOf(
                                ELEMENTS[3],
                                ELEMENTS[22],
                                ELEMENTS[7],
                                ELEMENTS[10],
                                ELEMENTS[11],
                                ELEMENTS[12],
                                ELEMENTS[6],
                                ELEMENTS[1],
                                ELEMENTS[15]))),
                hasCommercial = false,
                elements = arrayListOf(
                        ELEMENTS[20],
                        ELEMENTS[17],
                        ELEMENTS[19],
                        ELEMENTS[13],
                        ELEMENTS[10]),
                bottomCarousel = CAROUSELS[3].copy(
                        elements = arrayListOf(
                                ELEMENTS[12],
                                ELEMENTS[22],
                                ELEMENTS[3],
                                ELEMENTS[7],
                                ELEMENTS[11],
                                ELEMENTS[12],
                                ELEMENTS[6],
                                ELEMENTS[1],
                                ELEMENTS[15])))
    }

    private fun fourthModel(): MainScreenModel {
        return MainScreenModel(
                carousels = arrayListOf(
                        CAROUSELS[1].copy(elements = arrayListOf(
                                ELEMENTS[17],
                                ELEMENTS[3],
                                ELEMENTS[7],
                                ELEMENTS[11],
                                ELEMENTS[10],
                                ELEMENTS[12],
                                ELEMENTS[6],
                                ELEMENTS[1],
                                ELEMENTS[15])),
                        CAROUSELS[0].copy(elements = arrayListOf(
                                ELEMENTS[1],
                                ELEMENTS[4],
                                ELEMENTS[12],
                                ELEMENTS[2],
                                ELEMENTS[16],
                                ELEMENTS[5],
                                ELEMENTS[6],
                                ELEMENTS[7],
                                ELEMENTS[8]))),
                hasCommercial = true,
                elements = arrayListOf(
                        ELEMENTS[19],
                        ELEMENTS[16],
                        ELEMENTS[17],
                        ELEMENTS[0],
                        ELEMENTS[23],
                        ELEMENTS[10]),
                bottomCarousel = null)
    }

    private fun fifthModel(): MainScreenModel {
        return MainScreenModel(
                carousels = arrayListOf(
                        CAROUSELS[0].copy(elements = arrayListOf(
                                ELEMENTS[1],
                                ELEMENTS[12],
                                ELEMENTS[4],
                                ELEMENTS[5],
                                ELEMENTS[16],
                                ELEMENTS[2],
                                ELEMENTS[6],
                                ELEMENTS[7],
                                ELEMENTS[8]))),
                hasCommercial = false,
                elements = arrayListOf(
                        ELEMENTS[20],
                        ELEMENTS[16],
                        ELEMENTS[19],
                        ELEMENTS[2],
                        ELEMENTS[0],
                        ELEMENTS[10]),
                bottomCarousel = null)
    }

    private fun sixthModel(): MainScreenModel {
        return MainScreenModel(
                carousels = emptyList(),
                hasCommercial = false,
                elements = emptyList(),
                bottomCarousel = null)
    }
}