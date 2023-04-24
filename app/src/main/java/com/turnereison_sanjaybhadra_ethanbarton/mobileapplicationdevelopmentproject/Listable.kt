package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import android.content.Intent
import android.net.Uri
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

data class Link(override val name: String, val url: String): FilesystemItem, Listable {
    override fun getPrimaryText(): String {
        return name
    }

    override fun getSecondaryText(): String {
        return "Link"
    }

    override val tapAction: () -> Unit
        get() = {
            val urlWithWebParam = if (url.contains("docs.google.com/presentation")) {
                "$url?usp=drive_web"
            } else {
                url
            }

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlWithWebParam))
            intent.setPackage("com.android.chrome")
            NavigationHandler.context?.startActivity(intent)
            print("Tapped Link named $name")
        }
}

data class Folder(override val name: String, var children: List<Listable>): FilesystemItem, Listable {
    override fun getPrimaryText(): String {
        return name
    }

    override fun getSecondaryText(): String {
        return "${children.size} items"
    }

    override val tapAction: () -> Unit
        get() = {
            NavigationHandler.push(RecyclerViewAdaptor(children))
            print("Tapped folder named $name!")
        }
}

fun print(message: String) {
    Log.d("turbs", message)
}