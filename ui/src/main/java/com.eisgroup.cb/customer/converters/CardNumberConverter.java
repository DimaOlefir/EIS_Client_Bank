package com.eisgroup.cb.customer.converters;

import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Created by Titarenko on 18.06.2017 at 16:02.
 */
@Component
@FacesConverter("cardNumberConverter")
public class CardNumberConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return value;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        StringBuilder str = new StringBuilder(String.valueOf(value));
        str.insert(4," ");
        str.insert(9," ");
        str.insert(14," ");
        str.replace(7, 14, "** ****");
        return str.toString();
    }
}