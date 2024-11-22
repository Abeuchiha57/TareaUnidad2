Proyecto: Sistema de Contenido Audiovisual
Este proyecto implementa un sistema para gestionar diferentes tipos de contenido audiovisual, como películas, series de TV, documentales y videos de TikTok. La arquitectura está basada en programación orientada a objetos, utilizando conceptos como herencia, encapsulación y agregación.

Clases Principales
ContenidoAudiovisual (Abstract): Clase base abstracta que define las propiedades y métodos comunes para todos los contenidos audiovisuales.

Atributos:
titulo: Título del contenido.
duracionEnMinutos: Duración en minutos.
genero: Género del contenido.
id: Identificador único.
Métodos:
mostrarDetalles(): Método abstracto para mostrar detalles del contenido.
Documental: Subclase de ContenidoAudiovisual que representa un documental.

Atributos:
tema: Tema del documental.
investigadores: Lista de investigadores asociados.
Métodos:
agregarInvestigador(): Agrega un investigador a la lista.
Pelicula: Subclase de ContenidoAudiovisual que representa una película.

Atributos:
estudio: Estudio que produjo la película.
actores: Lista de actores en la película.
Métodos:
agregarActor(): Agrega un actor a la lista.
SerieDeTV: Subclase de ContenidoAudiovisual que representa una serie de televisión.

Atributos:
temporadas: Lista de temporadas.
Métodos:
agregarTemporada(): Agrega una temporada a la lista.
VideoTikTok: Subclase de ContenidoAudiovisual que representa un video de TikTok.

Atributos:
duracionEnSegundos: Duración en segundos.
numeroDeVistas: Número de vistas del video.
creador: Nombre del creador del video.
Métodos:
incrementarVistas(): Incrementa el número de vistas.
Actor: Representa a un actor.

Atributos:
nombre: Nombre del actor.
edad: Edad del actor.
rol: Rol del actor en la película.
Investigador: Representa a un investigador de un documental.

Atributos:
nombre: Nombre del investigador.
especialidad: Especialidad del investigador.
Temporada: Representa una temporada de una serie.

Atributos:
tempNum: Número de la temporada.
episodios: Número de episodios en la temporada.
Requisitos
Java JDK 8 o superior.
Un entorno de desarrollo Java (Eclipse, IntelliJ, etc.).
Cómo Ejecutar
Clona este repositorio en tu máquina local.
Abre el proyecto en tu IDE.
Compila y ejecuta la clase principal, si existe, o crea un programa de prueba para instanciar las clases y probar su funcionalidad.
