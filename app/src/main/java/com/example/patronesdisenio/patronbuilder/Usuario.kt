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

        fun setApellido(apellido: String) : Builder {
            this.apellido = apellido
            return this
        }

        fun setEamil(email: String) : Builder {
            this.email = email
            return this
        }

        fun setTipoUsuario(tipo: TipoUsuario) : Builder {
            this.tipoUsuario = tipoUsuario
            return this
        }

        fun build() = Usuario(id, nombre, apellido, email, tipoUsuario)
    }

}
enum class TipoUsuario {
    ORO,
    PLATA,
    BRONCE
}
