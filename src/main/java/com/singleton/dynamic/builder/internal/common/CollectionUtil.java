package com.singleton.dynamic.builder.internal.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Utility class for performing common functions with {@link Collection}s.
 * 
 * @author Dustin Singleton
 */
public class CollectionUtil
{
    /**
     * <p>
     * Copies the specified collection using an unspecified implementation of {@link Collection}.
     * </p>
     * <p>
     * <strong>Note: </strong> this will very likely change the internal implementation of the collection.
     * </p>
     * 
     * @param collectionToCopy
     *            The collection that will be copied.
     * @return the resulting collection, which will have all values from the {@code collectionToCopy}, but could be of a
     *         different implementation.
     */
    public static <T> Collection<T> copyCollection(Collection<T> collectionToCopy)
    {
        if (collectionToCopy == null)
        {
            return new ArrayList<T>(0);
        }

        return new ArrayList<T>(collectionToCopy);
    }

    /**
     * <p>
     * Copies the specified list using an unspecified implementation of {@link List}.
     * </p>
     * <p>
     * <strong>Note: </strong> this will very likely change the internal implementation of the {@link List}.
     * </p>
     * 
     * @param listToCopy
     *            The list that will be copied.
     * @return the resulting list, which will have all values from the {@code listToCopy}, but could be of a different
     *         implementation.
     */
    public static <T> List<T> copyList(List<T> listToCopy)
    {
        if (listToCopy == null)
        {
            return new ArrayList<T>(0);
        }

        return new ArrayList<T>(listToCopy);
    }
}
