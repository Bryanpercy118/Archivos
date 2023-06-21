# Archivos - Microservicio de Carga de Imágenes

Este repositorio contiene un microservicio desarrollado en Spring Boot que permite la carga de imágenes en diferentes formatos. Proporciona una interfaz simple y fácil de usar para cargar archivos con extensiones .jpg, .jpeg, .pdf y .png.

## Uso

### Ruta de carga de imágenes

Para cargar una imagen, debes hacer una solicitud HTTP POST a la siguiente ruta:

```
POST localhost:8080/picture
```

### Parámetros de la solicitud

La solicitud debe incluir un parámetro llamado `file` que contenga el archivo de imagen que deseas cargar.

### Ejemplo de solicitud usando cURL

Aquí tienes un ejemplo de cómo hacer una solicitud de carga de imagen utilizando cURL:

```
curl -X POST -F "file=@/ruta/de/tu/archivo.jpg" localhost:8080/picture
```

Asegúrate de reemplazar `/ruta/de/tu/archivo.jpg` con la ruta local donde se encuentra tu archivo de imagen.

## Buenas prácticas de programación

Para mantener un código limpio y mantenible, se recomienda seguir estas buenas prácticas de programación:

1. Utilizar nombres de variables y funciones descriptivos y significativos.
2. Comentar el código para explicar su funcionalidad y facilitar su comprensión.
3. Seguir el principio de responsabilidad única, asegurando que cada clase o método tenga una única responsabilidad.
4. Mantener un formato de código consistente y legible.
5. Utilizar pruebas unitarias para garantizar la funcionalidad correcta del microservicio.
6. Aplicar los principios SOLID para mejorar la estructura y la calidad del código.

Recuerda revisar la documentación del proyecto para obtener más detalles sobre la implementación y las características adicionales disponibles.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir a este proyecto, sigue los siguientes pasos:

1. Haz un fork del repositorio.
2. Crea una rama nueva para tu contribución.
3. Realiza los cambios y mejoras necesarios.
4. Asegúrate de que todas las pruebas pasen correctamente.
5. Envía una solicitud de extracción (pull request) describiendo tus cambios y las mejoras que aportan al proyecto.

## Licencia

Este proyecto está bajo la Licencia MIT. Puedes consultar el archivo `LICENSE` para obtener más información.

---
Esperamos que este microservicio de carga de imágenes sea útil para tus proyectos. Si tienes alguna pregunta o sugerencia, no dudes en contactarme. ¡Gracias por usar Archivos!

Desarrollado por Bryan A. Granados Percy
