package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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
        //Create Data Class
        //Create list from data class type
        //Create adapter
        //Set adapter
        //Linear layout maneger


        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()


        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener{
            rvList.layoutManager = LinearLayoutManager(this)
        }
        adapter.setOnClickListener { contact ->
            val intent = Intent(this, ContactDetailsActivity::class.java)
            intent.putExtra( "name", contact.name)
            intent.putExtra( "phone", contact.phone)
            intent.putExtra( "icon", contact.icon)
            startActivity(intent)
        }
    }



}

val contacts = listOf(
    Contact(
        name = "Camila",
        phone = "(55) 11 98765432",
        R.drawable.sample1
    ),
    Contact(
        name = "Jose",
        phone = "(55) 11 98765432",
        R.drawable.sample2
    ),
    Contact(
        name = "Joana",
        phone = "(55) 11 98765432",
        R.drawable.sample3
    ),
    Contact(
        name = "Vitoria",
        phone = "(55) 11 98765432",
        R.drawable.sample4
    ),
    Contact(
        name = "Marina",
        phone = "(55) 11 98765432",
        R.drawable.sample5
    ),
    Contact(
        name = "Angel",
        phone = "(55) 11 98765432",
        R.drawable.sample6
    ),
    Contact(
        name = "Cristina",
        phone = "(55) 11 98765432",
        R.drawable.sample7
    ),
    Contact(
        name = "Josue",
        phone = "(55) 11 98765432",
        R.drawable.sample8
    ),
    Contact(
        name = "Jesus",
        phone = "(55) 11 98765432",
        R.drawable.sample9
    ),
    Contact(
        name = "Carlos",
        phone = "(55) 11 98765432",
        R.drawable.sample10
    ),
    Contact(
        name = "Sabrina",
        phone = "(55) 11 98765432",
        R.drawable.sample11
    ),
     Contact(
        name = "João",
        phone = "(55) 11 98765432",
        R.drawable.sample12
    ),
     Contact(
        name = "Simone",
        phone = "(55) 11 98765432",
        R.drawable.sample13
    ),
     Contact(
        name = "Augusto",
        phone = "(55) 11 98765432",
        R.drawable.sample14
    ),
     Contact(
        name = "Manuela",
        phone = "(55) 11 98765432",
        R.drawable.sample15
    ),
     Contact(
        name = "Julia",
        phone = "(55) 11 98765432",
        R.drawable.sample16
    ),


)