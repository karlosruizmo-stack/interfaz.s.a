# Perfil X – Práctica 1: Diseño de interfaces

Proyecto Android de la práctica, adaptado para recrear en XML una pantalla de perfil de X (Twitter).

## Qué incluye

- Interfaz principal construida con vistas XML y contenedores `LinearLayout`, `FrameLayout`, `HorizontalScrollView` y `NestedScrollView`.
- Estilo oscuro inspirado en la referencia: cabecera, portada, avatar, datos del perfil, pestañas, publicación y navegación inferior.
- Recursos reutilizables para colores, dimensiones y fondos (`res/values`, `res/drawable`).
- Dimensiones alternativas para pantallas de al menos 600 dp y 1240 dp de ancho.
- Diseño específico en `res/layout-land` para orientación horizontal: perfil a la izquierda y publicaciones a la derecha.
- `MainActivity` en Java con acciones de ejemplo para los controles del perfil.

## Cómo probarlo

1. Abrir la carpeta del proyecto en Android Studio.
2. Esperar a que Gradle sincronice las dependencias.
3. Ejecutar en un emulador o dispositivo Android.
4. Probar al menos un móvil en vertical, una pantalla ancha/tablet y el mismo dispositivo en horizontal.

## Nota sobre la práctica

La entrega principal se mantiene en XML, como pide el objetivo del documento. Jetpack Compose no se ha añadido porque aparece como ampliación opcional.
