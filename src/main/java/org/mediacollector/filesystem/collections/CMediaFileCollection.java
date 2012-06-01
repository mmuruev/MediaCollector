package org.mediacollector.filesystem.collections;

import org.apache.commons.vfs.FileObject;
import org.mediacollector.filesystem.interfaces.IMediaFileCollection;

/**
 * Created with IntelliJ IDEA.
 * User: mf
 * Date: 29.05.12
 * Time: 20:23
 * The Class is implementing media file collection
 */
public class CMediaFileCollection implements IMediaFileCollection
{
    /**
     * Get element from collection by name
     *
     * @param sNameMediaFile name of element
     * @return FileObject element
     */
    @Override
    public FileObject get(String sNameMediaFile)
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Replace collection on the new one
     *
     * @param mediaCollection new collection of media files
     */
    @Override
    public void putAll(IMediaFileCollection mediaCollection)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Put new element in collection
     *
     * @param media new element of media file
     */
    @Override
    public void put(FileObject media)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Remove element from collection by name
     *
     * @param sNameMediaFile string with name element for remove
     */
    @Override
    public void remove(String sNameMediaFile)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
