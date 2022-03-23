package br.com.inclusion.toolkit.utils

import org.koin.core.Koin
import org.koin.core.scope.Scope

/**
 * Workaround to fix duplicate classes when use getAll (#1146)
 * https://github.com/InsertKoinIO/koin/issues/1146
 */
inline fun <reified T : Any> Koin.getAllDistinct(): List<T> {
    return getAll<T>().distinctBy { it.javaClass }
}

inline fun <reified T : Any> Scope.getAllDistinct(): List<T> {
    return getAll<T>().distinctBy { it.javaClass }
}