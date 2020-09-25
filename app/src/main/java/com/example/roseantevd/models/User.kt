package com.example.roseantevd.models

data class  User(
    var unique_id: Number? = null,
    var email: String? = null,
    var username: String? = null,
    var password: String? = null,
    var password_conf :String? = null
)

