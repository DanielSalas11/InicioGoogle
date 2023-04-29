package salas.daniel.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import salas.daniel.iniciogoogle.databinding.ActivityMainBinding
import salas.daniel.iniciogoogle.databinding.ActivityPrincipalBinding

class PrincipalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        binding = ActivityPrincipalBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val bundle = intent.extras
        if(bundle != null){
            val nombre = bundle.getString("name")
            val correo = bundle.getString("email")

            binding.tvNombre.setText(nombre)
            binding.tvCorreo.setText(correo)
        }

        binding.btnCerrar.setOnClickListener{
            finish()
        }
    }
}