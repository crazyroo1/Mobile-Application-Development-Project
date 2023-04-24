package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject

import androidx.recyclerview.widget.RecyclerView
import java.util.Stack

class NavigationHandler {
    companion object {
        val stack: Stack<RecyclerViewAdaptor> = Stack()

        fun push(adaptor: RecyclerViewAdaptor, recyclerView: RecyclerView) {
            stack.push(adaptor)
            recyclerView.refreshAdaptor()
        }

        fun pop(recyclerView: RecyclerView) {
            stack.pop()
            recyclerView.refreshAdaptor()
        }
    }
}

fun RecyclerView.refreshAdaptor() {
    this.adapter = NavigationHandler.stack.peek()
}