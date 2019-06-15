package com.sanjuthomas.tdd.tdd;

import junitparams.mappers.DataMapper;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class JSONMapper implements DataMapper {

   private static final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    public Object[] map(Reader reader) {
        try {
            return new Object [] { MAPPER.readValue(reader, Map.class) };
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
    }
}
