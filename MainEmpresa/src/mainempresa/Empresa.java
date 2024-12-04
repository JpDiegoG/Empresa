package mainempresa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Empresa {
    private String nombre;
    private String ruc;
    private String Direccion;
    private String email;
    private final List<Empleado> empleados;

    public Empresa(String nombre, String ruc, String Direccion, String email) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.Direccion = Direccion;
        this.email = email;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleados(Empleado empleado){
            empleados.add(empleado);
            System.out.println("Empleado agregado con exito: " +empleado);
    }
    
    public void eliminarEmpleados(String eliminar){
        boolean eliminado = false;
            Iterator<Empleado> it = empleados.iterator();
            while(it.hasNext()){
                Empleado empleado = it.next();
                String primerNombre = empleado.getNombre().split(" ")[0].trim();
                
                if (empleado.getNombre().trim().equalsIgnoreCase(eliminar.trim()) ||
                    primerNombre.equalsIgnoreCase(eliminar.trim()) ||
                    empleado.getCedula().equalsIgnoreCase(eliminar.trim()) ||
                    String.valueOf(empleado.getSalario()).equals(eliminar.trim())) {
                    it.remove();
                    eliminado = true;
                    System.out.println("Empleado eliminado: " + empleado);
            }
    }
        if (!eliminado) {
        System.out.println("No se encontró ningún empleado con el criterio: " + eliminar);
        }
}
    
    public void mostrarEmpleados(){
        if(empleados.isEmpty()){
            System.out.println("No hay empleados registrados");
        }else{
            empleados.forEach(System.out::println);
        
        }
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}