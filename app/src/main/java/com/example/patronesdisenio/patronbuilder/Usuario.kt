package com.example.patronesdisenio.patronbuilder

class Usuario private constructor(
    val id: Int,
    val nombre: String,
    val apellido: String?,
    val email: String?,
    val tipoUsuario: TipoUsuario
) {
    class Builder (val id: Int, val nombre: String) {

        private var apellido: String? = null
        private var email: String? = null
        private var tipoUsuario: TipoUsuario = TipoUsuario.BRONCE

        fun setApellido(apellido: String) = apply {
            this.apellido = apellido
        }

        fun setEamil(email: String) = apply {
            this.email = email
        }

        fun setTipoUsuario(tipo: TipoUsuario) = apply {
            this.tipoUsuario = tipoUsuario
        }

        fun build() = Usuario(id, nombre, apellido, email, tipoUsuario)
    }

}
enum class TipoUsuario {
    ORO,
    PLATA,
    BRONCE
}
