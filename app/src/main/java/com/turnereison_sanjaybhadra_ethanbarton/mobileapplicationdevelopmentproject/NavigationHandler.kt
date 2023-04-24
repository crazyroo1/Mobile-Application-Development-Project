package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import java.util.Stack

class NavigationHandler {
    companion object {
        val stack: Stack<RecyclerViewAdaptor> = Stack()

        fun push(adaptor: RecyclerViewAdaptor) {
            stack.push(adaptor)
            recyclerView?.refreshAdaptor()
        }

        fun pop() {
            stack.pop()
            recyclerView?.refreshAdaptor()
        }

        var recyclerView: RecyclerView? = null
        var context: Context? = null
    }
}

fun RecyclerView.refreshAdaptor() {
    this.adapter = NavigationHandler.stack.peek()
}