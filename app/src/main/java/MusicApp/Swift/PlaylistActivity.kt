package MusicApp.Swift

import MusicApp.Swift.databinding.ActivityPlaylistBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PlaylistActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPlaylistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setTheme(R.style.Base_Theme_Swift)
            binding = ActivityPlaylistBinding.inflate(layoutInflater)
            setContentView(binding.root)
    }
}