package com.example.studentportal

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_portal.*

const val PORTAL_EXTRA = "PORTAL_EXTRA"

class AddPortal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_portal)
        Itemview()
    }

    private fun Itemview() {
        btnAddPortal.setOnClickListener { OnClickAddPortal() }
    }

    private fun OnClickAddPortal() {
        val portal = Portal(
            titleInput.text.toString(),
            urlInput.text.toString()
        )

        val resultIntent = Intent()
        resultIntent.putExtra(PORTAL_EXTRA, portal)
        setResult(Activity.RESULT_OK, resultIntent)
        finish()
    }
}
