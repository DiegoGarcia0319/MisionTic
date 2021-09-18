/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioambiental_dron.usuario;

/**
 *
 * @author Acer
 */
public class Usuario {
    public String Nombre;
    public int Identificacion;
    public String Email;
    public int Edad;
    public String Area;
    public boolean JefeArea;
    public float Salario;

    public Usuario(String Nombre, int Identificacion, String Email, int Edad, String Area, boolean JefeArea) {
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        this.Email = Email;
        this.Edad = Edad;
        this.Area = Area;
        this.JefeArea = JefeArea;
        this.Salario = Salario;
              
        }

    public void info(){
        
        float SalarioDesarrollador = (4500000.0f - (4500000.0f* 0.08f)-(4500000.0f* 0.01f) );
        float SalarioDesarrolladorJefe = (4500000.0f + 2500000.0f -(7000000.0f * 0.08f)-(7000000.0f* 0.01f) );
        float SalarioAdministrativo = (3500000.0f - (3500000.0f* 0.08f));
        float SalarioJefeAdministrativo = (3500000.0f + 3000000.0f - (6500000.0f* 0.08f)-(6500000.0f* 0.01f));

        if (Area == "desarrollo" && JefeArea == true){
            Salario = SalarioDesarrolladorJefe;
                    }
        if (Area == "desarrollo" && JefeArea == false){
            Salario = (SalarioDesarrollador);
                    }
        if (Area == "administrativa" && JefeArea == true){
            Salario = SalarioJefeAdministrativo;
                    }
        if (Area == "administrativa" && JefeArea == false){
            Salario = SalarioAdministrativo;
                    }
 
        System.out.print("[Usuario]:"+"\n");
        System.out.print("Nombre: " + Nombre + "\n");
        System.out.print("Identificacion: " + Identificacion + "\n");
        System.out.print("Email: " + Email + "\n");
        System.out.print("Edad: " + Edad + "\n");
        System.out.print("Area: " + Area + "\n");
        System.out.print("Salario: " + Salario + "\n");
        
        }
       
    }
    
    
    
    