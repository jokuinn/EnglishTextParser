package com.reut.textParser.logic;

public class Calculator {
    private final static String DOUBLE_LETTER = "([a-z])\\1+";
    private final static String ARTICLE_REGEX_INSIDE = "\\W(a|A|The|the|An|an)\\W";
    private final static String ARTICLE_REGEX_START_OR_END = "^(a|A|The|the|An|an)\\W|\\W(a|A|The|the|An|an)$";

    public String removeC(String text){
        text = text.replaceAll("ci", "si");
        text = text.replaceAll("ce", "se");
        text = text.replaceAll("ck", "k");
        text = text.replaceAll("c", "k");
        return text;
    }

    public String removeDoubleLetter(String text){
        text = text.replaceAll("ee", "i");
        text = text.replaceAll("oo", "u");
        text = text.replaceAll(DOUBLE_LETTER,"$1");
        return text;
    }

    public String removeE(String text){
        if (text.length() > 1 & text.endsWith("e")){
            text = text.substring(0, text.length() - 1);
        }
        return text;
    }
    public String removeArticles(String text){
        text = text.replaceAll(ARTICLE_REGEX_START_OR_END, "");
        text = text.replaceAll(ARTICLE_REGEX_INSIDE, " ");
        return text;
    }
}