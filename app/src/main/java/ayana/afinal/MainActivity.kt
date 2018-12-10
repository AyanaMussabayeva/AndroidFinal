package ayana.afinal

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pref = getSharedPreferences("data", Context.MODE_PRIVATE)
        val text = pref.getString("saved_email","0")
        Toast.makeText(this,"hello " + text + "!", Toast.LENGTH_LONG).show()


    }
}
