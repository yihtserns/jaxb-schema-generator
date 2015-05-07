package com.github.yihtserns.jaxb.schema.generator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yihtserns
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {

    @XmlAttribute
    private String value;
}
