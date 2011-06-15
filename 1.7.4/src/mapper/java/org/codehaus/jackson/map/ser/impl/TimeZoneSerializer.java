package org.codehaus.jackson.map.ser.impl;

import java.io.IOException;
import java.util.TimeZone;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.ScalarSerializerBase;

/**
 * @since 1.8
 */
public class TimeZoneSerializer
    extends ScalarSerializerBase<TimeZone>
{
    public final static TimeZoneSerializer instance = new TimeZoneSerializer();
    
    public TimeZoneSerializer() { super(TimeZone.class); }

    @Override
    public void serialize(TimeZone value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonGenerationException
    {
        jgen.writeString(value.getID());
    }
}