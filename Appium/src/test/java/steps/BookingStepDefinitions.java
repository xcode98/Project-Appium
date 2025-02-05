package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BookingPage;
import utilities.CommonFlows;

public class BookingStepDefinitions {

    private final CommonFlows commonFlows = new CommonFlows();
    private final BookingPage bookingPage = new BookingPage();

    @Given("El usuario abre la aplicacion de Booking.com")
    public void abrirAplicacion() throws InterruptedException {
        bookingPage.abrirApp();

    }

    @When("Ingresa la ciudad {string}")
    public void ingresarCiudad(String ciudad) {
        bookingPage.ingresarDestino(ciudad);
    }


    @When("Selecciona las fechas del del viaje")
    public void seleccionarFechas() {
        bookingPage.seleccionarFechas();
    }


    @When("Seleccionando pasajeros")
    public void seleccionarPasajeros() {
        bookingPage.seleccionarPersonas();
    }

    @When("Presiona el boton Buscar")
    public void presionarBoton() {
        bookingPage.presionarBotonBusqueda();
    }


    @When("Selecciona la segunda opcion de la lista de hoteles")
    public void seleccionarSegundoHotel() {
        bookingPage.seleccionarHotel();
    }


    @When("Selecciona la primera opcion de habitacion disponible")
    public void seleccionarPrimeraOpcion() {
        bookingPage.seleccionarHabitacion();
    }

    @When("Llena los datos del huesped con nombre")
    public void llenarDatosHuesped() {
        bookingPage.llenarDatosHuesped();
    }

    @When("Verifica los datos de la reserva y continuar")
    public void verificarReservaContinuar() {
        bookingPage.verificarReserva();
    }

    @When("Verifica los datos y elige la forma de pago")
    public void seleccionarFormaPagoandVerify() {
        bookingPage.seleccionarFormaPago();
    }

}
