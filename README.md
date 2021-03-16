# ExampleSpeedDialFAB
Speed Dial Floating Action Button(FAB) without 3rd party libs

## Screenshots
<p float="left">
  <img src="https://github.com/SergeySharipov/ExampleSpeedDialFAB/blob/main/screenshots/screenshot-1.jpg" width="200"/>
  <img src="https://github.com/SergeySharipov/ExampleSpeedDialFAB/blob/main/screenshots/screenshot-2.jpg" width="200"/>
  <img src="https://github.com/SergeySharipov/ExampleSpeedDialFAB/blob/main/screenshots/screenrecord.gif" width="200"/>
</p>

## Matirial Design guide lines
https://material.io/components/buttons-floating-action-button#types-of-transitions

## How to Create Speed Dial Floating Action Button(FAB)

https://github.com/SergeySharipov/ExampleSpeedDialFAB/blob/main/app/src/main/java/ca/sharipov/examplespeeddialfab/MainActivity.kt
```Kotlin
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
```

https://github.com/SergeySharipov/ExampleSpeedDialFAB/blob/main/app/src/main/res/layout/custom_fab.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="vertical">

    <androidx.cardview.widget.CardView
        android:id="@+id/cvFab3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        app:cardCornerRadius="10dp"
        app:layout_constraintBottom_toBottomOf="@id/fab3"
        app:layout_constraintEnd_toStartOf="@id/fab3"
        app:layout_constraintHorizontal_bias="1"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@id/fab3">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:text="Favorite" />

    </androidx.cardview.widget.CardView>

    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fab3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:layout_marginBottom="8dp"
        app:fabSize="mini"
        app:layout_constraintBottom_toTopOf="@id/fab2"
        app:layout_constraintEnd_toEndOf="@id/fab"
        app:layout_constraintStart_toStartOf="@id/fab"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/ic_baseline_favorite_24" />

    <androidx.cardview.widget.CardView
        android:id="@+id/cvFab2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        app:cardCornerRadius="10dp"
        app:layout_constraintBottom_toBottomOf="@id/fab2"
        app:layout_constraintEnd_toStartOf="@id/fab2"
        app:layout_constraintHorizontal_bias="1"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@id/fab2">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:text="Copy" />

    </androidx.cardview.widget.CardView>

    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fab2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:layout_marginBottom="8dp"
        app:fabSize="mini"
        app:layout_constraintBottom_toTopOf="@id/fab1"
        app:layout_constraintEnd_toEndOf="@id/fab"
        app:layout_constraintStart_toStartOf="@id/fab"
        app:srcCompat="@drawable/ic_baseline_content_copy_24" />

    <androidx.cardview.widget.CardView
        android:id="@+id/cvFab1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="16dp"
        android:layout_marginEnd="8dp"
        app:cardCornerRadius="10dp"
        app:layout_constraintBottom_toBottomOf="@id/fab1"
        app:layout_constraintEnd_toStartOf="@id/fab1"
        app:layout_constraintHorizontal_bias="1"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@id/fab1">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:text="Email" />
    </androidx.cardview.widget.CardView>

    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fab1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="16dp"
        app:fabSize="mini"
        app:layout_constraintBottom_toTopOf="@id/fab"
        app:layout_constraintEnd_toEndOf="@id/fab"
        app:layout_constraintStart_toStartOf="@id/fab"
        app:srcCompat="@drawable/ic_baseline_email_24" />

    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:srcCompat="@drawable/ic_baseline_more_vert_24" />
</androidx.constraintlayout.widget.ConstraintLayout>
```

https://github.com/SergeySharipov/ExampleSpeedDialFAB/blob/main/app/src/main/res/layout/activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.coordinatorlayout.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

...

    <include
        layout="@layout/custom_fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|end"
        app:srcCompat="@android:drawable/ic_dialog_email" />

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```
