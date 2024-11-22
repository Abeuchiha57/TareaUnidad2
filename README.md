<!-- #######  THIS IS A COMMENT - Visible only in the source editor #########-->
<h3>Proyecto: Sistema de Contenido Audiovisual</h3>
<p>Este proyecto implementa un sistema para gestionar diferentes tipos de contenido audiovisual, como pel&iacute;culas, series de TV, documentales y videos de TikTok. La arquitectura est&aacute; basada en programaci&oacute;n orientada a objetos, utilizando conceptos como herencia, encapsulaci&oacute;n y agregaci&oacute;n.</p>
<h3>Clases Principales</h3>
<ol>
<li>
<p><strong>ContenidoAudiovisual (Abstract)</strong>: Clase base abstracta que define las propiedades y m&eacute;todos comunes para todos los contenidos audiovisuales.</p>
<ul>
<li>Atributos:
<ul>
<li><code>titulo</code>: T&iacute;tulo del contenido.</li>
<li><code>duracionEnMinutos</code>: Duraci&oacute;n en minutos.</li>
<li><code>genero</code>: G&eacute;nero del contenido.</li>
<li><code>id</code>: Identificador &uacute;nico.</li>
</ul>
</li>
<li>M&eacute;todos:
<ul>
<li><code>mostrarDetalles()</code>: M&eacute;todo abstracto para mostrar detalles del contenido.</li>
</ul>
</li>
</ul>
</li>
<li>
<p><strong>Documental</strong>: Subclase de <code>ContenidoAudiovisual</code> que representa un documental.</p>
<ul>
<li>Atributos:
<ul>
<li><code>tema</code>: Tema del documental.</li>
<li><code>investigadores</code>: Lista de investigadores asociados.</li>
</ul>
</li>
<li>M&eacute;todos:
<ul>
<li><code>agregarInvestigador()</code>: Agrega un investigador a la lista.</li>
</ul>
</li>
</ul>
</li>
<li>
<p><strong>Pelicula</strong>: Subclase de <code>ContenidoAudiovisual</code> que representa una pel&iacute;cula.</p>
<ul>
<li>Atributos:
<ul>
<li><code>estudio</code>: Estudio que produjo la pel&iacute;cula.</li>
<li><code>actores</code>: Lista de actores en la pel&iacute;cula.</li>
</ul>
</li>
<li>M&eacute;todos:
<ul>
<li><code>agregarActor()</code>: Agrega un actor a la lista.</li>
</ul>
</li>
</ul>
</li>
<li>
<p><strong>SerieDeTV</strong>: Subclase de <code>ContenidoAudiovisual</code> que representa una serie de televisi&oacute;n.</p>
<ul>
<li>Atributos:
<ul>
<li><code>temporadas</code>: Lista de temporadas.</li>
</ul>
</li>
<li>M&eacute;todos:
<ul>
<li><code>agregarTemporada()</code>: Agrega una temporada a la lista.</li>
</ul>
</li>
</ul>
</li>
<li>
<p><strong>VideoTikTok</strong>: Subclase de <code>ContenidoAudiovisual</code> que representa un video de TikTok.</p>
<ul>
<li>Atributos:
<ul>
<li><code>duracionEnSegundos</code>: Duraci&oacute;n en segundos.</li>
<li><code>numeroDeVistas</code>: N&uacute;mero de vistas del video.</li>
<li><code>creador</code>: Nombre del creador del video.</li>
</ul>
</li>
<li>M&eacute;todos:
<ul>
<li><code>incrementarVistas()</code>: Incrementa el n&uacute;mero de vistas.</li>
</ul>
</li>
</ul>
</li>
<li>
<p><strong>Actor</strong>: Representa a un actor.</p>
<ul>
<li>Atributos:
<ul>
<li><code>nombre</code>: Nombre del actor.</li>
<li><code>edad</code>: Edad del actor.</li>
<li><code>rol</code>: Rol del actor en la pel&iacute;cula.</li>
</ul>
</li>
</ul>
</li>
<li>
<p><strong>Investigador</strong>: Representa a un investigador de un documental.</p>
<ul>
<li>Atributos:
<ul>
<li><code>nombre</code>: Nombre del investigador.</li>
<li><code>especialidad</code>: Especialidad del investigador.</li>
</ul>
</li>
</ul>
</li>
<li>
<p><strong>Temporada</strong>: Representa una temporada de una serie.</p>
<ul>
<li>Atributos:
<ul>
<li><code>tempNum</code>: N&uacute;mero de la temporada.</li>
<li><code>episodios</code>: N&uacute;mero de episodios en la temporada.</li>
</ul>
</li>
</ul>
</li>
</ol>
<h3>Requisitos</h3>
<ul>
<li>Java JDK 8 o superior.</li>
<li>Un entorno de desarrollo Java (Eclipse, IntelliJ, etc.).</li>
</ul>
<h3>C&oacute;mo Ejecutar</h3>
<ol>
<li>Clona este repositorio en tu m&aacute;quina local.</li>
<li>Abre el proyecto en tu IDE.</li>
<li>Compila y ejecuta la clase principal, si existe, o crea un programa de prueba para instanciar las clases y probar su funcionalidad.</li>
</ol>
