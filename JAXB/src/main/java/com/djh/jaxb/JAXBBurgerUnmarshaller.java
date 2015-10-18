package com.djh.jaxb;


import generated.Burger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

/**
 * @author David Hancock
 */
public class JAXBBurgerUnmarshaller {


    private Unmarshaller unmarshaller;

    public JAXBBurgerUnmarshaller() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("generated");
            unmarshaller = jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Burger unmarshalBurger(InputStream xml) {

        Burger burger = null;
        try {
            burger = (Burger) ((JAXBElement) unmarshaller.unmarshal(xml)).getValue();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return burger;
    }
}
