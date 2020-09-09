package se.magictechnology.kotlinv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        topptexten.text = "Appen startat"

        toppknappen.setOnClickListener {
            topptexten.text = "Tryckt på knappen"
        }


    }

    fun tryckanedreknapp(view : View)
    {
        topptexten.text = "Tryckt andra knappen"
    }

}