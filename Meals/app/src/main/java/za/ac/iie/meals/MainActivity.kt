package za.ac.iie.meals

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        //variables that link to the controls of the app
        val edtTime = findViewById<EditText>(R.id.edtTime)
        var txtResults = findViewById<TextView>(R.id.txtResults)
        val btnSuggestions = findViewById<Button>(R.id.btnSuggestions)
        val btnClear = findViewById<Button>(R.id.btnClear)



        //The button that is used for the suggestions
        btnSuggestions.setOnClickListener{
            val time = edtTime.text.toString()

            if (time == "morning"){
               txtResults.text = "Breakfast: Pancakes, bacon and eggs, coffee"
            }
            else if (time == "mid morning"){
                txtResults.text = "mid morning snack: Fruit, chips"
            }
            else if (time == "lunch"){
                txtResults.text = "Lunch: Sandwitch, burger and chips, pizza"
            }
            else if (time == "mid day"){
                txtResults.text = "mid day snack: chips, peanuts, salad"
            }
            else if (time == "dinner"){
                txtResults.text = "Dinner: spaghetti, pasta, burger and chips"
        }
            else if (time == "dessert" ){
                txtResults.text = "Dessert: ice-cream, cake"
            }
            else "invalid time "

        }
        //button used to remove the text
        btnClear.setOnClickListener{
            edtTime.text.clear()
            txtResults.text = ""
        }







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}