package org.mediacollector.filesystem.collections.node.files;

import org.apache.commons.vfs.FileObject;
import org.mediacollector.filesystem.interfaces.node.files.ICoverFilesCollection;

/**
 * Created with IntelliJ IDEA.
 * User: mf
 * Date: 01.06.12
 * Time: 18:52
 */
public class CCoverFiles implements ICoverFilesCollection
{
    /**
     * Get cover element from collection by name
     *
     * @param sNameCoverFile name for search in collection
     * @return element from collection if exist
     */
    @Override
    public FileObject get(String sNameCoverFile)
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Replace collection on the new one.
     *
     * @param coversCollection new collection
     */
    @Override
    public void putAll(ICoverFilesCollection coversCollection)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Put a new cover element in collection
     *
     * @param cover new element
     */
    @Override
    public void put(FileObject cover)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Remove element from collection by name
     *
     * @param sNameCover name element for remove
     */
    @Override
    public void remove(String sNameCover)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
