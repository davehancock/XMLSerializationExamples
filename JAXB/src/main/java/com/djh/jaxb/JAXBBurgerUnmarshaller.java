package com.djh.jaxb;


import com.djh.xml.domain.Burger;

import javax.xml.bind.JAXBContext;
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
            JAXBContext jaxbContext = JAXBContext.newInstance(Burger.class);
            unmarshaller = jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Burger unmarshalBurger(InputStream xml) {

        Burger burger = null;
        try {
            burger = (Burger) unmarshaller.unmarshal(xml);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return burger;
    }
}
