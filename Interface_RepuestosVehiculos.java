package com.mycompany.interface_repuestosvehiculos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interface_RepuestosVehiculos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Repuesto> repuestos = new ArrayList<>();
            boolean running = true;
            while (running) {
                System.out.println("1. Agregar repuesto");
                System.out.println("2. Mostrar repuestos");
                System.out.println("3. Salir");
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (choice) {
                    case 1:
                            
                        System.out.print("Ingrese el código del repuesto: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Ingrese el nombre del repuesto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el precio del repuesto: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese el no. de Unidades disponibles del repuesto: ");
                        int stock = scanner.nextInt();
                        scanner.nextLine(); // Consume la línea vacía después del nextInt()
                        System.out.print("Ingrese la descripción del repuesto: ");
                        String descripcion = scanner.nextLine();
                        
                        System.out.print("Ingrese el nombre del proveedor: ");
                        String nombreProveedor = scanner.nextLine();
                        System.out.print("Ingrese la dirección del proveedor: ");
                        String direccionProveedor = scanner.nextLine();
                        System.out.print("Ingrese el teléfono del proveedor: ");
                        String telefonoProveedor = scanner.nextLine();
                        
                        Proveedor proveedor = new Proveedor(nombreProveedor, direccionProveedor, telefonoProveedor);
                        Repuesto repuesto = new Repuesto(codigo, nombre, precio, stock, descripcion, proveedor);
                        repuestos.add(repuesto);
                        System.out.println("Repuesto agregado con éxito.");
                        break;
                        
                    case 2:
                        System.out.println("Lista de repuestos:");
                        for (Repuesto nuevorepuesto : repuestos) {
                            System.out.println("Código: " + nuevorepuesto.getCodigo());
                            System.out.println("Nombre: " + nuevorepuesto.getNombre());
                            System.out.println("Precio: " + nuevorepuesto.getPrecio());
                            System.out.println("Disponibles: " + nuevorepuesto.getStock());
                            System.out.println("Descripción: " + nuevorepuesto.getDescripcion());
                            System.out.println("Proveedor: " + nuevorepuesto.getProveedor().getNombre());
                            System.out.println("-------------------------");
                        }
                        break;
                        
                    case 3:
                        running = false;
                        break;
                        
                    default:
                        System.out.println("Opción no válida");
                }
            }
        }
    }
  }