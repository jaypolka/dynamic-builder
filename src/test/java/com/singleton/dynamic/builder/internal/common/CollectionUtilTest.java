package com.singleton.dynamic.builder.internal.common;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

/**
 * Test class for {@link CollectionUtil}.
 * 
 * @author Dustin Singleton
 */
@SuppressWarnings({ "javadoc" })
public class CollectionUtilTest
{
    @Test
    public void testCopyCollections_sameValues()
    {
        String value1 = "value1";
        String value2 = "value2";
        Collection<String> originalCollection = Arrays.asList(value1, value2);

        Collection<String> copiedCollection = CollectionUtil.copyCollection(originalCollection);

        assertThat(copiedCollection.size(), is(originalCollection.size()));
        assertThat(copiedCollection, is(originalCollection));
    }

    @Test
    public void testCopyCollections_emptyValues()
    {
        assertThat(CollectionUtil.copyCollection(null).size(), is(0));
    }

    @Test
    public void testCopyLists_sameValues()
    {
        String value1 = "value1";
        String value2 = "value2";
        List<String> originalList = Arrays.asList(value1, value2);

        List<String> copiedList = CollectionUtil.copyList(originalList);

        assertThat(copiedList.size(), is(originalList.size()));
        assertThat(copiedList, is(originalList));
    }

    @Test
    public void testCopyLists_emptyValues()
    {
        assertThat(CollectionUtil.copyList(null).size(), is(0));
    }
}