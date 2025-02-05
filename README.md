# Project-Appium

Este proyecto es una suite de pruebas automatizadas para la aplicación móvil de Booking.com, desarrollada utilizando **Appium**, **Java**, **POB** y **Cucumber**. Su objetivo es validar el flujo de reserva en la aplicación, asegurando que las funcionalidades críticas operen correctamente.

## 📌 Tabla de Contenidos
- [Requisitos Previos](#requisitos-previos)
- [Configuración del Proyecto](#configuración-del-proyecto)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Ejecución de las Pruebas](#ejecución-de-las-pruebas)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

---

## ✅ Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes componentes:

- [Java Development Kit (JDK) 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Apache Maven](https://maven.apache.org/)
- [Appium Server](https://appium.io/)
- [Android SDK](https://developer.android.com/studio)
- Un **dispositivo Android** o un **emulador configurado**

---

## ⚙️ Configuración del Proyecto

### 🔹 1. **Clonar el repositorio**
```bash
git clone https://github.com/xcode98/Project-Appium.git
cd Project-Appium/Appium
```

### 🔹 2. **Instalar dependencias**
Ejecuta el siguiente comando para descargar las dependencias del proyecto:
```bash
mvn clean install
```

### 🔹 3. **Configurar Appium**
- Inicia el servidor de **Appium**.
- Asegúrate de que el dispositivo o emulador esté conectado y reconocido por `adb`:
  ```bash
  adb devices
  ```

### 🔹 4. **Configurar el dispositivo**
- Habilita la **depuración USB** en el dispositivo Android.
- Asegúrate de que el dispositivo esté conectado y reconocido por el sistema.

---

## 📁 Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

```
Appium
├── pom.xml
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── pages
│   │   │   │   └── BookingPage.java
│   │   │   ├── steps
│   │   │   │   └── BookingStepDefinitions.java
│   │   │   ├── utilities
│   │   │   │   ├── BasePage.java
│   │   │   │   ├── DriverManager.java
│   │   │   │   └── Logs.java
│   │   └── resources
│   │       └── features
│   │           └── Booking.feature
│   ├── test-output
│   │   ├── screenshots
│   │   ├── reports
│   │   └── logs
```

📌 **Descripción de los archivos principales:**
- **`pom.xml`** → Archivo de configuración de Maven con dependencias.
- **`BookingPage.java`** → Página de objeto con los métodos de interacción con la aplicación.
- **`BookingStepDefinitions.java`** → Definiciones de los pasos de Cucumber para las pruebas.
- **`BasePage.java`** → Clase base con métodos comunes como esperas y manejo de elementos.
- **`Booking.feature`** → Archivo de características de Cucumber en lenguaje Gherkin.

---

## 🚀 Ejecución de las Pruebas

Para ejecutar las pruebas, usa el siguiente comando:
```bash
mvn test
```

📌 **Asegúrate de que:**
1. El **servidor de Appium** esté en funcionamiento.
2. El **dispositivo/emulador** esté encendido y conectado.
3. La **app esté instalada** en el dispositivo.



💡 **Si tienes dudas o sugerencias, no dudes en abrir un Issue o Pull Request en el repositorio.** ¡Gracias por tu interés en este proyecto! 🎯
