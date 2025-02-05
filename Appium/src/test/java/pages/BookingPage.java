package pages;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BasePage;
import utilities.Logs;

public class BookingPage extends BasePage {

    private final By closeButton = AppiumBy.accessibilityId("Navigate up");

    private final By homePage = AppiumBy.accessibilityId("Sign in");

    private final By campoDestino = AppiumBy.id("com.booking:id/facet_search_box_accommodation_destination");
    private final By textCampoDestino = AppiumBy.className("android.widget.EditText");
    private final By optionDestino = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(1)");


    private final By fechaInicio = AppiumBy.accessibilityId("14 February 2025");
    private final By fechaFin = AppiumBy.accessibilityId("28 February 2025");
    private final By buttonSelectDates = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.booking:id/facet_date_picker_confirm\")");


    private final By campoPasajeros = AppiumBy.id("com.booking:id/facet_search_box_accommodation_occupancy");


    private final By botonBuscar = AppiumBy.id("com.booking:id/search_search");
    private final By buttonPlusChildren = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.booking:id/bui_input_stepper_add_button\").instance(2)");
    private final By optionMenor1year = AppiumBy.androidUIAutomator("new UiSelector().text(\"< 1 year old\")");
    private final By option1year = AppiumBy.androidUIAutomator("new UiSelector().text(\"1 year old\")");
    private final By option2year = AppiumBy.androidUIAutomator("new UiSelector().text(\"2 years old\")");
    private final By option3year = AppiumBy.androidUIAutomator("new UiSelector().text(\"3 years old\")");
    private final By option4year = AppiumBy.androidUIAutomator("new UiSelector().text(\"4 years old\")");
    private final By option5year = AppiumBy.androidUIAutomator("new UiSelector().text(\"5 years old\")");
    private final By buttonOKKids = AppiumBy.id("android:id/button1");
    private final By buttonAply = AppiumBy.id("com.booking:id/group_config_apply_button");

    private final By buttonSearch = AppiumBy.id("com.booking:id/facet_search_box_cta");


    private final By placeTwo = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(32)");


    //Capturando todos los precios a lo largo del flujo
    private final By firstPrice = AppiumBy.androidUIAutomator("new UiSelector().text(\"US$10,760\")");
    private final By secondPrice = AppiumBy.id("com.booking:id/price_view_price");
    private final By thirdPrice = AppiumBy.id("com.booking:id/recommended_block_subtotal_price_view");
    private final By fourthPrice = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.booking:id/title\")");
    private final By fifthPrice = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.booking:id/title\").instance(1)");
    private final By sixthPrice = AppiumBy.androidUIAutomator("new UiSelector().text(\"US$10,760\")");


    private final By buttonSeeYourOptions = AppiumBy.id("com.booking:id/select_room_cta");
    private final By selectRooms = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.booking:id/room_linear_layout\")");

    private final By buttonReserve = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.booking:id/main_action\")");


    private final By inputFirstName = AppiumBy.id("com.booking:id/bstage1_contact_firstname_value");
    private final By inputLastName = AppiumBy.id("com.booking:id/bstage1_contact_lastname_value");
    private final By inputEmail = AppiumBy.id("com.booking:id/bstage1_contact_email_value");
    private final By inputAddress = AppiumBy.id("com.booking:id/bstage1_contact_address_value");
    private final By inputZipCode = AppiumBy.id("com.booking:id/bstage1_contact_zipcode_value");
    private final By inputCity = AppiumBy.id("com.booking:id/bstage1_contact_city_value");
    private final By labelCity = AppiumBy.androidUIAutomator("new UiSelector().text(\"City *\")");

    //private final By inputCountry = AppiumBy.id("com.booking:id/bstage1_contact_firstname_value");
    private final By inputPhone = AppiumBy.id("com.booking:id/bstage1_contact_telephone_value");
    private final By buttonNextStep = AppiumBy.id("com.booking:id/action_button");
    String tercerprice = "com.booking:id/subtitle";

    String checkIn = "com.booking:id/checkin_date"; //Fri Feb 14 2025
    String checkOut = "com.booking:id/checkout_date"; //Fri Feb 28 2025

    private final By buttonFinalStep = AppiumBy.id("com.booking:id/action_button");


    String priceFinal = "com.booking:id/subtitle";

    private final By inputCardNumber = AppiumBy.id("com.booking:id/new_credit_card_number_input_layout");
    private final By inputHoldersName = AppiumBy.id("com.booking:id/new_credit_card_holder_input_layout"); // holders name verificar nombre y ape
    private final By inputExpirationDate = AppiumBy.id("com.booking:id/new_credit_card_expiry_date_input_layout");


    //max a;o 35

    public void abrirApp() {
        // Lógica para asegurarse de que la app está abierta
        waitPageToLoad();
        find(closeButton).click();
    }

    public void ingresarDestino(String destino) {
        WebElement destinoField = waitForDisplayed(campoDestino, 10); // Espera hasta 10s
        destinoField.click(); // Clic en el campo de destino


        WebElement inputField = find(textCampoDestino); // Esperar y obtener el campo de texto
        inputField.clear(); // Limpiar el campo antes de escribir
        inputField.sendKeys(destino); // Ingresar el destino


        find(optionDestino).click();

    }


    public void seleccionarFechas() {
        //find(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + fechaInicio + "\")")).click();
        //find(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + fechaFin + "\")")).click();
        WebElement inicioField = waitForDisplayed(fechaInicio, 10);
        inicioField.click();
        WebElement destinoField = waitForDisplayed(fechaFin, 10);
        destinoField.click();
        find(buttonSelectDates).click();
    }

    public void seleccionarPersonas() {
        sleep(1500);
        find(campoPasajeros).click();
        find(buttonPlusChildren).click();
        waitForDisplayed(optionMenor1year);
        find(optionMenor1year).click();


        find(option1year).click();
        sleep(500);
        find(option2year).click();
        sleep(500);
        find(option3year).click();
        sleep(500);
        find(option4year).click();
        sleep(500);
        find(option5year).click();

        find(buttonOKKids).click();
        sleep(500);

        find(buttonAply).click();
        /*
         */
    }

    public void presionarBotonBusqueda() {
        find(buttonSearch).click();
    }

    public void seleccionarHotel() {
        sleep(3000);

        find(placeTwo).click();
    }


    public void seleccionarHabitacion() {
        sleep(2000);

        waitForDisplayed(buttonSeeYourOptions);
        find(buttonSeeYourOptions).click();

        waitForDisplayed(selectRooms);
        find(selectRooms).click();


        sleep(2000);
        find(buttonReserve).click();
    }


    public void llenarDatosHuesped() {
        WebElement campoNombre = waitForDisplayed(inputFirstName, 10);
        campoNombre.click();
        new Actions(getDriver()).sendKeys("Francis").perform();

        WebElement campoApellido = waitForDisplayed(inputLastName, 10);
        campoApellido.click();
        new Actions(getDriver()).sendKeys("Silva").perform();

        WebElement campoEmail = waitForDisplayed(inputEmail, 20);
        campoEmail.click();
        new Actions(getDriver()).sendKeys("xcode98@hotmail.com").perform();  //validar formato correo


        WebElement campoDireccion = waitForDisplayed(inputAddress, 10);
        campoDireccion.click();
        new Actions(getDriver()).sendKeys("Av. Jiron de la union").perform();

        WebElement campoZipCode = waitForDisplayed(inputZipCode, 10);
        campoZipCode.click();
        new Actions(getDriver()).sendKeys("5162").perform();

        WebElement campoCiudad = waitForDisplayed(inputCity, 10);
        campoCiudad.click();
        new Actions(getDriver()).sendKeys("Lima").perform();
        find(labelCity).click();


        WebElement campoCelular = waitForDisplayed(inputPhone, 10);
        campoCelular.click();
        sleep(2000);
        new Actions(getDriver()).sendKeys("97642765").perform(); //Validar que el minimo sea 8 caracteres
        sleep(2000);


        find(buttonNextStep).click();
        sleep(1000);

    }


    public void verificarReserva() {


        find(buttonFinalStep).click();
    }


    public void seleccionarFormaPago() {


        //validaciones en fechas y el footer
        WebElement campoCardNumber = waitForDisplayed(inputCardNumber, 10);
        campoCardNumber.click();
        new Actions(getDriver()).sendKeys("4212736526456544").perform();

        WebElement campoVencimiento = waitForDisplayed(inputExpirationDate, 10);
        campoVencimiento.click();
        new Actions(getDriver()).sendKeys("1135").perform();
        sleep(15000);

    }


    @Override
    public void waitPageToLoad() {
        Logs.info("Esperando que la página de Booking.com cargue completamente...");
        waitPage(closeButton, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando que la página de Booking.com se haya cargado correctamente.");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(homePage).isDisplayed())
        );
    }
}
