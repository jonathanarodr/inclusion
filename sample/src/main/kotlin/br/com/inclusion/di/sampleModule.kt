package br.com.inclusion.di

import android.content.res.Resources
import br.com.inclusion.navigator.GestureNavigator
import br.com.inclusion.toolkit.utils.getAllDistinct
import br.com.inclusion.ui.menu.GestureMenu
import br.com.inclusion.ui.menu.gesture.BackGesture
import br.com.inclusion.ui.menu.gesture.HomeScreenGesture
import br.com.inclusion.ui.menu.gesture.NextControlGesture
import br.com.inclusion.ui.menu.gesture.NextItemGesture
import br.com.inclusion.ui.menu.gesture.NextReadControlGesture
import br.com.inclusion.ui.menu.gesture.PreviousControlGesture
import br.com.inclusion.ui.menu.gesture.PreviousItemGesture
import br.com.inclusion.ui.menu.gesture.PreviousReadControlGesture
import br.com.inclusion.ui.menu.gesture.ScrollGesture
import br.com.inclusion.ui.menu.gesture.SelectItemGesture
import br.com.inclusion.ui.menu.gesture.SpeechItemGesture
import br.com.inclusion.ui.viewmodel.GestureViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val sampleModule = module {

    /* core */
    factory<Resources> { androidContext().resources }

    /* gesture */
    factory { GestureNavigator() }
    factory { getAllDistinct<GestureMenu>() }
    factory { BackGesture(get(), get()) } bind GestureMenu::class
    factory { HomeScreenGesture(get(), get()) } bind GestureMenu::class
    factory { NextControlGesture(get(), get()) } bind GestureMenu::class
    factory { NextItemGesture(get(), get()) } bind GestureMenu::class
    factory { NextReadControlGesture(get(), get()) } bind GestureMenu::class
    factory { PreviousControlGesture(get(), get()) } bind GestureMenu::class
    factory { PreviousItemGesture(get(), get()) } bind GestureMenu::class
    factory { PreviousReadControlGesture(get(), get()) } bind GestureMenu::class
    factory { ScrollGesture(get(), get()) } bind GestureMenu::class
    factory { SelectItemGesture(get(), get()) } bind GestureMenu::class
    factory { SpeechItemGesture(get(), get()) } bind GestureMenu::class
    viewModel { GestureViewModel(get()) }
}