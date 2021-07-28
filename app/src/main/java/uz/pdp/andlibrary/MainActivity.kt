package uz.pdp.andlibrary

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

object MainActivity {
    fun show(context: Context){
        Toast.makeText(context,"Hello PDP G18",Toast.LENGTH_SHORT).show()
    }
}