package ca.sharipov.examplespeeddialfab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private var isFabOpen = true

    private lateinit var fab: FloatingActionButton
    private lateinit var fab1: FloatingActionButton
    private lateinit var fab2: FloatingActionButton
    private lateinit var fab3: FloatingActionButton
    private lateinit var cvFab1: CardView
    private lateinit var cvFab2: CardView
    private lateinit var cvFab3: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        fab = findViewById(R.id.fab)
        fab1 = findViewById(R.id.fab1)
        fab2 = findViewById(R.id.fab2)
        fab3 = findViewById(R.id.fab3)
        fab3 = findViewById(R.id.fab3)
        cvFab1 = findViewById(R.id.cvFab1)
        cvFab2 = findViewById(R.id.cvFab2)
        cvFab3 = findViewById(R.id.cvFab3)

        openCloseFab()
        fab.setOnClickListener {
            openCloseFab()
        }
    }

    private fun openCloseFab() {
        if (isFabOpen) {
            isFabOpen = false
            fab.animate().rotation(0F).duration = 200
            fab1.animate().translationY(resources.getDimension(R.dimen.fab1_hide)).alpha(0F).duration = 150
            fab2.animate().translationY(resources.getDimension(R.dimen.fab2_hide)).alpha(0F).duration = 150
            fab3.animate().translationY(resources.getDimension(R.dimen.fab3_hide)).alpha(0F).duration = 150
            cvFab1.animate().translationY(resources.getDimension(R.dimen.fab1_hide)).alpha(0F).duration = 150
            cvFab2.animate().translationY(resources.getDimension(R.dimen.fab2_hide)).alpha(0F).duration = 150
            cvFab3.animate().translationY(resources.getDimension(R.dimen.fab3_hide)).alpha(0F).duration = 150
        } else {
            isFabOpen = true
            fab.animate().rotation(-90F).duration = 200
            fab1.animate().translationY(0F).alpha(100f).duration = 150
            fab2.animate().translationY(0F).alpha(100f).duration = 150
            fab3.animate().translationY(0F).alpha(100f).duration = 150
            cvFab1.animate().translationY(0F).alpha(100f).duration = 150
            cvFab2.animate().translationY(0F).alpha(100f).duration = 150
            cvFab3.animate().translationY(0F).alpha(100f).duration = 150
        }
    }
}