/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.servicos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author rubia
 */
@WebService
public class ServicoMedia {
        @WebMethod
    public Double media(@WebParam(name = "valor1")
            @XmlElement(required = true) Double valor1,
            @WebParam(name = "valor2")
            @XmlElement(required = true) Double valor2,
            @WebParam(name = "valor3")
            @XmlElement(required = true) Double valor3) {
        return (valor1 + valor2 + valor3)/3;
    }
}
