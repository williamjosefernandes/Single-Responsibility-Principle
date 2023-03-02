package br.com.william.fernandes.srp

class Chef(
    private val cozinheiro: Cozinheiro,
    private val garcom: Garcom,
    private val lavaLoucas: LavaLoucas,
) {

    fun prepararJantar() {
        cozinheiro.prepararPratoPrincipal()
        cozinheiro.prepararSobremesa()
        garcom.servirBebidas()
        lavaLoucas.lavarLouca()
    }
}
