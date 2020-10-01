package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.DayOfWeek

class DayActivity : AppCompatActivity() {

    private lateinit var rcWeek : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day)


//        Todo 1 find recycler view
        rcWeek = findViewById(R.id.recycler_week)
//       Todo 2 create user data
        val week = createDayList()
//       Todo 3 create adapter
        val adapter = com.example.exercise2.DayOfWeekAdapter(week)
//       Todo 4 set layout manager
        rcWeek.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
//       Todo 5 set adapter
        rcWeek.adapter = adapter

    }

    private fun createDayList() : List<com.example.exercise2.DayOfWeek>{

        val week = mutableListOf<com.example.exercise2.DayOfWeek>()

        val d1 = DayOfWeek("Tomorrow", "18", ContextCompat.getDrawable(this, R.drawable.ic_0_clear_sky_morning))
        val d2 = DayOfWeek("Saturday", "20", ContextCompat.getDrawable(this, R.drawable.ic_0_rain))
        val d3 = DayOfWeek("Sunday", "30", ContextCompat.getDrawable(this, R.drawable.ic_0_clear_sky_morning))
        val d4 = DayOfWeek("Monday", "30", ContextCompat.getDrawable(this, R.drawable.ic_0_clear_sky_morning))
        val d5 = DayOfWeek("Tuesday", "26", ContextCompat.getDrawable(this, R.drawable.ic_0_rain))
        val d6 = DayOfWeek("Wednesday", "32", ContextCompat.getDrawable(this, R.drawable.ic_0_clear_sky_morning))

        week.add(d1)
        week.add(d2)
        week.add(d3)
        week.add(d4)
        week.add(d5)
        week.add(d6)

        return week
    }
}