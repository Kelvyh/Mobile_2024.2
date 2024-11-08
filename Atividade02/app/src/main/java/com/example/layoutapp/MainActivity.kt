package com.example.layoutapp

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val layout = ConstraintLayout(this).apply {
//            layoutParams = ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT
//            )
//        }
//
//        val titleTextView = TextView(this).apply {
//            id = View.generateViewId()
//            text = "Bem-vindo"
//            textSize = 24f
//        }
//
//        val inputEditText = EditText(this).apply {
//            id = View.generateViewId()
//            hint = "Digite algo"
//        }
//
//        val actionButton = Button(this).apply {
//            id = View.generateViewId()
//            text = "Clique Aqui"
//        }
//
//        layout.addView(titleTextView)
//        layout.addView(inputEditText)
//        layout.addView(actionButton)
//
//        val set = ConstraintSet()
//        set.clone(layout)
//
//        set.connect(titleTextView.id, ConstraintSet.TOP, layout.id, ConstraintSet.TOP, 32)
//        set.connect(titleTextView.id, ConstraintSet.START, layout.id, ConstraintSet.START, 32)
//        set.connect(titleTextView.id, ConstraintSet.END, layout.id, ConstraintSet.END, 32)
//
//        set.connect(inputEditText.id, ConstraintSet.TOP, titleTextView.id, ConstraintSet.BOTTOM, 32)
//        set.connect(inputEditText.id, ConstraintSet.START, layout.id, ConstraintSet.START, 32)
//        set.connect(inputEditText.id, ConstraintSet.END, layout.id, ConstraintSet.END, 32)
//
//        set.connect(actionButton.id, ConstraintSet.TOP, inputEditText.id, ConstraintSet.BOTTOM, 32)
//        set.connect(actionButton.id, ConstraintSet.START, layout.id, ConstraintSet.START, 32)
//        set.connect(actionButton.id, ConstraintSet.END, layout.id, ConstraintSet.END, 32)
//
//        set.applyTo(layout)
//
//        setContentView(layout)
    }
}