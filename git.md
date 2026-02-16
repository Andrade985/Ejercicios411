···1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto normal?

Un repositorio en Git es un proyecto que tiene control de versiones, lo que permite guardar el historial de cambios realizados en los archivos. A diferencia de un proyecto normal, el repositorio incluye una carpeta oculta llamada .git donde se almacena toda la información del historial, versiones, ramas y configuración.

···2. ¿Cuáles son las tres áreas principales de Git y qué papel cumple cada una?

Las tres áreas principales son:

- **Directorio de trabajo:** donde se editan los archivos normalmente.

- **Area de preparacion:** área temporal donde se preparan los cambios antes de confirmarlos.

- **Repositorio:** donde Git guarda permanentemente los cambios mediante commits.

···3. ¿Cómo representa Git los cambios internamente?

Git usa objetos internos llamados:

- **gota:** almacena el contenido de los archivos.

- **arbol**: representa carpetas y estructura del proyecto.

- **comprometerse:** guarda una versión del proyecto con información del autor y cambios.

- **etiqueta:** marca versiones importantes del proyecto.

···4. ¿Cómo se crea un commit y qué información almacena?

Un commit se crea con el comando git commit -m "mensaje".
Almacena el autor, la fecha, el mensaje del cambio, la referencia al commit anterior y el estado completo del proyecto en ese momento.

···5. ¿Cuál es la diferencia entre git pull y git fetch?

git fetch descarga los cambios del repositorio remoto sin aplicarlos al proyecto local.
git pull descarga los cambios y los fusiona automáticamente con la rama actual.

···6. ¿Qué es un branch (rama) en Git y cómo gestiona los punteros?

Una rama es una línea independiente de desarrollo. Git maneja las ramas como punteros al último commit realizado. Cada nuevo commit mueve ese puntero automáticamente.

···7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

El merge se realiza con git merge nombre-rama.
Los conflictos aparecen cuando dos ramas modifican la misma parte de un archivo. Para resolverlos se edita manualmente el archivo, se eliminan las marcas de conflicto y luego se hace un nuevo commit.

···8. ¿Cómo funciona el área de staging y qué pasa si omito este paso?

El staging sirve para seleccionar qué cambios se incluirán en el commit mediante git add. Si se omite, los cambios no serán guardados en el commit.

···9. ¿Qué es el archivo .gitignore y cómo influye?

El archivo .gitignore indica qué archivos Git no debe rastrear, como archivos temporales, configuraciones locales o dependencias. Esto evita subir archivos innecesarios al repositorio.

···10. ¿Cuál es la diferencia entre commit --amend y un nuevo commit?

git commit --amend modifica el último commit realizado, permitiendo cambiar el mensaje o agregar archivos olvidados.
Un nuevo commit crea un registro adicional sin modificar el historial anterior.

···11. ¿Cómo se utiliza git stash y cuándo es útil?

git stash guarda cambios temporalmente sin hacer commit. Es útil cuando necesitas cambiar de rama rápidamente sin perder el trabajo que aún no está terminado.

···12. ¿Qué mecanismos ofrece Git para deshacer cambios?

Git permite deshacer cambios usando:

- **git reset:** retrocede commits o cambios en staging.

- **git revert:** crea un commit que deshace otro commit anterior.

- **git checkout:** restaura archivos o cambia de rama.

···13. ¿Cómo funciona la configuración de remotos (origin y upstream)?

Origin es el repositorio remoto principal donde normalmente subes tus cambios.
Upstream es el repositorio original del proyecto cuando trabajas con forks. Se usa para mantener tu copia actualizada.

···14. ¿Cómo inspeccionar el historial de commits?

Se puede revisar usando:

- **git log:** muestra el historial completo.

- **git diff:** muestra diferencias entre cambios.

- **git show:** muestra detalles específicos de un commit.