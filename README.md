# EDD — Temas 9 y 10

Prácticas del módulo de Entornos de Desarrollo sobre testing, cobertura, análisis estático, refactorización y documentación en Java con Eclipse IDE.

---

## Ejercicio 1 — JUnit con Eclipse

Implementación de la clase `Rectangle` con tests JUnit 5. La clase gestiona tres casuísticas en `calcularSurface()` y `calcularPerimeter()`: parámetros positivos, algún parámetro negativo (devuelve `-1`) y algún parámetro cero (devuelve `0`).

Los tests cubren los cuatro casos: valores positivos, negativos, cero y aserciones intencionalmente erróneas para verificar que JUnit las detecta.

---

## Ejercicio 2 — Cobertura con EclEmma

Análisis de cobertura del juego de pruebas del ejercicio anterior usando EclEmma. Se verifica que los tests alcanzan el 100% de cobertura sobre el código de `Rectangle` y se genera el informe `Coverage Report`.

---

## Ejercicio 3 — Análisis estático con SonarLint

Aplicación de SonarLint sobre el proyecto del ejercicio 1 desde Eclipse. El entregable incluye un PDF con el análisis y una comparativa entre SonarLint y SonarQube:

- **SonarLint**: plugin de IDE para análisis en local durante el desarrollo.
- **SonarQube**: plataforma centralizada para equipos, con historial e integración en CI/CD.

---

## Ejercicio 4 — Refactorización con Eclipse

Refactorización del código del ejercicio 1 con las herramientas automáticas de Eclipse:

- Extracción de la constante `2` a `LADOS`
- Renombrado de métodos al inglés: `calcularSurface()` y `calcularPerimeter()`
- Renombrado de la clase `Rectangulo` a `Rectangle`
- Extracción de la validación de parámetros a un método privado reutilizable
- Ejecución de los tests tras refactorizar para verificar que todo sigue funcionando

---

## Ejercicio 5 — Javadoc y Markdown

Documentación Javadoc completa del proyecto con `@author`, `@version`, `@param` y `@return` en todos los métodos públicos. La documentación HTML generada está disponible en `EDD_Ejercicio5/doc/index.html`.

---

## Tecnologías

- Java 21
- Eclipse IDE
- JUnit 6
- EclEmma
- SonarLint
- Javadoc

## Autor

ftor22 — curso 2024/2025
