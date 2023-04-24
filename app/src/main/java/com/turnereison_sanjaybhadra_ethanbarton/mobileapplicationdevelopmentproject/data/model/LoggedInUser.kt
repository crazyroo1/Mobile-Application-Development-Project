package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String
)