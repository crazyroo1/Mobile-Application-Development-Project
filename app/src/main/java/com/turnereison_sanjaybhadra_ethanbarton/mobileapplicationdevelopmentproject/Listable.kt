package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import android.util.Log
import androidx.recyclerview.widget.RecyclerView

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

data class Folder(override val name: String, var children: List<Listable>, val recyclerView: RecyclerView): FilesystemItem, Listable {
    override fun getPrimaryText(): String {
        return name
    }

    override fun getSecondaryText(): String {
        return "${children.size} items"
    }

    override val tapAction: () -> Unit
        get() = {
            recyclerView.adapter = RecyclerViewAdaptor(children)
            print("Tapped folder named $name!")
        }
}

fun print(message: String) {
    Log.d("turbs", message)
}