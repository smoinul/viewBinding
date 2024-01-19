package msayed.example.myviewbindind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import msayed.example.myviewbindind.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var myBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(myBinding.root)
        myBinding.button.setOnClickListener {
            myBinding.textView.setText("Fanshawe")
        }
    }
}