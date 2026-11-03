package Modelo;

import Excepciones.PedidoVacioException;
import Excepciones.UsuarioErrException;

public class Ventas {
    private int Totventas, Ticket, totalPrecio;

    public Ventas() {
    }

    public Ventas(int Totventas, int Ticket, int totalPrecio) {
        this.Totventas = Totventas;
        this.Ticket = Ticket;
        this.totalPrecio = totalPrecio;
    }

    public int getTotventas() {
        return Totventas;
    }

    public void setTotventas(int Totventas) {
        if(Totventas <= 0){
            throw new UsuarioErrException("No puede haber ventas negativas");
        }this.Totventas = Totventas;
    }

    public int getTicket() {
        return Ticket;
    }

    public void setTicket(int Ticket) {
        this.Ticket = Ticket;
    }

    public int getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(int totalPrecio) throws PedidoVacioException {
        int sumPrecio = 0;
        if( sumPrecio <= 0){
        throw new PedidoVacioException("Para generar Ticket necesitas al menos 1 elemento");
        }
        this.totalPrecio = totalPrecio;
    }

    private static class TicketVacioException {

        public TicketVacioException() {
        }
    }
    
    
    
}
