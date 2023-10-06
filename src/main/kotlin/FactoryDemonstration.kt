import performer.PerformerDescription
import performer.PerformerFactory

fun FactoryDemonstration1() {
    val factory = PerformerFactory()

    val podcaster = factory.createPodcaster("Podcaster Name", "Debut Date", "DOB", "Topic")
    val band = factory.createBand("Band Name", "09-09-2009", "Metal Rock", "Moldova")
    val soloArtist = factory.createSoloArtist("Solo Artist Name", "23-09-2023", "09-12-2002", "Pop", "Switzerland")

    println(podcaster)
    println(band)
    println(soloArtist)

}

fun FactoryDemonstration2() {
    val factory = PerformerFactory()

    val descriptions = listOf(
        PerformerDescription("Podcaster", "Podcaster Name", "Debut Date", "DOB", "Topic","null", "null", ),
        PerformerDescription("Band", "Band Name", "debutdateee", "null", "null", "Australia", "Rock n Roll"),
        PerformerDescription("SoloArtist", "Solo Artist Name", "debutDate", "09/02/1996", "null", "Romania", "Nightcore")
    )

    val performers = descriptions.map { factory.createPerformer(it) }

    performers.forEach { println(it) }
}