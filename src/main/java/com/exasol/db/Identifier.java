package com.exasol.db;

/**
 * Interface for database object identifiers.
 */
public interface Identifier {
    /**
     * Get the identifier as a {@link String}.
     *
     * @return identifier string
     */
    String toString();

    /**
     * Get the quoted identifier as a {@link String}.
     *
     * @return quoted identifier
     */
    String quote();
}