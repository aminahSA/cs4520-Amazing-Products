package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class LoginFragment : Fragment(R.layout.login_fragment) {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.login_fragment, container, false)

        username = rootView.findViewById(R.id.username)
        password = rootView.findViewById(R.id.password)
        loginButton = rootView.findViewById(R.id.login)

        loginButton.setOnClickListener {
            login()
        }

        return rootView
    }

    private fun login() {
        val username = username.text.toString()
        val password = password.text.toString()

        if (username == "admin" && password == "admin") {
            // Navigate to ProductListFragment
            // Here, you need to replace 'R.id.fragment_container' with the id of the container where you want to replace fragments
            println("do something")
        } else {
            // Display a toast message indicating incorrect username or password
            Toast.makeText(context, "Incorrect username or password", Toast.LENGTH_SHORT).show()
        }
    }

}

//When the user opens the app every time, they see a LoginFragment.

//LoginFragment

//Clicking the Login button should navigate to the ProductListFragment,
// only if the username and password matches "admin" and "admin" respectively.
// If the username or password differs, display a toast message. Make sure to clear
// the fields before navigation. -->