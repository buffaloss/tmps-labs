package performer

data class PerformerDescription(
    val type: String,
    val name: String,
    val debutDate: String? = null,
    val dob: String? = null,
    val topic: String? = null,
    val country: String? = null,
    val genre: String? = null
)