package com.djh.jaxb;

import com.djh.xml.domain.Burger;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author David Hancock
 */
public class JAXBBurgerUnmarshallerTest {

    private JAXBBurgerUnmarshaller jaxbBurgerUnmarshaller = new JAXBBurgerUnmarshaller();

    @Test
    public void testUnmarshaller() {

        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("BurgerSample.xml");

        Burger burger = jaxbBurgerUnmarshaller.unmarshalBurger(inputStream);
        Assert.assertNotNull(burger);
        Assert.assertEquals("Boar", burger.getMeatType());
    }
}
