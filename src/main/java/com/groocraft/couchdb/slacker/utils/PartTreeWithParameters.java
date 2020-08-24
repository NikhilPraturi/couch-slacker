package com.groocraft.couchdb.slacker.utils;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.query.parser.PartTree;

import java.util.Map;


/**
 * Class to wrapping {@link PartTree} which bares semantic with {@link Map} of named parameters. Together it provides whole information of wanted query. It
 * is used for better pass ability to {@link PartTreeWithParametersSerializer}
 *
 * @author Majlanky
 * @see PartTree
 * @see PartTreeWithParametersSerializer
 */
public class PartTreeWithParameters {

    private final PartTree partTree;
    private final Map<String, Object> parameters;

    public PartTreeWithParameters(@NotNull PartTree partTree, @NotNull Map<String, Object> parameters) {
        this.partTree = partTree;
        this.parameters = parameters;
    }

    public @NotNull Map<String, Object> getParameters() {
        return parameters;
    }

    public @NotNull PartTree getPartTree() {
        return partTree;
    }
}