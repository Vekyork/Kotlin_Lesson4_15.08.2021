package ru.geekbrains.androidwithkotlin.view

import android.view.View
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_INDEFINITE
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_LONG
import com.google.android.material.snackbar.Snackbar
//Показать SnackBar c передачей текста в виде String
fun View.showSnackBar(text: String, actionText: String, action: (View) -> Unit){
    Snackbar.make(this, text, Snackbar.LENGTH_INDEFINITE)
        .setAction(actionText, action).show()
}

fun View.show(): View{
    if (visibility != View.VISIBLE){
        visibility = View.VISIBLE
    }
    return this
}

fun View.hide(): View{
    if (visibility != View.GONE){
        visibility = View.GONE
    }
    return this

    //Показать SnackBar c отображением строкового ресурса из R.String
    fun View.showSnackBar(text: String, actionText: String, action: (View) -> Unit){
        Snackbar.make(this, context.getString(LENGTH_LONG), LENGTH_LONG).show()
    }
}
