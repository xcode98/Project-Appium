Project-Appium
Este proyecto es una suite de pruebas automatizadas para la aplicación móvil de Booking.com, desarrollada utilizando Appium y Java. El objetivo es validar el flujo de reserva en la aplicación, asegurando que las funcionalidades críticas operen correctamente.

Tabla de Contenidos
Requisitos Previos
Configuración del Proyecto
Estructura del Proyecto
Ejecución de las Pruebas
Contribuciones
Licencia
Requisitos Previos
Antes de comenzar, asegúrate de tener instalados los siguientes componentes:

Java Development Kit (JDK) 17
Apache Maven
Appium Server
Android SDK
Un dispositivo Android o un emulador configurado
Configuración del Proyecto
Clonar el repositorio:

bash
Copiar
Editar
git clone https://github.com/xcode98/Project-Appium.git
cd Project-Appium/Appium
Instalar dependencias:

Ejecuta el siguiente comando para descargar las dependencias del proyecto:

bash
Copiar
Editar
mvn clean install
Configurar Appium:

Inicia el servidor de Appium.
Asegúrate de que el dispositivo o emulador esté conectado y reconocido por adb.
Configurar el dispositivo:

Habilita la depuración USB en el dispositivo Android.
Asegúrate de que el dispositivo esté conectado y reconocido por el sistema.
Estructura del Proyecto
El proyecto está organizado de la siguiente manera:

bash
Copiar
Editar
Appium
├── pom.xml
├── src
    ├── test
        ├── java
        │   ├── pages
        │   │   └── BookingPage.java
        │   ├── steps
        │   │   └── BookingStepDefinitions.java
        │   └── utilities
        │       └── BasePage.java
        └── resources
            └── features
                └── Booking.feature
pom.xml: Archivo de configuración de Maven que contiene las dependencias y configuraciones del proyecto.
BookingPage.java: Página de objeto que contiene los métodos para interactuar con la aplicación de Booking.com.
BookingStepDefinitions.java: Definiciones de los pasos de Cucumber para las pruebas.
BasePage.java: Clase base que proporciona métodos comunes para las páginas.
Booking.feature: Archivo de características de Cucumber que describe el flujo de prueba en lenguaje Gherkin.
Ejecución de las Pruebas
Para ejecutar las pruebas, utiliza el siguiente comando de Maven:

bash
Copiar
Editar
mvn test
Asegúrate de que el servidor de Appium esté en funcionamiento y que el dispositivo o emulador esté conectado antes de ejecutar las pruebas.
