package com.daggerdemokotlin.Ui.accessUser.userhelper


class User(fname:String,lname:String){

    var firstname = fname;
    val lastname = lname;

    init {
        println("First Name = $firstname")
        println("lastname = $lastname")
    }

    override fun toString(): String {
        return "User(firstname='$firstname', lastname='$lastname')"
    }


}
