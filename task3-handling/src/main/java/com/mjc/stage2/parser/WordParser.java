package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        System.out.println("Parsing word");
        char[] array = string.toCharArray();
        for (char el: array) {
            abstractTextComponent.add(new SymbolLeaf(el, TextComponentType.WORD));
        }
    }

    // Write your code here!

}
