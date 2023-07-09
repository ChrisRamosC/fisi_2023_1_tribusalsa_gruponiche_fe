package com.gruponiche.fit_or_fat.model

import java.io.Serializable

data class Amigo(
    val nombre: String,
    val imgAmigo: String = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png"
) : Serializable
