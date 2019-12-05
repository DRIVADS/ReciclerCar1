package castaneda.raul.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lugares=ArrayList<Lugar>()
        lugares.add(Lugar("Italia", "https://www.mycoyote.es/blog/wp-content/uploads/2018/05/viajar-italia.jpg", "Italia es un pais hermoso, aqui se puede ver la estructura de..."))
        lugares.add(Lugar("Mexico", "https://www.mexicodesconocido.com.mx/wp-content/uploads/2018/03/piramides-de-mexico-teotihuacan.jpg", "Mexico lindo y querido, si muero lejos de ti, que digan que estoy... dormidoooo y que me traigan a ti."))
        lugares.add(Lugar("Canada", "https://www.vacazionaviajes.com/blog/wp-content/uploads/2012/08/Paisaje-Canda.jpg","Canada es un lugar que se encuentra en el continentes"))
        lugares.add(Lugar("China", "https://www.vacazionaviajes.com/blog/wp-content/uploads/2012/08/Paisaje-Canda.jpg","Como el de Visovac, que guarda una isla que, a su vez, alberga un monasterio franciscano del siglo XV. Está situado en las gargantas del río Krka, en Dalmacia Central, y es uno de esos tesoros que guarda Croacia algo alejados de la costa. Se puede visitar y conserva una valiosa colección de libros incunables."))

        miRecycler.adapter=LugarAdapter(lugares,this)
        //miRecycler.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        miRecycler.layoutManager=StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)



    }
}
