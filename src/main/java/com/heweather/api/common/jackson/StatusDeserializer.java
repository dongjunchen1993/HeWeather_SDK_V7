package com.heweather.api.common.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Strings;
import com.heweather.api.common.StatusEnum;

import java.io.IOException;

/**
 * @author djc
 * @date 2020-09-06 17:16:08
 */
public class StatusDeserializer extends JsonDeserializer<StatusEnum> {

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser != null && !Strings.isNullOrEmpty(jsonParser.getText())) {
            return StatusEnum.codeOf(jsonParser.getText());
        } else {
            return StatusEnum.UNKNOWN;
        }
    }
}
