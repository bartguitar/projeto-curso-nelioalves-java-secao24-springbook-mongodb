package com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

    public static String decodeParam(String text) {

        try {
            return  URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }

    }
}
