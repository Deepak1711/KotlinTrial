package com.example.webonise.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Main3Activity : AppCompatActivity() {
    //    var a: String ="not initialized"
//    var stringRepresentation: String = "sharma"
//        get() = field                   //why cannot i write 'this.stringRepresentation' instead of 'field'
//        set(value) {
//            field = value.capitalize()
//            a= "initialized"
//        }

    /*this is just the same as in Java since access to private properties with default getters and setters is optimized
    so that no function call overhead is introduced.*/
//    private var _table : Map<String,Int> ?= null
//    public val table : Map<String,Int>
//    get() {
//        if(_table == null){
//            _table = HashMap()
//        }
//        return _table ?: throw AssertionError("Set to null by another thread")
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

//        Toast.makeText(this, stringRepresentation, Toast.LENGTH_LONG).show()       //print sharma
//        stringRepresentation="deepak"
//        Toast.makeText(this, stringRepresentation, Toast.LENGTH_LONG).show()       //print Deepak
//        Toast.makeText(this, a, Toast.LENGTH_LONG).show()       //print Deepak


//        val a : MutableList<Any> =  mutableListOf("Deepak",1)
//        val b=a.filter { it is Int }
//        for(item in b) {
//            Toast.makeText(this,item.toString(),Toast.LENGTH_SHORT).show()
//        }

//        useOfElse()

//        val spell:String ?= null
//        val length=spell?.length ?:-1
//        findProduct("2",null)

//        val items= listOf("apple","banana","kiwi")
//        processColl(items)
//        for (index in items.indices){
//            Toast.makeText(this,"item at $index is ${items[index]}",Toast.LENGTH_SHORT).show()
//        }

//        val list= listOf(1,2,3,-1)
//        val positive=list.filter { it > 0 }
//        positive.forEach { Toast.makeText(this,it.toString(),Toast.LENGTH_SHORT).show() }

//        val oneMillion = 1_000_000;
//        Toast.makeText(this,oneMillion.toString(),Toast.LENGTH_SHORT).show()

//        val a =10
//        val b=a
//        when(a===b){
//           false -> Toast.makeText(this,false.toString(),Toast.LENGTH_SHORT).show()
//            true -> Toast.makeText(this,true.toString(),Toast.LENGTH_SHORT).show()
//        }
//
//        val videoGame=VideoGame("d","s",1)
//        Toast.makeText(this,videoGame.reviewScore.toString(),Toast.LENGTH_SHORT).show()
//        videoGame.reviewScore=10
//        Toast.makeText(this,videoGame.reviewScore.toString(),Toast.LENGTH_SHORT).show()
//        val (theName, thePublisher, theReviewScore) = videoGame
        /*  the above is a shorthand for the following
        val theName == "Gears of War"
        val thePublisher == "Epic Games"
        val theReviewScore == 8 */

        //search for the meaning
//        val x = (1 shl 2) and 0x000FF001
//        Toast.makeText(this,x.toString(),Toast.LENGTH_SHORT).show()

        /*Referential check for integer between -127 to +128 will return true because of the integer caching
          In kotlin, '===' stands for Referential equality and '==' stands for structural equality */
//        val a: Int? = 128 // A boxed Int (java.lang.Integer)
//        val b: Int? = 128 // implicit conversion yields a boxed Long (java.lang.Long)
//        Toast.makeText(this,(a===b).toString(),Toast.LENGTH_SHORT).show()
    }

    private fun useOfElse() {
        val person: String? = "Deepak"
        val s = person ?: return
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }

    fun maxOf(a: Int, b: Int): Int {
        if (a > b)
            return a
        else
            return b
    }

    fun parseInt(arg: String?): Int? {
        if (arg != null)
            return arg.toInt()
        else
            return null
    }

    fun findProduct(arg1: String?, arg2: String?) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        if (x != null && y != null)
            Toast.makeText(this, (x * y).toString(), Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "either x or y is null", Toast.LENGTH_SHORT).show()
    }

    fun processColl(list: List<String>) {
        list
                .filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { Toast.makeText(this, it, Toast.LENGTH_SHORT).show() }
    }
}

