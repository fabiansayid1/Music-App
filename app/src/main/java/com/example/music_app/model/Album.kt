package com.example.music_app.model

// ARCHIVO QUE MANEJA LOS DATOS PROVENIENTES DEL API

data class Album(
    val wrapperType: String?,
    val collectionType: String?,
    val artistId: Long?,
    val collectionId: Long?,
    val amgArtistId: Long?,
    val artistName: String?,
    val collectionName: String?,
    val collectionCensoredName: String?,
    val artistViewUrl: String?,
    val collectionViewUrl: String?,
    val artworkUrl60: String?,

    val artworkUrl100: String?,

    val collectionPrice: Double?,
    val trackCount: Int?,
    val releaseDate: String?,
    val primaryGenreName: String?,
    val country: String?,
    val currency: String?,
) {

    // METODO PARA OBTENER LA IMAGEN EN GRANDE
    fun getHighResArtworkUrl(): String? {
        return artworkUrl100?.replace("100x100bb", "600x600bb") ?: ""
    }


}
