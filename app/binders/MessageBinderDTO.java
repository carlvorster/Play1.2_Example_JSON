package binders;

import play.data.binding.TypeBinder;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import models.MessageDTO;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import play.data.binding.Global;




@Global
public class MessageBinderDTO implements TypeBinder<MessageDTO> {

    @Override
    public Object bind(String name, Annotation[] annotations, String value, Class actualClass, Type genericType) throws Exception {
        //return new JsonParser().parse(value);
        return new Gson().fromJson(value, MessageDTO.class);
    }
}