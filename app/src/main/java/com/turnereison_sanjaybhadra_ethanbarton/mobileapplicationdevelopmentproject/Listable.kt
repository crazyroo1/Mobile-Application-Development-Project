package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import android.util.Log

interface Listable {
    fun getPrimaryText(): String
    fun getSecondaryText(): String

    val tapAction: () -> Unit
}

interface FilesystemItem {
    val name: String
}

data class File(override val name: String): FilesystemItem, Listable {
    override fun getPrimaryText(): String {
        return name
    }

    override fun getSecondaryText(): String {
        return "File"
    }

    override val tapAction: () -> Unit
        get() = {
            print("Tapped file named $name")
        }
}

data class Folder(override val name: String, var children: List<FilesystemItem>): FilesystemItem, Listable {
    override fun getPrimaryText(): String {
        return name
    }

    override fun getSecondaryText(): String {
        return "${children.size} items"
    }

    override val tapAction: () -> Unit
        get() = {
            print("Tapped file named $name!")
        }
}

fun print(message: String) {
    Log.d("turber", message)
}