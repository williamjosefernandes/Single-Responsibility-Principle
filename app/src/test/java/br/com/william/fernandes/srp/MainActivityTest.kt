package br.com.william.fernandes.srp

import org.junit.Assert.assertTrue
import org.junit.Test

class ChefTest {

    private val cozinheiro = Cozinheiro()
    private val garcom = Garcom()
    private val lavaLoucas = LavaLoucas()
    private val chef = Chef(cozinheiro, garcom, lavaLoucas)

    @Test
    fun prepararJantar_devePrepararPratoPrincipal() {
        chef.prepararJantar()
        assertTrue("Prato principal não foi preparado", cozinheiro.pratoPrincipalPreparado)
    }

    @Test
    fun prepararJantar_devePrepararSobremesa() {
        chef.prepararJantar()
        assertTrue("Sobremesa não foi preparada", cozinheiro.sobremesaPreparada)
    }

    @Test
    fun prepararJantar_deveServirBebidas() {
        chef.prepararJantar()
        assertTrue("Bebidas não foram servidas", garcom.bebidasServidas)
    }

    @Test
    fun prepararJantar_deveLavarLouca() {
        chef.prepararJantar()
        assertTrue("Louça não foi lavada", lavaLoucas.loucaLavada)
    }
}
