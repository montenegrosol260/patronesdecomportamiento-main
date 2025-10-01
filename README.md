# Trabajo Práctico - Patrones de Comportamiento

## 📌 Descripción

Este proyecto corresponde al **Trabajo Práctico de Patrones de Comportamiento** de la materia de Programación/Ingeniería de Software.
El sistema simula una **Plataforma de Aprendizaje en Línea**, en la cual se aplican diferentes **patrones de diseño de comportamiento** para resolver problemas típicos de comunicación, control de flujo, estados, estrategias de cálculo y generación de reportes.

Los patrones implementados son:

1. **Chain of Responsibility** → Manejo de solicitudes de tutorías (Asistente, Profesor, Coordinador).
2. **Command** → Inscripción, abandono y solicitud de certificados en cursos.
3. **Iterator** → Recorrido de los cursos inscritos por un alumno.
4. **Mediator** → Comunicación entre alumnos y profesores mediante chat.
5. **Memento** → Guardado y restauración de respuestas en un examen.
6. **Observer** → Notificación de cambios en cursos (avisos, horarios).
7. **State** → Gestión de inscripción de un alumno en un curso.
8. **Strategy** → Cálculo de nota final con distintos criterios (promedio simple, ponderado).
9. **Template Method** → Generación de reportes académicos (cursos y alumnos).
10. **Visitor** → Aplicación de becas o descuentos a distintos tipos de alumnos.

---

## 🎯 Objetivos de aprendizaje

* Comprender el problema que resuelve cada patrón.
* Implementar en Java las estructuras de clases necesarias.
* Practicar principios de diseño: separación de responsabilidades, extensibilidad y mantenimiento.

---

## 🛠️ Tecnologías utilizadas

* **Lenguaje:** Java 8+
* **Gestión de dependencias:** Maven/Gradle (opcional, según configuración)
* **Organización del código:** paquetes por patrón (`chainofresp`, `command`, `iterator`, etc.)

---

## 📂 Estructura del proyecto

```
src/
 ├── ChainOfResp/
 ├── Command/
 ├── Iterator/
 ├── Mediator/
 ├── Memento/
 ├── Observer/
 ├── State/
 ├── Strategy/
 ├── TemplateMethod/
 ├── Visitor/
 └── Main.java
```

---

## ▶️ Ejecución

Compilar y ejecutar desde terminal:

```bash
# Compilación
javac -d out $(find src -name "*.java")

# Ejecución
java -cp out Main
```

Cada bloque de ejecución en `Main` imprime en consola la demostración de un patrón.
Por ejemplo:

* `Ejercicio 1` → Chain of Responsibility
* `Ejercicio 2` → Command
* … hasta `Ejercicio 10` → Visitor

---

## 📋 Ejemplo de salida

Al ejecutar el programa, la consola mostrará resultados como:

```
----------Ejercicio 1----------
Asistente revisa: Cambio de comision
Profesor revisa: Revision de final

----------Ejercicio 2----------
Bruno se inscribe en Matemáticas
Bruno abandona Matemáticas
...
```

*(la salida completa incluye pruebas de los 10 patrones)*

---

## 👥 Autores
Trabajo realizado por:
- Bruno Zaupa
- Candela Fernandez
- Emiliano Echavarria
- Julián Fernandez
- Macarena Copparoni
- Matías Márquez
- Soledad Montenegro
---
