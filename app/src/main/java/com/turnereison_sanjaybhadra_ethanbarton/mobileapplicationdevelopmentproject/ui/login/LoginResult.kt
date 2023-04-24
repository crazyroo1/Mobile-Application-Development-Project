package com.turnereison_sanjaybhadra_ethanbarton.mobileapplicationdevelopmentproject.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)