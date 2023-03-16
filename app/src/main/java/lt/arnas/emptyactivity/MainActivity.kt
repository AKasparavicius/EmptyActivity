package lt.arnas.emptyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    final val TAG = "my_super_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView: TextView = findViewById(R.id.myTextView)
        Log.i(TAG, "onCreate: ${myTextView.text}")
        myTextView.visibility

        myTextView.setText("Sveikas pasauli!")
        Log.i(TAG, "onCreate: ${getString(R.string.say_hello)} " + "Sveikas pasauli!".toString())

        lifecycleScope.launch {
            myTextView.setText(R.string.say_hello)

            delay(5000)

            myTextView.setText("Second message")
        }



    }
}