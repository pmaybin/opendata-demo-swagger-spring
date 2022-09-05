package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ConstructionTypeEnum {
    /**
     * ENUM for the construction type, three are shown, however only two are used in the database
     * The first Null enum is a holder as the others do not pass correctly when either is the first enum*/
    NULL,
    MASONRY,
    FRAME
}