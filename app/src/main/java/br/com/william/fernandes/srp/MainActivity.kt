package br.com.william.fernandes.srp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.william.fernandes.srp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val cozinheiro = Cozinheiro()
    private val garcom = Garcom()
    private val lavaLoucas = LavaLoucas()
    private val chef = Chef(cozinheiro, garcom, lavaLoucas)

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrepararJantar.setOnClickListener {
            chef.prepararJantar()
        }
    }
}
