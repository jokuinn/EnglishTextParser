package com.reut.textParser.logic;

public class Calculator {
    private final static String DOUBLE_LETTER = "([a-z])\\1+";
    private final static String WORDS_ENDING_E = "([a-zA-Z]+)(e|E)(\\W|$)";
    private final static String ARTICLE_REGEX_INSIDE = "\\W(a|A|The|the|An|an)\\W";
    private final static String ARTICLE_REGEX_START_OR_END = "^(a|A|The|the|An|an)\\W|\\W(a|A|The|the|An|an)$";
    private final static String ARCTICLE_REGEX_AFTER_THIRD_STEP_INSIDE = "\\W(a|A|Th|th|An|an)\\W";
    private final static String ARTICLE_REGEX_AFTER_THIRD_STEP_START_OR_END = "^(a|A|Th|th|An|an)\\W|\\W(a|A|Th|th|An|an)$";

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
        text = text.replaceAll(WORDS_ENDING_E, "$1$3");
        return text;
    }
    public String removeArticles(String text){
        text = text.replaceAll(ARTICLE_REGEX_START_OR_END, "");
        text = text.replaceAll(ARTICLE_REGEX_INSIDE, " ");
        text = text.replaceAll(ARCTICLE_REGEX_AFTER_THIRD_STEP_INSIDE, " ");
        text = text.replaceAll(ARTICLE_REGEX_AFTER_THIRD_STEP_START_OR_END, "");

        return text;
    }
}