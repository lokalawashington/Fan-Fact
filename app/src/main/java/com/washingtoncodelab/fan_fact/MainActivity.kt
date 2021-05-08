package com.washingtoncodelab.fan_fact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.washingtoncodelab.fan_fact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null
    var adpter:FactAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact(){
        adpter = FactAdapter(this,DummyData.funfacts)
        binding?.factListView?.adapter = adpter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}