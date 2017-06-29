/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList; 
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



/**
 *
 * @author alumno
 */
public class Factura {

    private ArrayList<ItemFactura> itemFactura = new ArrayList();    
    private ArrayList<FormaCobro> formaCobro = new ArrayList();
    private Cliente cliente;
    private Date fecha;
    private Integer numero;
    
    public ArrayList<ItemFactura> getItemFactura() {
        return itemFactura;
    }
    public void agregarItem(ItemFactura pItemFactura){
       itemFactura.add(pItemFactura);
    }
    
    public ArrayList<FormaCobro> getFormaCobro() {
            return formaCobro;
       }             
    public void agregarFormaCobro(FormaCobro pFormaCobro){
       formaCobro.add(pFormaCobro);
       }
   

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getNumero() {
        return numero;
    }

    
       
    
}
