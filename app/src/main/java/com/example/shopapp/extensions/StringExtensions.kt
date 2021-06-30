package com.example.shopapp.extensions

import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.core.content.ContextCompat

fun TextView.setColorToTextView(string: Array<String>, colors: Array<Int>){
    val spannable = SpannableString(string.joinToString(""))

    var startIndex = 0
    for (i in string.indices){
        spannable.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(context, colors[i])),
            startIndex, startIndex + string[i].length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        startIndex += string[i].length
    }
    text = spannable
}