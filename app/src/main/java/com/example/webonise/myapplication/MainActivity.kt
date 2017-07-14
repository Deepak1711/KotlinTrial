package com.example.webonise.myapplication

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    internal var btn: Button ?= null
    internal lateinit var btn2: Button
    internal lateinit var btn: Button
    var spells:List<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a++
        Toast.makeText(this, a.toString(), Toast.LENGTH_SHORT).show()

        btn = findViewById(R.id.btn) as Button
        btn2=findViewById(R.id.button) as Button
        btn.setOnClickListener { openURLInBrowser() }
        btn2.setOnClickListener { startAnotherActivity() }
    }

    private fun startAnotherActivity() {
        val intent=Intent(this,Main2Activity::class.java)
        startActivity(intent)
    }

    private fun openURLInBrowser() {
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vogella.com"))
        startActivity(i)
    }

    private fun share() {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "News for you!")
        startActivity(intent)
    }

    companion object {

        var a = 0
        val m:MainActivity = MainActivity()
        //to check if the receiver of an intent is available or not
        fun isIntentAvailable(ctx: Context, intent: Intent): Boolean {
            val mgr = ctx.packageManager
            val list = mgr.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)
            return list.size > 0
        }

        fun write(){
          Toast.makeText(m.baseContext,"Printed",Toast.LENGTH_SHORT).show()
        }
    }
}
