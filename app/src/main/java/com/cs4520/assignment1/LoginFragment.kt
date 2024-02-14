package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

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
            //clear the fields before navigation

            // Navigate to ProductListFragment
            findNavController().navigate(R.id.action_loginFragment_to_productListFragment)
        } else {
            // Display a toast message indicating incorrect username or password
            val text = "Incorrect username or password."
            val duration = Toast.LENGTH_SHORT
            // Use runOnUiThread to display the toast on the main UI thread
            activity?.runOnUiThread {
                val toast = Toast.makeText(requireContext(), text, duration)
                toast.show()
            }
        }
    }

}
