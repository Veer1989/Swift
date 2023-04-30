package MusicApp.Swift

import MusicApp.Swift.databinding.ActivityFavouriteBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FavouriteActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFavouriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setTheme(R.style.Base_Theme_Swift)
        binding = ActivityFavouriteBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}