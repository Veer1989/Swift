package MusicApp.Swift

import MusicApp.Swift.databinding.ActivityMainBinding
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestUserPermission()
        setTheme(R.style.Base_Theme_Swift)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.shufflebtn.setOnClickListener {
            Toast.makeText(this,"Button Clicked" ,Toast.LENGTH_SHORT).show()
            val intent = Intent(this,PlayerActivity::class.java)
            startActivity(intent)
        }
        binding.favouritebtn.setOnClickListener {

            val intent = Intent(this,FavouriteActivity::class.java)
            startActivity(intent)
        }
        binding.playlistbtn.setOnClickListener {

            val intent = Intent(this,PlaylistActivity::class.java)
            startActivity(intent)
        }
    }
    private fun requestUserPermission(){
        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
        != PackageManager.PERMISSION_GRANTED)

        {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),13)
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 13){
            if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                Toast.makeText(this,"Permission Granted",Toast.LENGTH_SHORT).show()
            else
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),13)
        }


        }

    }

