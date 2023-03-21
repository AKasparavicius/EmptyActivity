package lt.arnas.emptyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {

    final val TAG = "my_super_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val secondPage: TextView = findViewById(R.id.secondPage)
        secondPage.visibility

        val goBackButton: Button = findViewById(R.id.goBackButton)
        goBackButton.visibility = View.VISIBLE
    }


}