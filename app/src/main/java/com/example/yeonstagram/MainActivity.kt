package com.example.yeonstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.yeonstagram.navigation.DetailViewFragment
import com.example.yeonstagram.navigation.GridFragment
import com.example.yeonstagram.navigation.UserFragment
import com.example.yeonstagram.navigation.AlramFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , BottomNavigationView.OnNavigationItemSelectedListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_home->{
                var detailViewFragment = DetailViewFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,detailViewFragment).commit()
                return true
            }
            R.id.action_search->{
                var gridFragment = GridFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,gridFragment).commit()
                return true
            }
            R.id.action_add_photo->{

                return true
            }
            R.id.action_favorite->{
                var alramFragment = AlramFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,alramFragment).commit()
                return true
            }
            R.id.action_account->{
                var userFragment = UserFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,userFragment).commit()
                return true
            }


        }
        return false
    }

}