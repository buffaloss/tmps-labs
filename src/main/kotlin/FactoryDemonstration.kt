import performer.PerformerDescription
import performer.PerformerFactory

fun FactoryDemonstration1() {
    val factory = PerformerFactory()

    val podcaster = factory.createPodcaster("Joe Rogan", "2009-12-24", "1967-08-11", "Comedy, News")
    val band = factory.createBand("Radiohead", "1985-10-01", "Alternative Rock", "UK")
    val soloArtist = factory.createSoloArtist("Billie Eilish", "2016-11-18", "2001-12-18", "Pop", "USA")

    println(podcaster)
    println(band)
    println(soloArtist)

}

fun FactoryDemonstration2() {
    val factory = PerformerFactory()

    val descriptions = listOf(
        PerformerDescription("Podcaster", "Joe Rogan", "2009-12-24", "1967-08-11", "Comedy, News","null", "null"),
        PerformerDescription("Band", "AC/DC", "1973-11-01", "null", "null", "Australia", "Hard Rock"),
        PerformerDescription("SoloArtist", "Inna", "2008-10-12", "1986-10-16", "null", "Romania", "Dance-pop")
    )

    val performers = descriptions.map { factory.createPerformer(it) }
    performers.forEach { println(it) }
}