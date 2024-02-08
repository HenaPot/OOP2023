package org.example.lab11;

public class task3 {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.setTextFormatter(new UpperCaseFormatter());
        System.out.println(textEditor.formatText("hehe maja"));
    }
}

interface TextFormatter {
    public String formatText(String text);
}

class UpperCaseFormatter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}

class LowerCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}

class CamelCaseFormatter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text;
    }
}

class TextEditor {
    TextFormatter textFormatter;

    public TextFormatter getTextFormatter() {
        return textFormatter;
    }

    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public String formatText(String text) {
        return textFormatter.formatText(text);
    }
}
