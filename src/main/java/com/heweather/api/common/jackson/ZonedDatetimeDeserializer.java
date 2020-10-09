package com.heweather.api.common.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Strings;

import java.io.IOException;
import java.time.ZonedDateTime;

/**
 * @author djc
 * @date 2020-09-06 17:16:08
 */
public class ZonedDatetimeDeserializer extends JsonDeserializer<ZonedDateTime> {


    @Override
    public ZonedDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser != null && !Strings.isNullOrEmpty(jsonParser.getText())) {
            return ZonedDateTime.parse(jsonParser.getText());
        } else {
            return null;
        }
    }
}
