/**
 * Created by kmema on 6/3/2017.
 */
class GameModule {

    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf ()
    val  foundationPiles: Array<FoundationPile> = arrayOf(FoundationPile("clubs"),
            FoundationPile("Diamonds"), FoundationPile("Hearts"), FoundationPile("Spades"))
}