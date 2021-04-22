package com.example.webservicecorreios;


public class Encomenda {
    private String codigo, prazoEntrega, entregaDomiciliar, entregaSabado;

    public Encomenda(){

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrazoEntrega(){
        return prazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega){
        this.prazoEntrega = prazoEntrega;
    }

    public String getEntregaDomiciliar(){
        return entregaDomiciliar;
    }

    public void setPrazoEntregaDomiciliar(String entregaDomiciliar){
        this.entregaDomiciliar = entregaDomiciliar;
    }

    public String getEntregaSabado() {
        return entregaSabado;
    }

    public void setEntregaSabado(String entregaSabado) {

    }
}
