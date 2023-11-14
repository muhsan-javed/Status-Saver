package com.muhsantech.statussaver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.replace
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.muhsantech.statussaver.R
import com.muhsantech.statussaver.databinding.ActivityMainBinding
import com.muhsantech.statussaver.ui.fragments.MediaFragment
import com.muhsantech.statussaver.ui.fragments.SettingsFragment
import com.muhsantech.statussaver.ui.fragments.StatusFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
//    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var NavController = findNavController(R.id.fragmentContainerView)
        var bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setupWithNavController(NavController)

//        val navController = findNavController(R.id.fragmentContainerView)
//        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        bottomNav.setupWithNavController(navController)

//        bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//
//        replaceWithFragment(MediaFragment())

        // by default, home fragment should be visible to the user.

//        bottomNav.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.mediaFragment->{
//                    replaceWithFragment(MediaFragment())
//                }
//                R.id.statusFragment->{
//                    replaceWithFragment(StatusFragment())
//                }
//                else->{
//                    replaceWithFragment(SettingsFragment())
//                }
//            }
//            true
//        }

//        bottomNav.selectedItemId = R.id.mediaFragment

    }
//    private fun replaceWithFragment(fragment: Fragment) {
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
//        fragmentTransaction.commit()
//
//    }

}