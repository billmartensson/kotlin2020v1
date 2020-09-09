package se.magictechnology.kotlinv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var antalklick = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        topptexten.text = "Appen startat"

        toppknappen.setOnClickListener {

            antalklick = antalklick + 1

            topptexten.text = "Klick: " + antalklick.toString()
        }


    }

    fun tryckanedreknapp(view : View)
    {
        antalklick = 0
        topptexten.text = "Klick: " + antalklick.toString()
    }

}