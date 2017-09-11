package com.eisgroup.cb.converters;

import org.primefaces.convert.DoubleConverter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * Created by Titarenko on 05.06.2017 at 13:28.
 */
@FacesConverter("lenientDoubleConverter")
public class LenientDoubleConverter extends DoubleConverter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            return super.getAsObject(context, component, value);
        } catch (ConverterException ignore) {
            return value;
        }
    }
}