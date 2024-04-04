package es.babel;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class Main {
    public static void main(String[] args) throws JsonSyntaxException {
        Gson gson = new Gson();

        Vehiculo vehiculo = new Vehiculo("Toyota", "Yaris");

        String jsonVehiculo = gson.toJson(vehiculo);
        System.out.println("Objeto Vehículo convertido a JSON:");
        System.out.println(jsonVehiculo);

        System.out.println("#####################################");

        Vehiculo vehiculoFromJson = gson.fromJson(jsonVehiculo, Vehiculo.class);
        System.out.println("JSON convertido de vuelta a objeto Vehículo:");
        System.out.println("Marca: " + vehiculoFromJson.getMarca());
        System.out.println("Modelo: " + vehiculoFromJson.getModelo());
    }
}